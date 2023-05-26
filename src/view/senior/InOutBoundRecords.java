/*
 * Created by JFormDesigner on Sun May 21 05:40:56 CST 2023
 */

package view.senior;

import action.inoutRevealRecord;
import base.Query;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
//入库记录
    private void button1(ActionEvent e) {
        // TODO add your code here
        new inoutRevealRecord(this,"入库");
    }
//出库记录
    private void button2(ActionEvent e) {
        // TODO add your code here
        new inoutRevealRecord(this,"出库");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        query = new Query();
      //  tableHeader =new String[99][6];
        columnNames = new String[] { "操作人id","操作人名字","零件id", "零件名字", "操作时间", "操作数量"};
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
            panel1.add(new JScrollPane(table),BorderLayout.CENTER);
            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- button1 ----
                button1.setText("\u5165\u5e93\u8bb0\u5f55");
                button1.addActionListener(e -> button1(e));
                panel2.add(button1);
                button1.setBounds(430, 0, 213, button1.getPreferredSize().height);

                //---- button2 ----
                button2.setText("\u51fa\u5e93\u8bb0\u5f55");
                button2.addActionListener(e -> button2(e));
                panel2.add(button2);
                button2.setBounds(5, 5, 213, button2.getPreferredSize().height);

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
    private JButton button2;
    public String [][] tableHeader;
    String[] columnNames;
    public DefaultTableModel model;
    Query query;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
