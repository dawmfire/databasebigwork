/*
 * Created by JFormDesigner on Sun May 21 12:53:50 CST 2023
 */

package view.senior;

import action.addOrupdatePart;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class updatePart extends JFrame {
    String operate;//添加或者更新（二选一）

    public updatePart() {
        initComponents();
    }

    public updatePart(String operate) {
        this.operate = operate;
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        new addOrupdatePart(this, operate);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel6 = new JPanel();
        label6 = new JLabel();
        textField2 = new JTextField();
        panel5 = new JPanel();
        label5 = new JLabel();
        textField3 = new JTextField();
        panel4 = new JPanel();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel3 = new JPanel();
        label3 = new JLabel();
        textField5 = new JTextField();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField6 = new JTextField();
        panel7 = new JPanel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        setVisible(true);
        //======== panel6 ========
        {
            panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));

            //---- label6 ----
            label6.setText("\u96f6\u4ef6\u540d");
            panel6.add(label6);
            panel6.add(textField2);
        }
        contentPane.add(panel6);

        //======== panel5 ========
        {
            panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

            //---- label5 ----
            label5.setText("\u89c4\u683c");
            panel5.add(label5);
            panel5.add(textField3);
        }
        contentPane.add(panel5);

        //======== panel4 ========
        {
            panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

            //---- label4 ----
            label4.setText("\u4ef7\u683c");
            panel4.add(label4);
            panel4.add(textField4);
        }
        contentPane.add(panel4);

        //======== panel3 ========
        {
            panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

            //---- label3 ----
            label3.setText("\u5e93\u5b58");
            panel3.add(label3);
            panel3.add(textField5);
        }
        contentPane.add(panel3);

        //======== panel2 ========
        {
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

            //---- label2 ----
            label2.setText("\u6240\u5c5e\u90e8\u95e8");
            panel2.add(label2);
            panel2.add(textField6);
        }
        contentPane.add(panel2);

        //======== panel7 ========
        {
            panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));

            //---- button1 ----
            button1.setText("\u786e\u8ba4");
            button1.addActionListener(e -> button1(e));
            panel7.add(button1);
        }
        contentPane.add(panel7);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel6;
    private JLabel label6;
    public JTextField textField2;
    private JPanel panel5;
    private JLabel label5;
    public JTextField textField3;
    private JPanel panel4;
    private JLabel label4;
    public JTextField textField4;
    private JPanel panel3;
    private JLabel label3;
    public JTextField textField5;
    private JPanel panel2;
    private JLabel label2;
    public JTextField textField6;
    private JPanel panel7;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
