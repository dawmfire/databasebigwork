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
        managerRecord ma =new managerRecord();  // 将输入的数据储存起来
        ma.setId(Integer.valueOf(updatePerson.textField9.getText()));  //工号
        ma.setName(updatePerson.textField1.getText());          // 姓名
        if(updatePerson.textField6.getText().equals("男")) {         //性别
            ma.setSex("m");
        }else{
            ma.setSex("w");
        }
        ma.setAge(Integer.valueOf(updatePerson.textField5.getText())); //年龄
        ma.setPhone(updatePerson.textField4.getText());//电话
        ma.setSalary(Integer.valueOf(updatePerson.textField3.getText()));//工资
        ma.setWarehouseID(Integer.valueOf(updatePerson.textField2.getText()));//所属库房
        ma.setAccount(updatePerson.textField7.getText());//账号
        ma.setPassword(updatePerson.textField8.getText());//密码
        Query qe =new Query();
        qe.updateaddManager(operate,ma);


    }
}
