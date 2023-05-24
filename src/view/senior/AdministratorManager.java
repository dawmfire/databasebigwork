/*
 * Created by JFormDesigner on Sun May 21 04:50:33 CST 2023
 */

package view.senior;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class AdministratorManager extends JFrame {
    public AdministratorManager() {
        initComponents();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void button2(ActionEvent e) {
        // TODO add your code here
        textField1.setText("111");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        button2 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        panel3 = new JPanel();
        button1 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setPreferredSize(new Dimension(523, 50));
                panel2.setLayout(null);

                //---- button2 ----
                button2.setText("\u67e5\u627e");
                button2.addActionListener(e -> button2(e));
                panel2.add(button2);
                button2.setBounds(new Rectangle(new Point(415, 15), button2.getPreferredSize()));

                //---- textField1 ----
                textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getStyle() | Font.ITALIC));
                textField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                panel2.add(textField1);
                textField1.setBounds(135, 15, 240, textField1.getPreferredSize().height);

                //---- label1 ----
                label1.setText("\u7ba1\u7406\u5458\uff1a");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
                panel2.add(label1);
                label1.setBounds(80, 20, 80, 20);

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

            //======== panel3 ========
            {
                panel3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

                //---- button1 ----
                button1.setText("\u6dfb\u52a0");
                panel3.add(button1);

                //---- button3 ----
                button3.setText("\u66f4\u65b0");
                panel3.add(button3);

                //---- button4 ----
                button4.setText("\u5220\u9664");
                panel3.add(button4);
            }
            panel1.add(panel3, BorderLayout.SOUTH);
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 650, 580);

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
    private JButton button2;
    private JTextField textField1;
    private JLabel label1;
    private JPanel panel3;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
