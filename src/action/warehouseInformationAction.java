package action;

import base.Query;
import view.normal.WarehouseInformation;

import javax.swing.*;

public class warehouseInformationAction {
    WarehouseInformation warehouse;
    String widname;
    String [][] tableHeader;
    public warehouseInformationAction(WarehouseInformation warehouse) {
        this.warehouse = warehouse;
    }
    public  void  warefindRecord(){
        widname=warehouse.textField1.getText();
        Query qe = new Query();
        tableHeader=qe.findwarehouseRecord(widname);
        if (!widname.equals("")) {
            for (int i = 0; i<warehouse.tableHeader.length; i++) {
                warehouse.model.removeRow(0);
            }
            System.out.println(tableHeader.length);
            for (int i = 0; i < tableHeader.length; i++) {

                if (tableHeader[i][1].equals(widname)) {
                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    warehouse.model.addRow(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "请输入正确库房名");
        }
    }
}
