package base;

public class warehouseRecord {
    private int warehouseID;    // �ⷿid
    private String warehouseName;   // �ⷿ����
    private String address; // ��ַ
    private double area;  // �ⷿ��ռ���
    private int managermunber;//�����ⷿ�Ĺ�������
    private int number;     //ʣ������
    private int Capamount;  // ��������
    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getManagermunber() {
        return managermunber;
    }

    public void setManagermunber(int managermunber) {
        this.managermunber = managermunber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapamount() {
        return Capamount;
    }

    public void setCapamount(int capamount) {
        Capamount = capamount;
    }
}
