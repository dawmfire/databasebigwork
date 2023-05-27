package action;

import base.Query;
import base.managerRecord;
import view.Login;
import view.normal.ManageOperate;
import view.senior.SeniorManageOperate;
import javax.swing.*;
import java.awt.event.ActionEvent;

//---------登录处理---------

public class LoginAction   {
    private  Login login;

    public LoginAction(Login login) {
        this.login = login;
    }

    public void actionPerformed(ActionEvent e) {
        Query  qe = new Query();
        //获取输入账号的信息，以账号为条件搜索
        managerRecord ma = qe.startLogin(login.textField1.getText());
        //判断是否存在账号
        if(ma!=null){
            //判断密码是否正确
            if(ma.getPassword().equals(String.valueOf(login.passwordField1.getPassword()))){
                //高级管理员与普通管理员是不一样的，账号长度不一样
               if(ma.getAccount().matches("[0-9]{6}")){
                        new SeniorManageOperate(ma);
                        login.dispose();
                }else{
                    new ManageOperate(ma);
                    login.dispose();
                }

            }else{
                JOptionPane.showMessageDialog(null, "密码错误");
            }
        }else{
            JOptionPane.showMessageDialog(null, "查无此账号");
        }
    }
}
