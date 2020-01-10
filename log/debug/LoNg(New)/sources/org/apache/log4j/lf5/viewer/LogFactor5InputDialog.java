package org.apache.log4j.lf5.viewer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogFactor5InputDialog extends LogFactor5Dialog {
    public static final int SIZE = 30;
    private JTextField _textField;

    /* renamed from: org.apache.log4j.lf5.viewer.LogFactor5InputDialog$1 */
    class C00481 extends KeyAdapter {
        private final LogFactor5InputDialog this$0;

        C00481(LogFactor5InputDialog logFactor5InputDialog) {
            this.this$0 = logFactor5InputDialog;
        }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == 10) {
                this.this$0.hide();
            }
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogFactor5InputDialog$2 */
    class C00492 implements ActionListener {
        private final LogFactor5InputDialog this$0;

        C00492(LogFactor5InputDialog logFactor5InputDialog) {
            this.this$0 = logFactor5InputDialog;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.hide();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogFactor5InputDialog$3 */
    class C00503 implements ActionListener {
        private final LogFactor5InputDialog this$0;

        C00503(LogFactor5InputDialog logFactor5InputDialog) {
            this.this$0 = logFactor5InputDialog;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.hide();
            LogFactor5InputDialog.access$000(this.this$0).setText("");
        }
    }

    static JTextField access$000(LogFactor5InputDialog x0) {
        return x0._textField;
    }

    public LogFactor5InputDialog(JFrame jframe, String title, String label) {
        this(jframe, title, label, 30);
    }

    public LogFactor5InputDialog(JFrame jframe, String title, String label, int size) {
        super(jframe, title, true);
        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        JPanel main = new JPanel();
        main.setLayout(new FlowLayout());
        main.add(new JLabel(label));
        this._textField = new JTextField(size);
        main.add(this._textField);
        addKeyListener(new C00481(this));
        JButton ok = new JButton("Ok");
        ok.addActionListener(new C00492(this));
        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(new C00503(this));
        bottom.add(ok);
        bottom.add(cancel);
        getContentPane().add(main, "Center");
        getContentPane().add(bottom, "South");
        pack();
        centerWindow(this);
        show();
    }

    public String getText() {
        String s = this._textField.getText();
        if (s == null || s.trim().length() != 0) {
            return s;
        }
        return null;
    }
}
