package action;

import base.Query;
import view.normal.Administrator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class administratorFindAction {
    String Mid;
    Administrator am;
    String [][] tableHeader;
    String[] columnNames;
    DefaultTableModel model;
    public administratorFindAction(String x, Administrator am){
        this.Mid = x;
        this.am = am;
    }
    public void actionPerformed(){
        Query query =new Query();
        tableHeader=query.statrfindMangerRecords(Mid);

        if (!Mid.equals("")) {
            for (int i = 0; i < am.tableHeader.length; i++) {
                am.model.removeRow(0);
            }
            for (int i = 0; i < tableHeader.length; i++) {
                if (tableHeader[i][0].equals(Mid)) {
                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    am.model.addRow(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "ÇëÊäÈëÕýÈ·Mid");
        }
    }
}
