/*
 * Created by JFormDesigner on Sun May 21 03:29:07 CST 2023
 */

package view.normal;

import action.partInformationFindAction;
import base.Query;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author unknown
 */
public class PartInformation extends JFrame {
    public PartInformation() {
        initComponents();
    }

    private void button2(ActionEvent e) {
        // TODO add your code here
        dispose();
    }
    //以零件名为条件
    private void button1(ActionEvent e) {
        // TODO add your code here
        partInformationFindAction pa= new partInformationFindAction(this,textField1.getText());
        pa.findpartRecord();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
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
        setVisible(true);
        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        //======== panel1 ========
        {
            contentPane.add(new JScrollPane(table),BorderLayout.CENTER);
            panel1.setMinimumSize(new Dimension(0, 50));
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("\u67e5\u627e");
            button1.addActionListener(e -> button1(e));
            panel1.add(button1);
            button1.setBounds(415, 5, 90, 35);
            panel1.add(textField1);
            textField1.setBounds(195, 5, 174, 35);

            //---- label1 ----
            label1.setText("\u96f6\u4ef6\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
            panel1.add(label1);
            label1.setBounds(140, 5, 75, 30);

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
        button2.addActionListener(e -> {
			button2(e);
			button2(e);
		});
        contentPane.add(button2, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    public JTextField textField1;
    private JLabel label1;
    private JButton button2;
    public String [][] tableHeader;
    String[] columnNames;
    public DefaultTableModel model;
    Query query;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
