package action;

import base.Query;
import base.bound;
import view.senior.InOutBoundRecords;

public class inoutRevealRecord {
    InOutBoundRecords inOutBoundRecords;
    String operater;
    public inoutRevealRecord(InOutBoundRecords inOutBoundRecords, String operater) {
        this.inOutBoundRecords = inOutBoundRecords;
        this.operater = operater;
        startRecords();
    }

    private void startRecords() {
        Query qe = new Query();
        bound bo= new bound();
        qe.inoutlookRecord(operater);

    }
}
