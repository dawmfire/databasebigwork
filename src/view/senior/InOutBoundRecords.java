/*
 * Created by JFormDesigner on Sun May 21 05:40:56 CST 2023
 */

package view.senior;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class InOutBoundRecords extends JFrame {
    public InOutBoundRecords() {
        initComponents();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- button1 ----
                button1.setText("\u67e5\u627e");
                panel2.add(button1);
                button1.setBounds(new Rectangle(new Point(565, 0), button1.getPreferredSize()));
                panel2.add(textField1);
                textField1.setBounds(195, 0, 299, textField1.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2, BorderLayout.NORTH);
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 710, 710);

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
    private JPanel panel1;
    private JPanel panel2;
    private JButton button1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
