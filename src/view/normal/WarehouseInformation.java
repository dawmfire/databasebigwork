/*
 * Created by JFormDesigner on Sun May 21 02:35:48 CST 2023
 */

package view.normal;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class WarehouseInformation extends JFrame {
    public WarehouseInformation() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(78, 60));
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("\u67e5\u627e");
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(470, 5), button1.getPreferredSize()));
            panel1.add(textField1);
            textField1.setBounds(220, 5, 205, textField1.getPreferredSize().height);

            //---- label1 ----
            label1.setText("\u5e93\u623f\u53f7\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            panel1.add(label1);
            label1.setBounds(130, 5, 80, 27);

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

        //---- button2 ----
        button2.setText("\u9000\u51fa");
        contentPane.add(button2, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JLabel label1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}