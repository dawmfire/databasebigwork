package action;

import base.Query;
import base.partRecord;
import base.storePartRecord;
import view.senior.updatePart;

public class addOrupdatePart {
    updatePart updatePart;
    String operate;
    public addOrupdatePart(updatePart updatePart, String operate) {
        this.updatePart = updatePart;
        this.operate = operate;
        startupdatePart();
    }
    public void startupdatePart(){
        Query qe = new Query();


        partRecord part = new partRecord();
        part.setPartName(updatePart.textField2.getText());
        part.setSpecs(updatePart.textField3.getText());
        part.setPrice(Double.valueOf(updatePart.textField4.getText()));
        //�����Ϊ0�����ڸ��µĲ��裬Ϊ0��������������
        /*
        ��������warehouseidΪ����������ֶ��ֽ������������Ϊ���������һ�����
        ����Ψ���ԿⷿidΪ�����������и���store�������
         */
        if(Integer.valueOf(updatePart.textField5.getText())!=0){
            storePartRecord sd =qe.findOnePart(updatePart.textField2.getText());
            if(sd.getAmount()>Integer.valueOf(updatePart.textField5.getText())){
                int x=sd.getAmount()-Integer.valueOf(updatePart.textField5.getText());
                part.setWareAmount(sd.getNumber()-x);
            }else{
                int x=Integer.valueOf(updatePart.textField5.getText())-sd.getAmount();
                part.setWareAmount(sd.getNumber()+x);
            }
            part.setAmount(Integer.valueOf(updatePart.textField5.getText()));

        }else{
            String[][] widInformation =qe.findwarehouseRecord(updatePart.textField6.getText());
            part.setAmount(0);
            part.setWareAmount(Integer.valueOf(widInformation[0][5]));
        }
        part.setWarehouseID(Integer.valueOf(updatePart.textField6.getText()));
        qe.updateaddPart(operate,part);
    }
}
