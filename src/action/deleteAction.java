package action;

import base.Query;
import view.senior.deleteChange;
//--------���ڹ���Ա��������ⷿ��Ϣɾ��-------
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
        //��idΪ��
        qe.deleteInformation(deleteChange.textField1.getText(),choose);


    }
}
