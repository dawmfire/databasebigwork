package action;

import base.Query;
import view.normal.WarehouseInformation;
import view.senior.WarehouseInformationManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class warehouseInformationAction {
    WarehouseInformation warehouse;
    String widname;
    String [][] tableHeader;
    Query qe = new Query();
    DefaultTableModel model;
    WarehouseInformationManager warehouseInformationManager;
    public warehouseInformationAction(WarehouseInformation warehouse) {

        this.warehouse = warehouse;
        widname=warehouse.textField1.getText();
        tableHeader=qe.findwarehouseRecord(widname);
        model=warehouse.model;
        warefindRecord();

    }

    public warehouseInformationAction(WarehouseInformationManager warehouseInformationManager) {

        this.warehouseInformationManager = warehouseInformationManager;
        widname=warehouseInformationManager.textField1.getText();
        tableHeader=qe.findwarehouseRecord(widname);
        model=warehouseInformationManager.model;
        warefindRecord();
    }

    public  void  warefindRecord(){
        if (!widname.equals("")) {
            for (int i = 0; i!=model.getRowCount(); ) {
                model.removeRow(0);
            }
            System.out.println(tableHeader.length);
            for (int i = 0; i < tableHeader.length; i++) {

                if (tableHeader[i][1].equals(widname)) {
                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    model.addRow(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "请输入正确库房名");
        }
    }
}
