package base;

//������֤�����ʱ�򣬳�������Ƿ���ȷ

public class storePartRecord {
    private int partID;  // ���id
    private String partName;  //�������
    private int amount; // �������
    private int warehouseID; //�ⷿid
    private int number;//�ⷿʣ����
    private int inoutPartNumber; //���������

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
