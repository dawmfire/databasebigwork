/*
 * Created by JFormDesigner on Sun May 21 02:05:08 CST 2023
 */

package view.normal;

import action.outAction;
import action.storeAction;
import base.managerRecord;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * @author unknown
 */
public class Storage extends JFrame {
    managerRecord ma;
    public Storage(managerRecord ma) {
        this.ma = ma;
        initComponents();
    }
    //Èë¿âÏìÓ¦
    private void button1(ActionEvent e) {
        // TODO add your code here
        storeAction in = new storeAction(ma,this);
        in.inRecord();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        this2 = new JFrame();
        button1 = new JButton();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        button2 = new JButton();

        //======== this2 ========
        {
            this2.setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
            this2.setVisible(true);
            var this2ContentPane = this2.getContentPane();
            this2ContentPane.setLayout(null);

            //---- button1 ----
            button1.setText("\u5165\u5e93");
            button1.addActionListener(e -> button1(e));
            this2ContentPane.add(button1);
            button1.setBounds(220, 340, 90, 45);
            this2ContentPane.add(textField2);
            textField2.setBounds(195, 155, 169, textField2.getPreferredSize().height);
            this2ContentPane.add(textField3);
            textField3.setBounds(195, 235, 169, textField3.getPreferredSize().height);

            //---- label1 ----
            label1.setText("\u96f6\u4ef6\u540d\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            this2ContentPane.add(label1);
            label1.setBounds(100, 155, 86, 27);

            //---- label2 ----
            label2.setText("\u6570\u91cf\uff1a");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 7f));
            this2ContentPane.add(label2);
            label2.setBounds(120, 235, 61, 27);

            //---- button2 ----
            button2.setText("\u9000\u51fa");
            this2ContentPane.add(button2);
            button2.setBounds(new Rectangle(new Point(500, 465), button2.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < this2ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = this2ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = this2ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                this2ContentPane.setMinimumSize(preferredSize);
                this2ContentPane.setPreferredSize(preferredSize);
            }
            this2.pack();
            this2.setLocationRelativeTo(this2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame this2;
    private JButton button1;
    public JTextField textField2;
    public JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
