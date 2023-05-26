package action;

import base.Query;
import base.warehouseRecord;
import view.senior.updateWarehouse;

public class addOrupdateWarehouse {
    updateWarehouse updateWarehouse;
    String operate;
    public addOrupdateWarehouse(updateWarehouse updateWarehouse, String operate) {
        this.updateWarehouse = updateWarehouse;
        this.operate = operate;
        startupdateWarehouse();
    }

    private void startupdateWarehouse() {
        Query qe = new Query();
        warehouseRecord  wa= new warehouseRecord();
        wa.setWarehouseID(Integer.valueOf(updateWarehouse.textField4.getText()));
        wa.setWarehouseName(updateWarehouse.textField2.getText());
        wa.setArea(Double.valueOf(updateWarehouse.textField6.getText()));
        wa.setAddress(updateWarehouse.textField3.getText());
        qe.updateaddWarehouse(wa,operate);
    }
}
