package base;

public class warehouseRecord {
    private int warehouseID;    // 库房id
    private String warehouseName;   // 库房名字
    private String address; // 地址
    private double area;  // 库房所占面积
    private int managermunber;//所属库房的管理人数
    private int number;     //剩余容量
    private int Capamount;  // 上限容量
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
