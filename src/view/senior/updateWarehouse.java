/*
 * Created by JFormDesigner on Sun May 21 12:57:09 CST 2023
 */

package view.senior;

import action.addOrupdateManager;
import action.addOrupdateWarehouse;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class updateWarehouse extends JFrame {
    String operate;//添加或者更新（二选一）
    public updateWarehouse() {
        initComponents();
    }

    public updateWarehouse(String operate){
        this.operate = operate;
        initComponents();
    }
    private void button1(ActionEvent e) {
        // TODO add your code here
        new addOrupdateWarehouse(this,operate);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel4 = new JPanel();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel6 = new JPanel();
        label6 = new JLabel();
        textField2 = new JTextField();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField6 = new JTextField();
        panel5 = new JPanel();
        label5 = new JLabel();
        textField3 = new JTextField();
        panel7 = new JPanel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        setVisible(true);
        //======== panel4 ========
        {
            panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

            //---- label4 ----
            label4.setText("\u5e93\u623f\u7f16\u53f7");
            panel4.add(label4);
            panel4.add(textField4);
        }
        contentPane.add(panel4);

        //======== panel6 ========
        {
            panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));

            //---- label6 ----
            label6.setText("\u5e93\u623f\u540d");
            panel6.add(label6);
            panel6.add(textField2);
        }
        contentPane.add(panel6);

        //======== panel2 ========
        {
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

            //---- label2 ----
            label2.setText("\u6240\u5360\u9762\u79ef");
            panel2.add(label2);
            panel2.add(textField6);
        }
        contentPane.add(panel2);

        //======== panel5 ========
        {
            panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

            //---- label5 ----
            label5.setText("\u5730\u5740");
            panel5.add(label5);
            panel5.add(textField3);
        }
        contentPane.add(panel5);

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
    private JPanel panel4;
    private JLabel label4;
    public JTextField textField4;
    private JPanel panel6;
    private JLabel label6;
    public JTextField textField2;
    private JPanel panel2;
    private JLabel label2;
    public JTextField textField6;
    private JPanel panel5;
    private JLabel label5;
    public JTextField textField3;
    private JPanel panel7;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
