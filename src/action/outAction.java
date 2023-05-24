package action;

import base.Query;
import base.bound;
import base.managerRecord;
import base.storePartRecord;
import view.normal.Outbound;

import javax.swing.*;

public class outAction {
    managerRecord ma;
    Outbound out;
    storePartRecord storepart;
    bound record;
    public outAction(managerRecord ma, Outbound out) {
        this.ma =ma;
        this.out =out;

    }

    public void outRecord() {
        Query qe = new Query();
        storepart = qe.findOnePart(out.textField2.getText());
        record= new bound();
        //判断是否搜索到零件在库房中
        if (storepart != null) {
            //判断零件是否存入同一个库房，防止存储多个库房
            if(storepart.getWarehouseID()== ma.getWarehouseID()) {
                //判断出库数量是否大于零件库存数
                if(Integer.valueOf(out.textField3.getText())<=storepart.getAmount()) {
                    storepart.setNumber(storepart.getNumber()-Integer.valueOf(out.textField3.getText()));
                    storepart.setAmount(storepart.getAmount()-Integer.valueOf(out.textField3.getText()));
                    storepart.setInoutPartNumber(Integer.valueOf(out.textField3.getText()));
                    qe.insertOrUpdate(storepart);
                }else{
                    JOptionPane.showMessageDialog(null, "当年该零件库存为"+
                            storepart.getAmount()+"不足以出库数量");
                }
            }else{
                JOptionPane.showMessageDialog(null, "请联" +
                        "系库房id为"+storepart.getWarehouseID()+"的管理员出库");
            }
        }else{
            JOptionPane.showMessageDialog(null, "查无此零件，请联系高级管" +
                    "理员添加零件信息");
        }
    }
}
