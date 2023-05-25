package action;

import base.Query;
import base.bound;
import base.managerRecord;
import base.storePartRecord;
import view.normal.Outbound;
import view.normal.Storage;

import javax.swing.*;

public class storeAction {
    managerRecord ma;
    Storage in;
    storePartRecord storepart;
    bound record;
    public storeAction(managerRecord ma, Storage in) {
        this.ma =ma;
        this.in =in;

    }

    public void inRecord() {
        Query qe = new Query();
        //��ȡ����ֵ�����
        storepart = qe.findOnePart(in.textField2.getText());
        record= new bound();
        //�ж��Ƿ�����������ڿⷿ��
        if (storepart != null) {
            //�ж�����Ƿ����ͬһ���ⷿ����ֹ�洢����ⷿ
            if(storepart.getWarehouseID()== ma.getWarehouseID()) {
                storepart.setManagerid(ma.getId());
                //�жϳ��������Ƿ������������
                if(Integer.valueOf(in.textField3.getText())<=storepart.getNumber()) {
                    //���ʣ����������
                    storepart.setNumber(storepart.getNumber()+Integer.valueOf(in.textField3.getText()));
                    //�����������
                    storepart.setAmount(storepart.getAmount()+Integer.valueOf(in.textField3.getText()));
                    //�������
                    storepart.setInoutPartNumber(Integer.valueOf(in.textField3.getText()));
                    qe.insertOrUpdate(storepart);
                }else{
                    JOptionPane.showMessageDialog(null, "�òֿ���Ϊ"+
                            storepart.getNumber()+"�����������");
                }
            }else{
                JOptionPane.showMessageDialog(null, "����" +
                        "ϵ�ⷿidΪ"+storepart.getWarehouseID()+"�Ĺ���Ա���");
            }
        }else{
            JOptionPane.showMessageDialog(null, "���޴����������ϵ�߼���" +
                    "��Ա��������Ϣ");
        }
    }
}

