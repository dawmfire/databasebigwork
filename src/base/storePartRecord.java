package base;

//作用验证出入库时候，出入情况是否正确

public class storePartRecord {
    private int partID;  // 零件id
    private String partName;  //零件名字
    private int amount; // 零件数量
    private int warehouseID; //库房id
    private int number;//库房剩余量
    private int inoutPartNumber; //出入库数量

    public int getInoutPartNumber() {
        return inoutPartNumber;
    }

    public void setInoutPartNumber(int inoutPartNumber) {
        this.inoutPartNumber = inoutPartNumber;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
