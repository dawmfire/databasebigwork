/*
 * Created by JFormDesigner on Sun May 21 02:14:29 CST 2023
 */

package view.normal;

import java.awt.event.*;

import action.administratorFindAction;
import base.Query;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author unknown
 */
public class Administrator extends JFrame {
    public Administrator() {
        initComponents();
    }

    //²éÕÒ¹¦ÄÜ
    private void button2(ActionEvent e) {
        // TODO add your code here
        administratorFindAction am =new administratorFindAction(textField1.getText(),this);
        am.actionPerformed();
    }

    private void button3(ActionEvent e) {
        // TODO add your code here
        dispose();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button2 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        button3 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(523, 50));
            panel1.setLayout(null);

            //---- button2 ----
            button2.setText("\u67e5\u627e");
            button2.addActionListener(e -> button2(e));
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(415, 15), button2.getPreferredSize()));

            //---- textField1 ----
            textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getStyle() | Font.ITALIC));
            textField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panel1.add(textField1);
            textField1.setBounds(135, 15, 240, textField1.getPreferredSize().height);

            //---- label1 ----
            label1.setText("\u7ba1\u7406\u5458\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
            panel1.add(label1);
            label1.setBounds(80, 20, 80, 20);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1, BorderLayout.NORTH);

        //---- button3 ----
        button3.setText("\u9000\u51fa");
        button3.addActionListener(e -> button3(e));
        contentPane.add(button3, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button2;
    private JTextField textField1;
    private JLabel label1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
