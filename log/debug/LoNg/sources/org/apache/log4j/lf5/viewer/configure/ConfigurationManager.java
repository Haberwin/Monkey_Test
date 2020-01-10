package org.apache.log4j.lf5.viewer.configure;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.tree.TreePath;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.LogLevelFormatException;
import org.apache.log4j.lf5.util.StreamUtils;
import org.apache.log4j.lf5.viewer.LogBrokerMonitor;
import org.apache.log4j.lf5.viewer.LogTable;
import org.apache.log4j.lf5.viewer.LogTableColumn;
import org.apache.log4j.lf5.viewer.LogTableColumnFormatException;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ConfigurationManager {
    private static final String BLUE = "blue";
    private static final String CATEGORY = "category";
    private static final String COLORLEVEL = "colorlevel";
    private static final String COLUMN = "column";
    private static final String CONFIG_FILE_NAME = "lf5_configuration.xml";
    private static final String EXPANDED = "expanded";
    private static final String FIRST_CATEGORY_NAME = "Categories";
    private static final String GREEN = "green";
    private static final String LEVEL = "level";
    private static final String NAME = "name";
    private static final String NDCTEXTFILTER = "searchtext";
    private static final String PATH = "path";
    private static final String RED = "red";
    private static final String SELECTED = "selected";
    private LogBrokerMonitor _monitor = null;
    private LogTable _table = null;

    public ConfigurationManager(LogBrokerMonitor monitor, LogTable table) {
        this._monitor = monitor;
        this._table = table;
        load();
    }

    public void save() {
        CategoryNode root = this._monitor.getCategoryExplorerTree().getExplorerModel().getRootCategoryNode();
        StringBuffer xml = new StringBuffer(StreamUtils.DEFAULT_BUFFER_SIZE);
        openXMLDocument(xml);
        openConfigurationXML(xml);
        processLogRecordFilter(this._monitor.getNDCTextFilter(), xml);
        processLogLevels(this._monitor.getLogLevelMenuItems(), xml);
        processLogLevelColors(this._monitor.getLogLevelMenuItems(), LogLevel.getLogLevelColorMap(), xml);
        processLogTableColumns(LogTableColumn.getLogTableColumns(), xml);
        processConfigurationNode(root, xml);
        closeConfigurationXML(xml);
        store(xml.toString());
    }

    public void reset() {
        deleteConfigurationFile();
        collapseTree();
        selectAllNodes();
    }

    public static String treePathToString(TreePath path) {
        StringBuffer sb = new StringBuffer();
        Object[] objects = path.getPath();
        for (int i = 1; i < objects.length; i++) {
            CategoryNode n = objects[i];
            if (i > 1) {
                sb.append(".");
            }
            sb.append(n.getTitle());
        }
        return sb.toString();
    }

    protected void load() {
        File file = new File(getFilename());
        if (file.exists()) {
            try {
                Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                processRecordFilter(doc);
                processCategories(doc);
                processLogLevels(doc);
                processLogLevelColors(doc);
                processLogTableColumns(doc);
            } catch (Exception e) {
                System.err.println(new StringBuffer().append("Unable process configuration file at ").append(getFilename()).append(". Error Message=").append(e.getMessage()).toString());
            }
        }
    }

    protected void processRecordFilter(Document doc) {
        Node n = doc.getElementsByTagName(NDCTEXTFILTER).item(0);
        if (n != null) {
            String text = getValue(n.getAttributes(), NAME);
            if (text != null && !text.equals("")) {
                this._monitor.setNDCLogRecordFilter(text);
            }
        }
    }

    protected void processCategories(Document doc) {
        int j;
        CategoryExplorerTree tree = this._monitor.getCategoryExplorerTree();
        CategoryExplorerModel model = tree.getExplorerModel();
        NodeList nodeList = doc.getElementsByTagName(CATEGORY);
        if (getValue(nodeList.item(0).getAttributes(), NAME).equalsIgnoreCase(FIRST_CATEGORY_NAME)) {
            j = 1;
        } else {
            j = 0;
        }
        int i = nodeList.getLength() - 1;
        while (i >= j) {
            boolean z;
            NamedNodeMap map = nodeList.item(i).getAttributes();
            CategoryNode chnode = model.addCategory(new CategoryPath(getValue(map, PATH)));
            if (getValue(map, SELECTED).equalsIgnoreCase("true")) {
                z = true;
            } else {
                z = false;
            }
            chnode.setSelected(z);
            if (getValue(map, EXPANDED).equalsIgnoreCase("true")) {
                tree.expandPath(model.getTreePathToRoot(chnode));
                i--;
            } else {
                tree.expandPath(model.getTreePathToRoot(chnode));
                i--;
            }
        }
    }

    protected void processLogLevels(Document doc) {
        NodeList nodeList = doc.getElementsByTagName(LEVEL);
        Map menuItems = this._monitor.getLogLevelMenuItems();
        for (int i = 0; i < nodeList.getLength(); i++) {
            NamedNodeMap map = nodeList.item(i).getAttributes();
            try {
                ((JCheckBoxMenuItem) menuItems.get(LogLevel.valueOf(getValue(map, NAME)))).setSelected(getValue(map, SELECTED).equalsIgnoreCase("true"));
            } catch (LogLevelFormatException e) {
            }
        }
    }

    protected void processLogLevelColors(Document doc) {
        NodeList nodeList = doc.getElementsByTagName(COLORLEVEL);
        LogLevel.getLogLevelColorMap();
        int i = 0;
        while (i < nodeList.getLength()) {
            Node n = nodeList.item(i);
            if (n != null) {
                NamedNodeMap map = n.getAttributes();
                try {
                    LogLevel level = LogLevel.valueOf(getValue(map, NAME));
                    Color c = new Color(Integer.parseInt(getValue(map, RED)), Integer.parseInt(getValue(map, GREEN)), Integer.parseInt(getValue(map, BLUE)));
                    if (level != null) {
                        level.setLogLevelColorMap(level, c);
                    }
                } catch (LogLevelFormatException e) {
                }
                i++;
            } else {
                return;
            }
        }
    }

    protected void processLogTableColumns(Document doc) {
        NodeList nodeList = doc.getElementsByTagName(COLUMN);
        Map menuItems = this._monitor.getLogTableColumnMenuItems();
        List selectedColumns = new ArrayList();
        int i = 0;
        while (i < nodeList.getLength()) {
            Node n = nodeList.item(i);
            if (n != null) {
                NamedNodeMap map = n.getAttributes();
                try {
                    LogTableColumn column = LogTableColumn.valueOf(getValue(map, NAME));
                    JCheckBoxMenuItem item = (JCheckBoxMenuItem) menuItems.get(column);
                    item.setSelected(getValue(map, SELECTED).equalsIgnoreCase("true"));
                    if (item.isSelected()) {
                        selectedColumns.add(column);
                    }
                } catch (LogTableColumnFormatException e) {
                }
                if (selectedColumns.isEmpty()) {
                    this._table.setDetailedView();
                } else {
                    this._table.setView(selectedColumns);
                }
                i++;
            } else {
                return;
            }
        }
    }

    protected String getValue(NamedNodeMap map, String attr) {
        return map.getNamedItem(attr).getNodeValue();
    }

    protected void collapseTree() {
        CategoryExplorerTree tree = this._monitor.getCategoryExplorerTree();
        for (int i = tree.getRowCount() - 1; i > 0; i--) {
            tree.collapseRow(i);
        }
    }

    protected void selectAllNodes() {
        Enumeration all = this._monitor.getCategoryExplorerTree().getExplorerModel().getRootCategoryNode().breadthFirstEnumeration();
        while (all.hasMoreElements()) {
            ((CategoryNode) all.nextElement()).setSelected(true);
        }
    }

    protected void store(String s) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(getFilename()));
            writer.print(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void deleteConfigurationFile() {
        try {
            File f = new File(getFilename());
            if (f.exists()) {
                f.delete();
            }
        } catch (SecurityException e) {
            System.err.println(new StringBuffer().append("Cannot delete ").append(getFilename()).append(" because a security violation occured.").toString());
        }
    }

    protected String getFilename() {
        String home = System.getProperty("user.home");
        String sep = System.getProperty("file.separator");
        return new StringBuffer().append(home).append(sep).append("lf5").append(sep).append(CONFIG_FILE_NAME).toString();
    }

    private void processConfigurationNode(CategoryNode node, StringBuffer xml) {
        CategoryExplorerModel model = this._monitor.getCategoryExplorerTree().getExplorerModel();
        Enumeration all = node.breadthFirstEnumeration();
        while (all.hasMoreElements()) {
            CategoryNode n = (CategoryNode) all.nextElement();
            exportXMLElement(n, model.getTreePathToRoot(n), xml);
        }
    }

    private void processLogLevels(Map logLevelMenuItems, StringBuffer xml) {
        xml.append("\t<loglevels>\r\n");
        for (LogLevel level : logLevelMenuItems.keySet()) {
            exportLogLevelXMLElement(level.getLabel(), ((JCheckBoxMenuItem) logLevelMenuItems.get(level)).isSelected(), xml);
        }
        xml.append("\t</loglevels>\r\n");
    }

    private void processLogLevelColors(Map logLevelMenuItems, Map logLevelColors, StringBuffer xml) {
        xml.append("\t<loglevelcolors>\r\n");
        for (LogLevel level : logLevelMenuItems.keySet()) {
            exportLogLevelColorXMLElement(level.getLabel(), (Color) logLevelColors.get(level), xml);
        }
        xml.append("\t</loglevelcolors>\r\n");
    }

    private void processLogTableColumns(List logTableColumnMenuItems, StringBuffer xml) {
        xml.append("\t<logtablecolumns>\r\n");
        for (LogTableColumn column : logTableColumnMenuItems) {
            exportLogTableColumnXMLElement(column.getLabel(), this._monitor.getTableColumnMenuItem(column).isSelected(), xml);
        }
        xml.append("\t</logtablecolumns>\r\n");
    }

    private void processLogRecordFilter(String text, StringBuffer xml) {
        xml.append("\t<").append(NDCTEXTFILTER).append(" ");
        xml.append(NAME).append("=\"").append(text).append("\"");
        xml.append("/>\r\n");
    }

    private void openXMLDocument(StringBuffer xml) {
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
    }

    private void openConfigurationXML(StringBuffer xml) {
        xml.append("<configuration>\r\n");
    }

    private void closeConfigurationXML(StringBuffer xml) {
        xml.append("</configuration>\r\n");
    }

    private void exportXMLElement(CategoryNode node, TreePath path, StringBuffer xml) {
        CategoryExplorerTree tree = this._monitor.getCategoryExplorerTree();
        xml.append("\t<").append(CATEGORY).append(" ");
        xml.append(NAME).append("=\"").append(node.getTitle()).append("\" ");
        xml.append(PATH).append("=\"").append(treePathToString(path)).append("\" ");
        xml.append(EXPANDED).append("=\"").append(tree.isExpanded(path)).append("\" ");
        xml.append(SELECTED).append("=\"").append(node.isSelected()).append("\"/>\r\n");
    }

    private void exportLogLevelXMLElement(String label, boolean selected, StringBuffer xml) {
        xml.append("\t\t<").append(LEVEL).append(" ").append(NAME);
        xml.append("=\"").append(label).append("\" ");
        xml.append(SELECTED).append("=\"").append(selected);
        xml.append("\"/>\r\n");
    }

    private void exportLogLevelColorXMLElement(String label, Color color, StringBuffer xml) {
        xml.append("\t\t<").append(COLORLEVEL).append(" ").append(NAME);
        xml.append("=\"").append(label).append("\" ");
        xml.append(RED).append("=\"").append(color.getRed()).append("\" ");
        xml.append(GREEN).append("=\"").append(color.getGreen()).append("\" ");
        xml.append(BLUE).append("=\"").append(color.getBlue());
        xml.append("\"/>\r\n");
    }

    private void exportLogTableColumnXMLElement(String label, boolean selected, StringBuffer xml) {
        xml.append("\t\t<").append(COLUMN).append(" ").append(NAME);
        xml.append("=\"").append(label).append("\" ");
        xml.append(SELECTED).append("=\"").append(selected);
        xml.append("\"/>\r\n");
    }
}
