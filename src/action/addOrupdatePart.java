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
        Query qe1 = new Query();
        Query qe2 = new Query();

        partRecord part = new partRecord();
        part.setPartName(updatePart.textField2.getText());//零件名字
        part.setSpecs(updatePart.textField3.getText());//零件规格
        part.setPrice(Double.valueOf(updatePart.textField4.getText()));//零件价格
        //如果不为0，属于更新的步骤，为0属于添加零件步骤
        /*
        更新若以warehouseid为条件，则出现多种结果，若以名字为主，则出现一个结果
        插入唯有以库房id为条件，来进行更新store表的数据
         */
        if(Integer.valueOf(updatePart.textField5.getText())!=0){
            storePartRecord sd =qe.findOnePart(updatePart.textField2.getText());
            //判断更新的零件的存量是否大于之前的存量，是否需要更改之前的库存信息。
            if(sd.getAmount()>Integer.valueOf(updatePart.textField5.getText())){
                int x=sd.getAmount()-Integer.valueOf(updatePart.textField5.getText());
                part.setWareAmount(sd.getNumber()-x);
            }else{
                int x=Integer.valueOf(updatePart.textField5.getText())-sd.getAmount();
                part.setWareAmount(sd.getNumber()+x);
            }
            part.setAmount(Integer.valueOf(updatePart.textField5.getText()));

        }else{

            String[][] widInformation =qe1.findwarehouseRecord(updatePart.textField6.getText());
            part.setAmount(0);
            part.setWareAmount(Integer.valueOf(widInformation[0][5]));
        }
        part.setWarehouseID(Integer.valueOf(updatePart.textField6.getText()));
        qe2.updateaddPart(operate,part);
    }
}
