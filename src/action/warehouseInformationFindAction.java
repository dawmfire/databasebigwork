package action;

import base.Query;
import view.normal.WarehouseInformation;
import view.senior.WarehouseInformationManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//�ⷿ������Ӧ
public class warehouseInformationFindAction {
    WarehouseInformation warehouse;
    String widname;
    String [][] tableHeader;
    Query qe = new Query();
    DefaultTableModel model;
    WarehouseInformationManager warehouseInformationManager;
    //��ͨ����Ա����
    public warehouseInformationFindAction(WarehouseInformation warehouse) {

        this.warehouse = warehouse;
        widname=warehouse.textField1.getText();
        tableHeader=qe.findwarehouseRecord(widname);
        model=warehouse.model;
        warefindRecord();

    }
    //�߼�����Ա����
    public warehouseInformationFindAction(WarehouseInformationManager warehouseInformationManager) {

        this.warehouseInformationManager = warehouseInformationManager;
        widname=warehouseInformationManager.textField1.getText();
        tableHeader=qe.findwarehouseRecord(widname);
        model=warehouseInformationManager.model;
        warefindRecord();
    }

    public  void  warefindRecord(){
        //����ɾ�������ԭ�е�����
        if (!widname.equals("")) {
            for (int i = 0; i!=model.getRowCount(); ) {
                model.removeRow(0);
            }
            //Ȼ�������µĶ�ά�����ڵ�������ѯ����
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
            JOptionPane.showMessageDialog(null, "��������ȷ�ⷿ��");
        }
    }
}
