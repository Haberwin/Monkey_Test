package org.apache.log4j.chainsaw;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

class ControlPanel extends JPanel {
    private static final Logger LOG;
    static Class class$org$apache$log4j$chainsaw$ControlPanel;

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$1 */
    class C00041 implements ActionListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;
        private final JComboBox val$priorities;

        C00041(ControlPanel controlPanel, MyTableModel myTableModel, JComboBox jComboBox) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
            this.val$priorities = jComboBox;
        }

        public void actionPerformed(ActionEvent aEvent) {
            this.val$aModel.setPriorityFilter((Priority) this.val$priorities.getSelectedItem());
        }
    }

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$2 */
    class C00052 implements DocumentListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;
        private final JTextField val$threadField;

        C00052(ControlPanel controlPanel, MyTableModel myTableModel, JTextField jTextField) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
            this.val$threadField = jTextField;
        }

        public void insertUpdate(DocumentEvent aEvent) {
            this.val$aModel.setThreadFilter(this.val$threadField.getText());
        }

        public void removeUpdate(DocumentEvent aEvente) {
            this.val$aModel.setThreadFilter(this.val$threadField.getText());
        }

        public void changedUpdate(DocumentEvent aEvent) {
            this.val$aModel.setThreadFilter(this.val$threadField.getText());
        }
    }

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$3 */
    class C00063 implements DocumentListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;
        private final JTextField val$catField;

        C00063(ControlPanel controlPanel, MyTableModel myTableModel, JTextField jTextField) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
            this.val$catField = jTextField;
        }

        public void insertUpdate(DocumentEvent aEvent) {
            this.val$aModel.setCategoryFilter(this.val$catField.getText());
        }

        public void removeUpdate(DocumentEvent aEvent) {
            this.val$aModel.setCategoryFilter(this.val$catField.getText());
        }

        public void changedUpdate(DocumentEvent aEvent) {
            this.val$aModel.setCategoryFilter(this.val$catField.getText());
        }
    }

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$4 */
    class C00074 implements DocumentListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;
        private final JTextField val$ndcField;

        C00074(ControlPanel controlPanel, MyTableModel myTableModel, JTextField jTextField) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
            this.val$ndcField = jTextField;
        }

        public void insertUpdate(DocumentEvent aEvent) {
            this.val$aModel.setNDCFilter(this.val$ndcField.getText());
        }

        public void removeUpdate(DocumentEvent aEvent) {
            this.val$aModel.setNDCFilter(this.val$ndcField.getText());
        }

        public void changedUpdate(DocumentEvent aEvent) {
            this.val$aModel.setNDCFilter(this.val$ndcField.getText());
        }
    }

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$5 */
    class C00085 implements DocumentListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;
        private final JTextField val$msgField;

        C00085(ControlPanel controlPanel, MyTableModel myTableModel, JTextField jTextField) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
            this.val$msgField = jTextField;
        }

        public void insertUpdate(DocumentEvent aEvent) {
            this.val$aModel.setMessageFilter(this.val$msgField.getText());
        }

        public void removeUpdate(DocumentEvent aEvent) {
            this.val$aModel.setMessageFilter(this.val$msgField.getText());
        }

        public void changedUpdate(DocumentEvent aEvent) {
            this.val$aModel.setMessageFilter(this.val$msgField.getText());
        }
    }

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$6 */
    class C00096 implements ActionListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;

        C00096(ControlPanel controlPanel, MyTableModel myTableModel) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
        }

        public void actionPerformed(ActionEvent aEvent) {
            this.val$aModel.clear();
        }
    }

    /* renamed from: org.apache.log4j.chainsaw.ControlPanel$7 */
    class C00107 implements ActionListener {
        private final ControlPanel this$0;
        private final MyTableModel val$aModel;
        private final JButton val$toggleButton;

        C00107(ControlPanel controlPanel, MyTableModel myTableModel, JButton jButton) {
            this.this$0 = controlPanel;
            this.val$aModel = myTableModel;
            this.val$toggleButton = jButton;
        }

        public void actionPerformed(ActionEvent aEvent) {
            this.val$aModel.toggle();
            this.val$toggleButton.setText(this.val$aModel.isPaused() ? "Resume" : "Pause");
        }
    }

    static {
        Class class$;
        if (class$org$apache$log4j$chainsaw$ControlPanel == null) {
            class$ = class$("org.apache.log4j.chainsaw.ControlPanel");
            class$org$apache$log4j$chainsaw$ControlPanel = class$;
        } else {
            class$ = class$org$apache$log4j$chainsaw$ControlPanel;
        }
        LOG = Logger.getLogger(class$);
    }

    static Class class$(String x0) {
        try {
            return Class.forName(x0);
        } catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError().initCause(x1);
        }
    }

    ControlPanel(MyTableModel aModel) {
        setBorder(BorderFactory.createTitledBorder("Controls: "));
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(gridbag);
        c.ipadx = 5;
        c.ipady = 5;
        c.gridx = 0;
        c.anchor = 13;
        c.gridy = 0;
        JLabel label = new JLabel("Filter Level:");
        gridbag.setConstraints(label, c);
        add(label);
        c.gridy++;
        label = new JLabel("Filter Thread:");
        gridbag.setConstraints(label, c);
        add(label);
        c.gridy++;
        label = new JLabel("Filter Logger:");
        gridbag.setConstraints(label, c);
        add(label);
        c.gridy++;
        label = new JLabel("Filter NDC:");
        gridbag.setConstraints(label, c);
        add(label);
        c.gridy++;
        label = new JLabel("Filter Message:");
        gridbag.setConstraints(label, c);
        add(label);
        c.weightx = 1.0d;
        c.gridx = 1;
        c.anchor = 17;
        c.gridy = 0;
        Level[] allPriorities = new Level[]{Level.FATAL, Level.ERROR, Level.WARN, Level.INFO, Level.DEBUG, Level.TRACE};
        JComboBox priorities = new JComboBox(allPriorities);
        Level lowest = allPriorities[allPriorities.length - 1];
        priorities.setSelectedItem(lowest);
        aModel.setPriorityFilter(lowest);
        gridbag.setConstraints(priorities, c);
        add(priorities);
        priorities.setEditable(false);
        priorities.addActionListener(new C00041(this, aModel, priorities));
        c.fill = 2;
        c.gridy++;
        JTextField threadField = new JTextField("");
        threadField.getDocument().addDocumentListener(new C00052(this, aModel, threadField));
        gridbag.setConstraints(threadField, c);
        add(threadField);
        c.gridy++;
        JTextField catField = new JTextField("");
        catField.getDocument().addDocumentListener(new C00063(this, aModel, catField));
        gridbag.setConstraints(catField, c);
        add(catField);
        c.gridy++;
        JTextField ndcField = new JTextField("");
        ndcField.getDocument().addDocumentListener(new C00074(this, aModel, ndcField));
        gridbag.setConstraints(ndcField, c);
        add(ndcField);
        c.gridy++;
        JTextField msgField = new JTextField("");
        msgField.getDocument().addDocumentListener(new C00085(this, aModel, msgField));
        gridbag.setConstraints(msgField, c);
        add(msgField);
        c.weightx = 0.0d;
        c.fill = 2;
        c.anchor = 13;
        c.gridx = 2;
        c.gridy = 0;
        JButton exitButton = new JButton("Exit");
        exitButton.setMnemonic('x');
        exitButton.addActionListener(ExitAction.INSTANCE);
        gridbag.setConstraints(exitButton, c);
        add(exitButton);
        c.gridy++;
        JButton clearButton = new JButton("Clear");
        clearButton.setMnemonic('c');
        clearButton.addActionListener(new C00096(this, aModel));
        gridbag.setConstraints(clearButton, c);
        add(clearButton);
        c.gridy++;
        JButton toggleButton = new JButton("Pause");
        toggleButton.setMnemonic('p');
        toggleButton.addActionListener(new C00107(this, aModel, toggleButton));
        gridbag.setConstraints(toggleButton, c);
        add(toggleButton);
    }
}
