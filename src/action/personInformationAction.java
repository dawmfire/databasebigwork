package action;

import base.Query;
import base.managerRecord;
import view.normal.PersonalInformation;

public class personInformationAction {
    managerRecord ma;
    PersonalInformation personalInformation;

    public personInformationAction(managerRecord ma, PersonalInformation personalInformation) {
        this.ma = ma;
        this.personalInformation = personalInformation;
    }
    public void reveal(){
        Query qe = new Query();
        String[] person=qe.revealPerson(ma.getAccount());   // 储存个人信息
        personalInformation.label11.setText(person[0]);
        personalInformation.label12.setText(person[1]);
        personalInformation.label13.setText(person[2]);
        personalInformation.label14.setText(person[3]);
        personalInformation.label15.setText(person[4]);
        personalInformation.label16.setText(person[5]);
        personalInformation.label17.setText(person[6]);
        personalInformation.label19.setText(person[7]);
        personalInformation.label21.setText(person[8]);

    }

}
