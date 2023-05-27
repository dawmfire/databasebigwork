package action;

import base.Query;
import view.senior.deleteChange;
//--------用于管理员，零件，库房信息删除-------
public class deleteAction {
    deleteChange deleteChange;
    String choose;
    public deleteAction(deleteChange deleteChange, String choose) {
    this.choose=choose;
    this.deleteChange=deleteChange;
        startDelete();
    }
    public void startDelete(){
        Query qe= new Query();
        //以id为主
        qe.deleteInformation(deleteChange.textField1.getText(),choose);


    }
}
