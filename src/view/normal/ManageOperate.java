package view.normal;

import base.managerRecord;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Fri May 19 13:42:26 CST 2023
 */



/**
 * @author unknown
 */
public class ManageOperate extends JFrame {
    managerRecord ma;
    public ManageOperate(managerRecord ma) {
       this.ma = ma;
        initComponents();
    }

    private void button12(ActionEvent e) { // 管理员监听器
        // TODO add your code here
        new Administrator();
    }

    private void button10(ActionEvent e) {//入库监听器
        // TODO add your code here
        new Storage(ma);
    }

    private void button9(ActionEvent e) { //出库监听器
        // TODO add your code here
        new Outbound(ma);
    }

    private void button7(ActionEvent e) {  // 个人信息监听器
        // TODO add your code here
        new PersonalInformation(ma);
    }

    private void button8(ActionEvent e) { //库房信息监听器
        // TODO add your code here
        new WarehouseInformation();
    }

    private void button11(ActionEvent e) { // 零件信息监听器
        // TODO add your code here
        new PartInformation();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        frame1 = new JFrame();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();

        //======== frame1 ========
        {
            frame1.setVisible(true);
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button7 ----
            button7.setText("\u4e2a\u4eba\u4fe1\u606f");
            button7.addActionListener(e -> button7(e));
            frame1ContentPane.add(button7);
            button7.setBounds(575, 100, 108, 55);

            //---- button8 ----
            button8.setText("\u5e93\u623f\u4fe1\u606f");
            button8.addActionListener(e -> button8(e));
            frame1ContentPane.add(button8);
            button8.setBounds(580, 230, 108, 55);

            //---- button9 ----
            button9.setText("\u51fa\u5e93");
            button9.addActionListener(e -> button9(e));
            frame1ContentPane.add(button9);
            button9.setBounds(45, 100, 108, 55);

            //---- button10 ----
            button10.setText("\u5165\u5e93");
            button10.addActionListener(e -> button10(e));
            frame1ContentPane.add(button10);
            button10.setBounds(50, 230, 108, 55);

            //---- button11 ----
            button11.setText("\u96f6\u4ef6\u4fe1\u606f");
            button11.addActionListener(e -> button11(e));
            frame1ContentPane.add(button11);
            button11.setBounds(580, 365, 110, 55);

            //---- button12 ----
            button12.setText("\u7ba1\u7406\u5458");
            button12.addActionListener(e -> button12(e));
            frame1ContentPane.add(button12);
            button12.setBounds(50, 360, 108, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame frame1;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
