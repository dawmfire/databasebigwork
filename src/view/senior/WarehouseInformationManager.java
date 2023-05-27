/*
 * Created by JFormDesigner on Sun May 21 05:05:13 CST 2023
 */

package view.senior;

import action.warehouseInformationFindAction;
import base.Query;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author unknown
 */
public class WarehouseInformationManager extends JFrame {
    public WarehouseInformationManager() {
        initComponents();
    }

    public JPanel getPanel1() {
        return panel1;
    }
    //添加
    private void button2(ActionEvent e) {
        // TODO add your code here
        new updateWarehouse("添加");
    }
    //更新
    private void button3(ActionEvent e) {
        // TODO add your code here
        new updateWarehouse("更新");
    }
    //删除
    private void button4(ActionEvent e) {
        // TODO add your code here
        new deleteChange("库房");
    }
    //查找
    private void button1(ActionEvent e) {
        // TODO add your code here
       new warehouseInformationFindAction(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        panel3 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        query=new Query();
        tableHeader =query.startwarehouseRecords();
        columnNames = new String[] { "库房id", "库房名字", "库房地址", "库房面积","管理人数"
                ,"剩余库存","上限库存"};
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
                panel2.setMinimumSize(new Dimension(78, 60));
                panel2.setLayout(null);

                //---- button1 ----
                button1.setText("\u67e5\u627e");
                button1.addActionListener(e -> button1(e));
                panel2.add(button1);
                button1.setBounds(new Rectangle(new Point(470, 5), button1.getPreferredSize()));
                panel2.add(textField1);
                textField1.setBounds(220, 5, 205, textField1.getPreferredSize().height);

                //---- label1 ----
                label1.setText("\u5e93\u623f\u53f7\uff1a");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
                panel2.add(label1);
                label1.setBounds(70, 5, 135, 27);

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

                //---- button2 ----
                button2.setText("\u6dfb\u52a0");
                button2.addActionListener(e -> button2(e));
                panel3.add(button2);

                //---- button3 ----
                button3.setText("\u66f4\u65b0");
                button3.addActionListener(e -> button3(e));
                panel3.add(button3);

                //---- button4 ----
                button4.setText("\u5220\u9664");
                button4.addActionListener(e -> button4(e));
                panel3.add(button4);
            }
            panel1.add(panel3, BorderLayout.SOUTH);
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 670, 635);

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
    public JTextField textField1;
    private JLabel label1;
    private JPanel panel3;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public String [][] tableHeader;
    String[] columnNames;
    public DefaultTableModel model;
    Query query;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
