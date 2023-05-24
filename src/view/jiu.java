/*
 * Created by JFormDesigner on Sun May 21 03:38:25 CST 2023
 */

package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author unknown
 */
public class jiu extends JFrame {
    public jiu() {
        initComponents();
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        tabbedPane1 = new JTabbedPane();
        panel4 = new JPanel();
        button3 = new JButton();
        panel2 = new JPanel();
        button1 = new JButton();
        panel3 = new JPanel();
        button2 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== tabbedPane1 ========
        {
            tabbedPane1.setMinimumSize(new Dimension(0, 0));
            tabbedPane1.setPreferredSize(new Dimension(600, 600));

            //======== panel4 ========
            {
                panel4.setLayout(null);

                //---- button3 ----
                button3.setText("text");
                panel4.add(button3);
                button3.setBounds(new Rectangle(new Point(155, 90), button3.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("text", panel4);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- button1 ----
                button1.setText("text");
                panel2.add(button1);
                button1.setBounds(new Rectangle(new Point(325, 175), button1.getPreferredSize()));

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
            tabbedPane1.addTab("text", panel2);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- button2 ----
                button2.setText("text");
                panel3.add(button2);
                button2.setBounds(new Rectangle(new Point(515, 360), button2.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("1", panel3);

            tabbedPane1.setSelectedIndex(0);
        }
        contentPane.add(tabbedPane1);
        tabbedPane1.setBounds(0, 0, 635, 455);

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
    private JTabbedPane tabbedPane1;
    private JPanel panel4;
    private JButton button3;
    private JPanel panel2;
    private JButton button1;
    private JPanel panel3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
