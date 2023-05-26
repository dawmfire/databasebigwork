package base;

public class bound {

    private int managerID; //管理员id
    private int partID;         // 零件id
    private String time;        //记录时间
    private String partName;    // 零件名字
    private String managerName; //管理员名字
    private int inoutpartamount; //出入库零件数量（记录显示所用）
    private int boundID;//记录id
    private int partAmount;  //出入库零件数量（用于出入所用）

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getBoundID() {
        return boundID;
    }

    public void setBoundID(int boundID) {
        this.boundID = boundID;
    }

    public int getPartAmount() {
        return partAmount;
    }

    public void setPartAmount(int partAmount) {
        this.partAmount = partAmount;
    }

    public int getInoutpartamount() {
        return inoutpartamount;
    }

    public void setInoutpartamount(int inoutpartamount) {
        this.inoutpartamount = inoutpartamount;
    }
}
