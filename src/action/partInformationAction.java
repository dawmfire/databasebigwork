package action;

import base.Query;
import view.normal.PartInformation;
import javax.swing.*;

public class partInformationAction {
    PartInformation partInformation;
    String [][] tableHeader;
    String pname;
    public partInformationAction(PartInformation partInformation,String pname) {
        this.partInformation = partInformation;
        this.pname = pname;
    }
    public void findpartRecord(){
        Query qe =new Query();
        tableHeader=qe.findpartRecord(pname);
        if (!pname.equals("")) {
            for (int i = 0; i!=partInformation.model.getRowCount(); ) {
                partInformation.model.removeRow(0);
            }
            for (int i = 0; i < tableHeader.length; i++) {

                if (tableHeader[i][1].equals(pname)) {

                    String[] a = new String[tableHeader[i].length];
                    for (int j = 0; j < tableHeader[i].length; j++) {
                        a[j] = tableHeader[i][j];
                    }
                    partInformation.model.addRow(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "请输入正确零件名");
        }

    }

}
