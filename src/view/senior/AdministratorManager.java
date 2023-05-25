/*
 * Created by JFormDesigner on Sun May 21 04:50:33 CST 2023
 */

package view.senior;

import action.administratorFindAction;
import base.Query;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
//查找功能

    private void button2(ActionEvent e) {
        // TODO add your code here
        administratorFindAction ad= new administratorFindAction(textField1.getText(),this);
        ad.actionPerformed();
    }
//删除功能
    private void button4(ActionEvent e) {
        // TODO add your code here
            new deleteChange();
    }
//更新功能
    private void button3(ActionEvent e) {
        // TODO add your code here
        new updatePerson("更新");
    }
//添加功能
    private void button1(ActionEvent e) {
        // TODO add your code here
       new updatePerson("添加");


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
        query = new Query();
        tableHeader =query.statrSeniorManagerRecordQuery();
        columnNames = new String[] { "管理员id", "管理员名字", "性别", "年龄", "电话", "工资", "所属库房id", "账号","密码"};
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
                button1.addActionListener(e -> button1(e));
                panel3.add(button1);

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
    public String [][] tableHeader;
    String[] columnNames;
    public DefaultTableModel model;
    Query query;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
