/*
 * Created by JFormDesigner on Sun May 21 02:40:45 CST 2023
 */

package view.normal;

import base.managerRecord;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author unknown
 */
public class PersonalInformation extends JFrame {
    managerRecord ma;
    public PersonalInformation(managerRecord ma) {

        this.ma = ma;
        initComponents();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label5 = new JLabel();
        label11 = new JLabel();
        panel2 = new JPanel();
        label4 = new JLabel();
        label12 = new JLabel();
        panel3 = new JPanel();
        label6 = new JLabel();
        label13 = new JLabel();
        panel4 = new JPanel();
        label7 = new JLabel();
        label14 = new JLabel();
        panel5 = new JPanel();
        label8 = new JLabel();
        label15 = new JLabel();
        panel6 = new JPanel();
        label9 = new JLabel();
        label16 = new JLabel();
        panel7 = new JPanel();
        label10 = new JLabel();
        label17 = new JLabel();
        panel8 = new JPanel();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(0, 30));
            panel1.setLayout(new BorderLayout());

            //---- label5 ----
            label5.setText("\u5de5\u53f7\uff1a");
            panel1.add(label5, BorderLayout.LINE_START);
            panel1.add(label11, BorderLayout.CENTER);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(0, 100));
            panel2.setLayout(new BorderLayout());

            //---- label4 ----
            label4.setText("\u59d3\u540d\uff1a");
            panel2.add(label4, BorderLayout.LINE_START);
            panel2.add(label12, BorderLayout.CENTER);
        }
        contentPane.add(panel2);

        //======== panel3 ========
        {
            panel3.setLayout(new BorderLayout());

            //---- label6 ----
            label6.setText("\u6027\u522b\uff1a");
            panel3.add(label6, BorderLayout.LINE_START);
            panel3.add(label13, BorderLayout.CENTER);
        }
        contentPane.add(panel3);

        //======== panel4 ========
        {
            panel4.setLayout(new BorderLayout());

            //---- label7 ----
            label7.setText("\u5e74\u9f84\uff1a");
            panel4.add(label7, BorderLayout.LINE_START);
            panel4.add(label14, BorderLayout.CENTER);
        }
        contentPane.add(panel4);

        //======== panel5 ========
        {
            panel5.setLayout(new BorderLayout());

            //---- label8 ----
            label8.setText("\u7535\u8bdd\uff1a");
            panel5.add(label8, BorderLayout.WEST);
            panel5.add(label15, BorderLayout.CENTER);
        }
        contentPane.add(panel5);

        //======== panel6 ========
        {
            panel6.setMinimumSize(new Dimension(75, 40));
            panel6.setLayout(new BorderLayout());

            //---- label9 ----
            label9.setText("\u5de5\u8d44\uff1a");
            panel6.add(label9, BorderLayout.WEST);
            panel6.add(label16, BorderLayout.CENTER);
        }
        contentPane.add(panel6);

        //======== panel7 ========
        {
            panel7.setLayout(new BorderLayout());

            //---- label10 ----
            label10.setText("\u6240\u5c5e\u5e93\u623f\uff1a");
            panel7.add(label10, BorderLayout.WEST);
            panel7.add(label17, BorderLayout.CENTER);
        }
        contentPane.add(panel7);

        //======== panel8 ========
        {
            panel8.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel8.getComponentCount(); i++) {
                    Rectangle bounds = panel8.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel8.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel8.setMinimumSize(preferredSize);
                panel8.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel8);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label5;
    private JLabel label11;
    private JPanel panel2;
    private JLabel label4;
    private JLabel label12;
    private JPanel panel3;
    private JLabel label6;
    private JLabel label13;
    private JPanel panel4;
    private JLabel label7;
    private JLabel label14;
    private JPanel panel5;
    private JLabel label8;
    private JLabel label15;
    private JPanel panel6;
    private JLabel label9;
    private JLabel label16;
    private JPanel panel7;
    private JLabel label10;
    private JLabel label17;
    private JPanel panel8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
