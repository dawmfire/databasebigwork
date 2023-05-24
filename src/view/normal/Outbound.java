/*
 * Created by JFormDesigner on Sun May 21 01:55:18 CST 2023
 */

package view.normal;

import base.managerRecord;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class Outbound extends JFrame {
    managerRecord ma;
    public Outbound(managerRecord ma) {

        this.ma = ma;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        button2 = new JButton();

        //======== this ========
        setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("\u51fa\u5e93");
        contentPane.add(button1);
        button1.setBounds(220, 340, 90, 45);
        contentPane.add(textField2);
        textField2.setBounds(195, 155, 169, textField2.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(195, 235, 169, textField3.getPreferredSize().height);

        //---- label1 ----
        label1.setText("\u96f6\u4ef6\u540d\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
        contentPane.add(label1);
        label1.setBounds(100, 155, 86, 27);

        //---- label2 ----
        label2.setText("\u6570\u91cf\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 7f));
        contentPane.add(label2);
        label2.setBounds(120, 235, 61, 27);

        //---- button2 ----
        button2.setText("\u9000\u51fa");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(500, 465), button2.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
