package view;

import action.LoginAction;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
//---------登录界面--------
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    //登录按钮响应

    private void button1(ActionEvent e) {
        // TODO add your code here
        LoginAction ac = new LoginAction(this);
            ac.actionPerformed(e);
    }

    public JPanel getPanel1() {
        return panel1;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel5 = new JPanel();
        panel4 = new JPanel();
        panel3 = new JPanel();
        panel1 = new JPanel();
        label2 = new JLabel();
        button1 = new JButton();
        label1 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        panel2 = new JPanel();
        panel6 = new JPanel();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        //======== panel5 ========
        {
            panel5.setMinimumSize(new Dimension(0, 500));
            panel5.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel5.getComponentCount(); i++) {
                    Rectangle bounds = panel5.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel5.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel5.setMinimumSize(preferredSize);
                panel5.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel5);

        //======== panel4 ========
        {
            panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

            //======== panel3 ========
            {
                panel3.setLayout(null);

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
            panel4.add(panel3);

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- label2 ----
                label2.setText("\u5bc6\u7801\uff1a");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 10f));
                panel1.add(label2);
                label2.setBounds(new Rectangle(new Point(200, 225), label2.getPreferredSize()));

                //---- button1 ----
                button1.setText("\u767b\u5f55");
                button1.addActionListener(e -> {
			button1(e);
		});
                panel1.add(button1);
                button1.setBounds(320, 350, 150, 50);

                //---- label1 ----
                label1.setText("\u8d26\u53f7\uff1a");
                label1.setAutoscrolls(true);
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 11f));
                panel1.add(label1);
                label1.setBounds(200, 165, 95, 30);
                panel1.add(textField1);
                textField1.setBounds(275, 165, 255, textField1.getPreferredSize().height);
                panel1.add(passwordField1);
                passwordField1.setBounds(275, 225, 255, passwordField1.getPreferredSize().height);

                //---- label3 ----
                label3.setText("\u4ed3\u5e93\u7ba1\u7406\u7cfb\u7edf");
                label3.setFont(new Font("\u7b49\u7ebf", Font.BOLD, 48));
                panel1.add(label3);
                label3.setBounds(240, 5, 530, 105);

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
            panel4.add(panel1);

            //======== panel2 ========
            {
                panel2.setLayout(null);

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
            panel4.add(panel2);
        }
        contentPane.add(panel4);

        //======== panel6 ========
        {
            panel6.setMinimumSize(new Dimension(0, 500));
            panel6.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel6.getComponentCount(); i++) {
                    Rectangle bounds = panel6.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel6.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel6.setMinimumSize(preferredSize);
                panel6.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel6);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel5;
    private JPanel panel4;
    private JPanel panel3;
    private JPanel panel1;
    private JLabel label2;
    private JButton button1;
    private JLabel label1;
    public JTextField textField1;
    public JPasswordField passwordField1;
    private JLabel label3;
    private JPanel panel2;
    private JPanel panel6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
