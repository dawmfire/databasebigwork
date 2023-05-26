package action;

import base.Query;
import base.bound;
import view.senior.InOutBoundRecords;

public class inoutRevealRecord {
    InOutBoundRecords inOutBoundRecords;
    String operater;
    public String[][] tableHeader;

    public inoutRevealRecord(InOutBoundRecords inOutBoundRecords, String operater) {
        this.inOutBoundRecords = inOutBoundRecords;
        this.operater = operater;
        startRecords();
    }

    private void startRecords() {
        Query qe = new Query();
        bound bo = new bound();
        tableHeader = qe.inoutlookRecord(operater);
        for (int i = 0; i != inOutBoundRecords.model.getRowCount(); ) {
            inOutBoundRecords.model.removeRow(0);
        }
        for (int i = 0; i < tableHeader.length; i++) {


            String[] a = new String[tableHeader[i].length];
            for (int j = 0; j < tableHeader[i].length; j++) {
                a[j] = tableHeader[i][j];
            }
            inOutBoundRecords.model.addRow(a);

        }
    }
}
