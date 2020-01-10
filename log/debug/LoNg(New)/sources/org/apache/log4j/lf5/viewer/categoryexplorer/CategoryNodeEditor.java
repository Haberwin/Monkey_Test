package org.apache.log4j.lf5.viewer.categoryexplorer;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JCheckBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

public class CategoryNodeEditor extends CategoryAbstractCellEditor {
    protected CategoryExplorerModel _categoryModel;
    protected JCheckBox _checkBox = this._renderer.getCheckBox();
    protected CategoryNode _lastEditedNode;
    protected CategoryNodeEditorRenderer _renderer = new CategoryNodeEditorRenderer();
    protected JTree _tree;

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$1 */
    class C00531 implements ActionListener {
        private final CategoryNodeEditor this$0;

        C00531(CategoryNodeEditor categoryNodeEditor) {
            this.this$0 = categoryNodeEditor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._categoryModel.update(this.this$0._lastEditedNode, this.this$0._checkBox.isSelected());
            this.this$0.stopCellEditing();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$2 */
    class C00542 extends MouseAdapter {
        private final CategoryNodeEditor this$0;

        C00542(CategoryNodeEditor categoryNodeEditor) {
            this.this$0 = categoryNodeEditor;
        }

        public void mousePressed(MouseEvent e) {
            if ((e.getModifiers() & 4) != 0) {
                this.this$0.showPopup(this.this$0._lastEditedNode, e.getX(), e.getY());
            }
            this.this$0.stopCellEditing();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$3 */
    class C00553 implements ActionListener {
        private final CategoryNodeEditor this$0;
        private final CategoryNode val$node;

        C00553(CategoryNodeEditor categoryNodeEditor, CategoryNode categoryNode) {
            this.this$0 = categoryNodeEditor;
            this.val$node = categoryNode;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.showPropertiesDialog(this.val$node);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$4 */
    class C00564 implements ActionListener {
        private final CategoryNodeEditor this$0;
        private final CategoryNode val$node;

        C00564(CategoryNodeEditor categoryNodeEditor, CategoryNode categoryNode) {
            this.this$0 = categoryNodeEditor;
            this.val$node = categoryNode;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._categoryModel.setDescendantSelection(this.val$node, true);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$5 */
    class C00575 implements ActionListener {
        private final CategoryNodeEditor this$0;
        private final CategoryNode val$node;

        C00575(CategoryNodeEditor categoryNodeEditor, CategoryNode categoryNode) {
            this.this$0 = categoryNodeEditor;
            this.val$node = categoryNode;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._categoryModel.setDescendantSelection(this.val$node, false);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$6 */
    class C00586 implements ActionListener {
        private final CategoryNodeEditor this$0;
        private final CategoryNode val$node;

        C00586(CategoryNodeEditor categoryNodeEditor, CategoryNode categoryNode) {
            this.this$0 = categoryNodeEditor;
            this.val$node = categoryNode;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.expandDescendants(this.val$node);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$7 */
    class C00597 implements ActionListener {
        private final CategoryNodeEditor this$0;
        private final CategoryNode val$node;

        C00597(CategoryNodeEditor categoryNodeEditor, CategoryNode categoryNode) {
            this.this$0 = categoryNodeEditor;
            this.val$node = categoryNode;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.collapseDescendants(this.val$node);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor$8 */
    class C00608 implements ActionListener {
        private final CategoryNodeEditor this$0;

        C00608(CategoryNodeEditor categoryNodeEditor) {
            this.this$0 = categoryNodeEditor;
        }

        public void actionPerformed(ActionEvent e) {
            do {
            } while (this.this$0.removeUnusedNodes() > 0);
        }
    }

    public CategoryNodeEditor(CategoryExplorerModel model) {
        this._categoryModel = model;
        this._checkBox.addActionListener(new C00531(this));
        this._renderer.addMouseListener(new C00542(this));
    }

    public Component getTreeCellEditorComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row) {
        this._lastEditedNode = (CategoryNode) value;
        this._tree = tree;
        return this._renderer.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, true);
    }

    public Object getCellEditorValue() {
        return this._lastEditedNode.getUserObject();
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createPropertiesMenuItem(CategoryNode node) {
        JMenuItem result = new JMenuItem("Properties");
        result.addActionListener(new C00553(this, node));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void showPropertiesDialog(CategoryNode node) {
        JOptionPane.showMessageDialog(this._tree, getDisplayedProperties(node), new StringBuffer().append("Category Properties: ").append(node.getTitle()).toString(), -1);
    }

    /* Access modifiers changed, original: protected */
    public Object getDisplayedProperties(CategoryNode node) {
        ArrayList result = new ArrayList();
        result.add(new StringBuffer().append("Category: ").append(node.getTitle()).toString());
        if (node.hasFatalRecords()) {
            result.add("Contains at least one fatal LogRecord.");
        }
        if (node.hasFatalChildren()) {
            result.add("Contains descendants with a fatal LogRecord.");
        }
        result.add(new StringBuffer().append("LogRecords in this category alone: ").append(node.getNumberOfContainedRecords()).toString());
        result.add(new StringBuffer().append("LogRecords in descendant categories: ").append(node.getNumberOfRecordsFromChildren()).toString());
        result.add(new StringBuffer().append("LogRecords in this category including descendants: ").append(node.getTotalNumberOfRecords()).toString());
        return result.toArray();
    }

    /* Access modifiers changed, original: protected */
    public void showPopup(CategoryNode node, int x, int y) {
        JPopupMenu popup = new JPopupMenu();
        popup.setSize(150, 400);
        if (node.getParent() == null) {
            popup.add(createRemoveMenuItem());
            popup.addSeparator();
        }
        popup.add(createSelectDescendantsMenuItem(node));
        popup.add(createUnselectDescendantsMenuItem(node));
        popup.addSeparator();
        popup.add(createExpandMenuItem(node));
        popup.add(createCollapseMenuItem(node));
        popup.addSeparator();
        popup.add(createPropertiesMenuItem(node));
        popup.show(this._renderer, x, y);
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createSelectDescendantsMenuItem(CategoryNode node) {
        JMenuItem selectDescendants = new JMenuItem("Select All Descendant Categories");
        selectDescendants.addActionListener(new C00564(this, node));
        return selectDescendants;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createUnselectDescendantsMenuItem(CategoryNode node) {
        JMenuItem unselectDescendants = new JMenuItem("Deselect All Descendant Categories");
        unselectDescendants.addActionListener(new C00575(this, node));
        return unselectDescendants;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createExpandMenuItem(CategoryNode node) {
        JMenuItem result = new JMenuItem("Expand All Descendant Categories");
        result.addActionListener(new C00586(this, node));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createCollapseMenuItem(CategoryNode node) {
        JMenuItem result = new JMenuItem("Collapse All Descendant Categories");
        result.addActionListener(new C00597(this, node));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createRemoveMenuItem() {
        JMenuItem result = new JMenuItem("Remove All Empty Categories");
        result.addActionListener(new C00608(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void expandDescendants(CategoryNode node) {
        Enumeration descendants = node.depthFirstEnumeration();
        while (descendants.hasMoreElements()) {
            expand((CategoryNode) descendants.nextElement());
        }
    }

    /* Access modifiers changed, original: protected */
    public void collapseDescendants(CategoryNode node) {
        Enumeration descendants = node.depthFirstEnumeration();
        while (descendants.hasMoreElements()) {
            collapse((CategoryNode) descendants.nextElement());
        }
    }

    /* Access modifiers changed, original: protected */
    public int removeUnusedNodes() {
        int count = 0;
        Enumeration enumeration = this._categoryModel.getRootCategoryNode().depthFirstEnumeration();
        while (enumeration.hasMoreElements()) {
            CategoryNode node = (CategoryNode) enumeration.nextElement();
            if (node.isLeaf() && node.getNumberOfContainedRecords() == 0 && node.getParent() != null) {
                this._categoryModel.removeNodeFromParent(node);
                count++;
            }
        }
        return count;
    }

    /* Access modifiers changed, original: protected */
    public void expand(CategoryNode node) {
        this._tree.expandPath(getTreePath(node));
    }

    /* Access modifiers changed, original: protected */
    public TreePath getTreePath(CategoryNode node) {
        return new TreePath(node.getPath());
    }

    /* Access modifiers changed, original: protected */
    public void collapse(CategoryNode node) {
        this._tree.collapsePath(getTreePath(node));
    }
}
