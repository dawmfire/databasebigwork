package action;

import base.Query;
import view.normal.Administrator;
import view.senior.AdministratorManager;

import javax.swing.*;


public class administratorFindAction {
    String Mid;
    Administrator am;
    String [][] tableHeader;
    AdministratorManager ams;
    Query query;
    public administratorFindAction(String x, Administrator am){
        this.Mid = x;
        this.am = am;
    }
    public administratorFindAction(String x, AdministratorManager ams){
        this.Mid = x;
        this.ams = ams;
    }
    public void actionPerformed(){
        query =new Query();
        tableHeader=query.statrfindSeniorMangerRecords(Mid);

        if (!Mid.equals("")) {
            for (int i = 0; i != ams.model.getRowCount(); ) {
                ams.model.removeRow(0);
            }
            for (int i = 0; i < tableHeader.length; i++) {
                if (tableHeader[i][0].equals(Mid)) {
                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    ams .model.addRow(a);
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "ÇëÊäÈëÕýÈ·Mid");
        }
    }
}
