package action;

import base.Query;
import base.managerRecord;
import view.Login;
import view.normal.ManageOperate;
import view.senior.SeniorManageOperate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAction   {
    private  Login login;

    public LoginAction(Login login) {
        this.login = login;
    }

    public void actionPerformed(ActionEvent e) {
        Query  qe = new Query();
        managerRecord ma = qe.startLogin(login.textField1.getText());
        if(ma!=null){
            if(ma.getPassword().equals(String.valueOf(login.passwordField1.getPassword()))){
               if(ma.getAccount().matches("[0-9]{6}")){
                        new SeniorManageOperate(ma);
                        login.dispose();
                }else{
                    new ManageOperate(ma);
                    login.dispose();
                }

            }else{
                JOptionPane.showMessageDialog(null, "√‹¬Î¥ÌŒÛ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "≤ÈŒﬁ¥À’À∫≈");
        }
    }
}
