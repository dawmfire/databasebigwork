package action;

import base.Query;
import base.managerRecord;
import view.senior.updatePerson;

public class addOrupdateManager {
    updatePerson updatePerson;
    String operate;
    public addOrupdateManager(updatePerson updatePerson, String operate) {
    this.updatePerson = updatePerson;
    this.operate = operate;
        startupdatePerson();
    }
    public void startupdatePerson( ){
        managerRecord ma =new managerRecord();  // ����������ݴ�������
        ma.setId(Integer.valueOf(updatePerson.textField9.getText()));  //����
        ma.setName(updatePerson.textField1.getText());          // ����
        if(updatePerson.textField6.getText().equals("��")) {         //�Ա�
            ma.setSex("m");
        }else{
            ma.setSex("w");
        }
        ma.setAge(Integer.valueOf(updatePerson.textField5.getText())); //����
        ma.setPhone(updatePerson.textField4.getText());//�绰
        ma.setSalary(Integer.valueOf(updatePerson.textField3.getText()));//����
        ma.setWarehouseID(Integer.valueOf(updatePerson.textField2.getText()));//�����ⷿ
        ma.setAccount(updatePerson.textField7.getText());//�˺�
        ma.setPassword(updatePerson.textField8.getText());//����
        Query qe =new Query();
        qe.updateaddManager(operate,ma);


    }
}
