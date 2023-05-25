/*
 * Created by JFormDesigner on Sun May 21 12:47:16 CST 2023
 */

package view.senior;

import action.addOrupdateManager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class updatePerson extends JFrame {
    String operate;
    public updatePerson() {
        initComponents();
    }

    public updatePerson(String operate) {
        this.operate = operate;
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        new addOrupdateManager(this,operate);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel10 = new JPanel();
        label9 = new JLabel();
        textField9 = new JTextField();
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField6 = new JTextField();
        panel3 = new JPanel();
        label3 = new JLabel();
        textField5 = new JTextField();
        panel4 = new JPanel();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel5 = new JPanel();
        label5 = new JLabel();
        textField3 = new JTextField();
        panel6 = new JPanel();
        label6 = new JLabel();
        textField2 = new JTextField();
        panel8 = new JPanel();
        label7 = new JLabel();
        textField7 = new JTextField();
        panel9 = new JPanel();
        label8 = new JLabel();
        textField8 = new JTextField();
        panel7 = new JPanel();
        button1 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        //======== panel10 ========
        {
            panel10.setLayout(new BoxLayout(panel10, BoxLayout.X_AXIS));

            //---- label9 ----
            label9.setText("\u5de5\u53f7\uff1a");
            panel10.add(label9);
            panel10.add(textField9);
        }
        contentPane.add(panel10);

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //---- label1 ----
            label1.setText("\u59d3\u540d");
            panel1.add(label1);
            panel1.add(textField1);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

            //---- label2 ----
            label2.setText("\u6027\u522b");
            panel2.add(label2);
            panel2.add(textField6);
        }
        contentPane.add(panel2);

        //======== panel3 ========
        {
            panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

            //---- label3 ----
            label3.setText("\u5e74\u9f84");
            panel3.add(label3);
            panel3.add(textField5);
        }
        contentPane.add(panel3);

        //======== panel4 ========
        {
            panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

            //---- label4 ----
            label4.setText("\u7535\u8bdd");
            panel4.add(label4);
            panel4.add(textField4);
        }
        contentPane.add(panel4);

        //======== panel5 ========
        {
            panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

            //---- label5 ----
            label5.setText("\u5de5\u8d44");
            panel5.add(label5);
            panel5.add(textField3);
        }
        contentPane.add(panel5);

        //======== panel6 ========
        {
            panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));

            //---- label6 ----
            label6.setText("\u6240\u5c5e\u5e93\u623f");
            panel6.add(label6);
            panel6.add(textField2);
        }
        contentPane.add(panel6);

        //======== panel8 ========
        {
            panel8.setLayout(new BoxLayout(panel8, BoxLayout.X_AXIS));

            //---- label7 ----
            label7.setText("\u8d26\u53f7");
            panel8.add(label7);
            panel8.add(textField7);
        }
        contentPane.add(panel8);

        //======== panel9 ========
        {
            panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));

            //---- label8 ----
            label8.setText("\u5bc6\u7801");
            panel9.add(label8);
            panel9.add(textField8);
        }
        contentPane.add(panel9);

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
    private JPanel panel10;
    private JLabel label9;
    public JTextField textField9;
    private JPanel panel1;
    private JLabel label1;
    public JTextField textField1;
    private JPanel panel2;
    private JLabel label2;
    public JTextField textField6;
    private JPanel panel3;
    private JLabel label3;
    public JTextField textField5;
    private JPanel panel4;
    private JLabel label4;
    public JTextField textField4;
    private JPanel panel5;
    private JLabel label5;
    public JTextField textField3;
    private JPanel panel6;
    private JLabel label6;
    public JTextField textField2;
    private JPanel panel8;
    private JLabel label7;
    public JTextField textField7;
    private JPanel panel9;
    private JLabel label8;
    public JTextField textField8;
    private JPanel panel7;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
