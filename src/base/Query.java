package base;

import java.sql.*;
import java.util.ArrayList;

public class Query {
    String Sql;
    ResultSet rs;
    managerRecord ma;
    int columnCount;
    PreparedStatement preSql;
    String[][] tableHeader;
    String [] onePart;

    ArrayList<managerRecord> manager;      //管理员信息储存的集合
    Connection con = JDBC.connectdb("ware", "root", "");
    //登录信息
    public managerRecord startLogin(String x ) {
        Sql = "select * from manager where account=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            managerRecord loginManager = new managerRecord();
            if(rs==null){
                return null;
            }else {
                while (rs.next()) {
                if(rs.getString(8).equals(x)){
                    loginManager.setId(rs.getInt(1));
                    loginManager.setName(rs.getString(2));
                    loginManager.setSex(rs.getString(3));
                    loginManager.setAge(rs.getInt(4));
                    loginManager.setPhone(rs.getString(5));
                    loginManager.setSalary(rs.getDouble(6));
                    loginManager.setWarehouseID(rs.getInt(7));
                    loginManager.setAccount(rs.getString(8));
                    loginManager.setPassword(rs.getString(9));
                    return loginManager;
                }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // 高级管理员查看管理员信息
    public String[][] statrSeniorManagerRecordQuery() {
        Sql="select * from manager";
        try {
            preSql=con.prepareStatement(Sql);
            rs= preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager=new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                ma.setSex(rs.getString(3));
                ma.setAge(rs.getInt(4));
                ma.setPhone(rs.getString(5));
                ma.setSalary(rs.getDouble(6));
                ma.setWarehouseID(rs.getInt(7));
                ma.setAccount(rs.getString(8));
                ma.setPassword(rs.getString(9));
                manager.add(ma);
            }
            tableHeader = new String[manager.size()][columnCount];
            for (int i = 0; i < manager.size(); i++) {
                ma = manager.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(ma.getId());
                    } else if (j == 1) {
                        tableHeader[i][j] = ma.getName();
                    } else if (j == 2) {
                        tableHeader[i][j] = ma.getSex();
                    } else if (j == 3) {
                        tableHeader[i][j] = String.valueOf(ma.getAge());
                    } else if (j == 4) {
                        tableHeader[i][j] = ma.getPhone();
                    }else if (j == 5) {
                        tableHeader[i][j] = String.valueOf(ma.getSalary());
                    }else if (j == 6) {
                        tableHeader[i][j] = String.valueOf(ma.getWarehouseID());
                    }else if (j == 7) {
                        tableHeader[i][j] = ma.getAccount();
                    }else {
                        tableHeader[i][j] = ma.getPassword();
                    }
                }
            }con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }
    //普通管理员查看普通管理员信息
    public String[][] statrManagerRecordQuery(){
        Sql="select Mid,name,sex,phone,Wid from manager";
        try {
            preSql=con.prepareStatement(Sql);
            rs= preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager=new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                if(rs.getString(3).equals("m")){
                    ma.setSex("男");
                }else{
                    ma.setSex("女");
                }
                ma.setPhone(rs.getString(4));
                ma.setWarehouseID(rs.getInt(5));
                manager.add(ma);
            }
            tableHeader = new String[manager.size()][columnCount];
            for (int i = 0; i < manager.size(); i++) {
                ma = manager.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(ma.getId());
                    } else if (j == 1) {
                        tableHeader[i][j] = ma.getName();
                    } else if (j == 2) {
                        tableHeader[i][j] = ma.getSex();
                    } else if (j == 3) {
                        tableHeader[i][j] = ma.getPhone();
                    } else {
                        tableHeader[i][j] = String.valueOf(ma.getWarehouseID());
                    }
                }
            }con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }
    //普通管理搜索管理员信息
    public String[][] statrfindMangerRecords(String x ){
        Sql="select Mid,name,sex,phone,Wid from manager where Mid=?";
        try {
            preSql=con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs= preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager=new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                if(rs.getString(3).equals("m")){
                    ma.setSex("男");
                }else{
                    ma.setSex("女");
                }
                ma.setPhone(rs.getString(4));
                ma.setWarehouseID(rs.getInt(5));
                manager.add(ma);
            }
            tableHeader = new String[manager.size()][columnCount];
            for (int i = 0; i < manager.size(); i++) {
                ma = manager.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(ma.getId());
                    } else if (j == 1) {
                        tableHeader[i][j] = ma.getName();
                    } else if (j == 2) {
                        tableHeader[i][j] = ma.getSex();
                    } else if (j == 3) {
                        tableHeader[i][j] = ma.getPhone();
                    } else {
                        tableHeader[i][j] = String.valueOf(ma.getWarehouseID());
                    }
                }
            }con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableHeader;
    }
    //寻找某零件库存情况
    public storePartRecord findOnePart(String x){
        storePartRecord storepart=new storePartRecord();
        Sql="SELECT * from partinout where pname=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs= preSql.executeQuery();
            while (rs.next()) {
                storepart.setPartID(rs.getInt(1));
                storepart.setPartName(rs.getString(2));
                storepart.setAmount(rs.getInt(3));
                storepart.setWarehouseID(rs.getInt(4));
                storepart.setNumber(rs.getInt(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storepart;
    }
    //出入信息更新与插入
    public void insertOrUpdate(storePartRecord storepart){

        try {
            Sql="update part set amount = ? where Pid = ?";
            preSql = con.prepareStatement(Sql);
            preSql.setString(1,String.valueOf(storepart.getAmount()));
            preSql.setString(2,String.valueOf(storepart.getPartID()));
            int ok = preSql.executeUpdate();
            Sql="update store set number = ? where Wid = ?";
            preSql = con.prepareStatement(Sql);
            preSql.setString(1,String.valueOf(storepart.getNumber()));
            preSql.setString(2,String.valueOf(storepart.getWarehouseID()));
            ok = preSql.executeUpdate();
            Sql="insert into inbound(operaterid, pid,intime,inpartamount) values(?, ? ,NOW(), ?)";
            preSql = con.prepareStatement(Sql);
            preSql.setString(1,String.valueOf(storepart.getManagerid()));
            preSql.setString(2,String.valueOf(storepart.getPartID()));
            preSql.setString(3,String.valueOf(storepart.getInoutPartNumber()));
            ok = preSql.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
