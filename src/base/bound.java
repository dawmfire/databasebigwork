package base;

public class bound {

    private int managerID; //����Աid
    private int partID;         // ���id
    private String time;        //��¼ʱ��
    private String partName;    // �������
    private String managerName; //����Ա����
    private int inoutpartamount; //����������������¼��ʾ���ã�
    private int boundID;//��¼id
    private int partAmount;  //�����������������ڳ������ã�

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
