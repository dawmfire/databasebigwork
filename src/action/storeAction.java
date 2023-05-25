package action;

import base.Query;
import base.bound;
import base.managerRecord;
import base.storePartRecord;
import view.normal.Outbound;
import view.normal.Storage;

import javax.swing.*;

public class storeAction {
    managerRecord ma;
    Storage in;
    storePartRecord storepart;
    bound record;
    public storeAction(managerRecord ma, Storage in) {
        this.ma =ma;
        this.in =in;

    }

    public void inRecord() {
        Query qe = new Query();
        //提取输入值零件名
        storepart = qe.findOnePart(in.textField2.getText());
        record= new bound();
        //判断是否搜索到零件在库房中
        if (storepart != null) {
            //判断零件是否存入同一个库房，防止存储多个库房
            if(storepart.getWarehouseID()== ma.getWarehouseID()) {
                storepart.setManagerid(ma.getId());
                //判断出库数量是否大于零件库存数
                if(Integer.valueOf(in.textField3.getText())<=storepart.getNumber()) {
                    //库存剩余数量更新
                    storepart.setNumber(storepart.getNumber()+Integer.valueOf(in.textField3.getText()));
                    //零件数量更新
                    storepart.setAmount(storepart.getAmount()+Integer.valueOf(in.textField3.getText()));
                    //入库数量
                    storepart.setInoutPartNumber(Integer.valueOf(in.textField3.getText()));
                    qe.insertOrUpdate(storepart);
                }else{
                    JOptionPane.showMessageDialog(null, "该仓库库存为"+
                            storepart.getNumber()+"超出库存上限");
                }
            }else{
                JOptionPane.showMessageDialog(null, "请联" +
                        "系库房id为"+storepart.getWarehouseID()+"的管理员入库");
            }
        }else{
            JOptionPane.showMessageDialog(null, "查无此零件，请联系高级管" +
                    "理员添加零件信息");
        }
    }
}

