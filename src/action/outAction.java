package action;

import base.Query;
import base.inoutBound;
import base.managerRecord;
import base.storePartRecord;
import view.normal.Outbound;

import javax.swing.*;

//---------��ͨ����Ա�ĳ��⴦��

public class outAction {
    managerRecord ma;
    Outbound out;
    storePartRecord storepart;
    inoutBound record;
    public outAction(managerRecord ma, Outbound out) {
        this.ma =ma;
        this.out =out;

    }

    public void outRecord() {
        Query qe = new Query();
        //��ȡ����ֵ�����
        storepart = qe.findOnePart(out.textField2.getText());
        record= new inoutBound();
        //�ж��Ƿ�����������ڿⷿ��
        if (storepart != null) {
            //�ж�����Ƿ����ͬһ���ⷿ����ֹ�洢����ⷿ
            if(storepart.getWarehouseID()== ma.getWarehouseID()) {
                storepart.setManagerid(ma.getId());
                //�жϳ��������Ƿ������������
                if(Integer.valueOf(out.textField3.getText())<=storepart.getAmount()) {
                    //���ʣ����������
                    storepart.setNumber(storepart.getNumber()-Integer.valueOf(out.textField3.getText()));
                    //�����������
                    storepart.setAmount(storepart.getAmount()-Integer.valueOf(out.textField3.getText()));
                    //��������
                    storepart.setInoutPartNumber(Integer.valueOf(out.textField3.getText()));
                    qe.insertOrUpdate(storepart);
                }else{
                    JOptionPane.showMessageDialog(null, "�����������Ϊ"+
                            storepart.getAmount()+"�����Գ�������");
                }
            }else{
                JOptionPane.showMessageDialog(null, "����" +
                        "ϵ�ⷿidΪ"+storepart.getWarehouseID()+"�Ĺ���Ա����");
            }
        }else{
            JOptionPane.showMessageDialog(null, "���޴����������ϵ�߼���" +
                    "��Ա��������Ϣ");
        }
    }
}
