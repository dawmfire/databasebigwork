/*
 * Created by JFormDesigner on Sun May 21 05:39:01 CST 2023
 */

package view.senior;

import action.partInformationFindAction;
import base.Query;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author unknown
 */
public class PartInformationManager extends JFrame {
    public PartInformationManager() {

        initComponents();
    }

    public JPanel getPanel1() {
        return panel1;
    }
    //添加
    private void button2(ActionEvent e) {
        // TODO add your code here
        new updatePart("添加");
    }
    //更改
    private void button3(ActionEvent e) {
        // TODO add your code here
        new updatePart("更新");
    }
    //删除
    private void button4(ActionEvent e) {
        // TODO add your code here
        new deleteChange("零件");
    }
    //查找
    private void button1(ActionEvent e) {
        // TODO add your code here
        new partInformationFindAction(this,textField1.getText());

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        panel3 = new JPanel();
        button4 = new JButton();
        button3 = new JButton();
        button2 = new JButton();
        query = new Query();
        tableHeader =query.statrpartRecord();
        columnNames = new String[] { "零件id", "零件名字", "规格", "价格","现存数量","所属库房"};
        model = new DefaultTableModel(tableHeader,columnNames){
            //设置表格全部行列都不可以编辑
            @Override
            public boolean isCellEditable(int row , int column){

                return false;
            }
        };
        JTable table = new JTable(model);
        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());
            panel1.add(new JScrollPane(table),BorderLayout.CENTER);
            //======== panel2 ========
            {
                panel2.setMinimumSize(new Dimension(0, 50));
                panel2.setLayout(null);

                //---- button1 ----
                button1.setText("\u67e5\u627e");
                button1.addActionListener(e -> button1(e));
                panel2.add(button1);
                button1.setBounds(415, 5, 90, 35);
                panel2.add(textField1);
                textField1.setBounds(195, 5, 174, 35);

                //---- label1 ----
                label1.setText("\u96f6\u4ef6\uff1a");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
                panel2.add(label1);
                label1.setBounds(140, 5, 75, 30);

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
                panel3.setLayout(null);

                //---- button4 ----
                button4.setText("\u5220\u9664");
                button4.addActionListener(e -> button4(e));
                panel3.add(button4);
                button4.setBounds(new Rectangle(new Point(190, 0), button4.getPreferredSize()));

                //---- button3 ----
                button3.setText("\u4fee\u6539");
                button3.addActionListener(e -> button3(e));
                panel3.add(button3);
                button3.setBounds(new Rectangle(new Point(95, 0), button3.getPreferredSize()));

                //---- button2 ----
                button2.setText("\u6dfb\u52a0");
                button2.addActionListener(e -> button2(e));
                panel3.add(button2);
                button2.setBounds(new Rectangle(new Point(0, 0), button2.getPreferredSize()));

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
            panel1.add(panel3, BorderLayout.SOUTH);
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 635, 610);

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
    private JLabel label1;
    private JPanel panel3;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    public String [][] tableHeader;
    String[] columnNames;
    public DefaultTableModel model;
    Query query;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
