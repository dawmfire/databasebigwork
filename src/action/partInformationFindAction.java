package action;

import base.Query;
import view.normal.PartInformation;
import view.senior.PartInformationManager;

import javax.swing.*;
//���������Ӧ
public class partInformationFindAction {
    PartInformation partInformation;
    PartInformationManager partInformationManager;
    String [][] tableHeader;
    String pname;
    String text;
    public partInformationFindAction(PartInformation partInformation, String pname) {
        this.partInformation = partInformation;
        this.pname = pname;
    }
        //�߼�����Ա����

    public partInformationFindAction(PartInformationManager partInformationManager, String text) {
        this.partInformationManager = partInformationManager;
        this.text = text;
        findpartManagerRecord();
    }

    //��ͨ����Ա������
    public void findpartRecord(){
        Query qe =new Query();
        tableHeader=qe.findpartRecord(pname);
        if (!pname.equals("")) {
            for (int i = 0; i!=partInformation.model.getRowCount(); ) {
                partInformation.model.removeRow(0);
            }
            for (int i = 0; i < tableHeader.length; i++) {

                if (tableHeader[i][1].equals(pname)) {

                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    partInformation.model.addRow(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "��������ȷ�����");
        }

    }
    //�߼�����Ա������
    public void findpartManagerRecord(){
        Query qe =new Query();
        tableHeader=qe.findpartRecord(text);
        if (!text.equals("")) {
            for (int i = 0; i!=partInformationManager.model.getRowCount(); ) {
                partInformationManager.model.removeRow(0);
            }
            for (int i = 0; i < tableHeader.length; i++) {

                if (tableHeader[i][1].equals(text)) {

                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    partInformationManager.model.addRow(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "��������ȷ�����");
        }

    }
    }

