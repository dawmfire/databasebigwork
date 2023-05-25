package action;

import base.Query;
import view.senior.deleteChange;

public class deleteAction {
    deleteChange deleteChange;
    String choose;
    public deleteAction(deleteChange deleteChange, String choose) {
    this.choose=choose;
    this.deleteChange=deleteChange;
    }
    public void startDelete(){
        Query qe= new Query();
        qe.deleteInformation(deleteChange.textField1.getText(),choose);


    }
}
