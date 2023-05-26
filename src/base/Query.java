package base;

import java.sql.*;
import java.util.ArrayList;

public class Query {
    String Sql;
    ResultSet rs;
    managerRecord ma;
    partRecord pa;
    warehouseRecord wa;
    int columnCount;
    PreparedStatement preSql;
    String[][] tableHeader;
    String[] oneManager;
    ArrayList<warehouseRecord> ware;    // 库房信息的集合
    ArrayList<partRecord> part;  //零件信息的集合
    ArrayList<managerRecord> manager;      //管理员信息储存的集合
    Connection con = JDBC.connectdb("ware", "root", "");

    //登录信息
    public managerRecord startLogin(String x) {
        Sql = "select * from manager where account=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            managerRecord loginManager = new managerRecord();
            if (rs == null) {
                return null;
            } else {
                while (rs.next()) {
                    if (rs.getString(8).equals(x)) {
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
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 高级管理员查看管理员信息
    public String[][] statrSeniorManagerRecordQuery() {
        Sql = "select * from manager";
        try {
            preSql = con.prepareStatement(Sql);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager = new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                if (rs.getString(3).equals("m")) {
                    ma.setSex("男");
                } else {
                    ma.setSex("女");
                }
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
                    } else if (j == 5) {
                        tableHeader[i][j] = String.valueOf(ma.getSalary());
                    } else if (j == 6) {
                        tableHeader[i][j] = String.valueOf(ma.getWarehouseID());
                    } else if (j == 7) {
                        tableHeader[i][j] = ma.getAccount();
                    } else {
                        tableHeader[i][j] = ma.getPassword();
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }

    //普通管理员查看普通管理员信息
    public String[][] statrManagerRecordQuery() {
        Sql = "select Mid,name,sex,phone,Wid from manager";
        try {
            preSql = con.prepareStatement(Sql);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager = new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                if (rs.getString(3).equals("m")) {
                    ma.setSex("男");
                } else {
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
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }

    //普通管理搜索管理员信息
    public String[][] statrfindMangerRecords(String x) {
        Sql = "select Mid,name,sex,phone,Wid from manager where Mid=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager = new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                if (rs.getString(3).equals("m")) {
                    ma.setSex("男");
                } else {
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
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableHeader;
    }

    //高级管理员搜索管理员信息
    public String[][] statrfindSeniorMangerRecords(String x) {
        Sql = "select * from manager where Mid=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            manager = new ArrayList<>();
            while (rs.next()) {
                ma = new managerRecord();
                ma.setId(rs.getInt(1));
                ma.setName(rs.getString(2));
                if (rs.getString(3).equals("m")) {
                    ma.setSex("男");
                } else {
                    ma.setSex("女");
                }
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
                    } else if (j == 5) {
                        tableHeader[i][j] = String.valueOf(ma.getSalary());
                    } else if (j == 6) {
                        tableHeader[i][j] = String.valueOf(ma.getWarehouseID());
                    } else if (j == 7) {
                        tableHeader[i][j] = ma.getAccount();
                    } else {
                        tableHeader[i][j] = ma.getPassword();
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }

    //寻找某零件库存情况(用于出入库）
    public storePartRecord findOnePart(String x) {
        storePartRecord storepart = new storePartRecord();
        Sql = "SELECT * from partinout where pname=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
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
    public void insertOrUpdate(storePartRecord storepart) {

        try {
            Sql = "update part set amount = ? where Pid = ?";
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, String.valueOf(storepart.getAmount()));
            preSql.setString(2, String.valueOf(storepart.getPartID()));
            int ok = preSql.executeUpdate();
            Sql = "update store set number = ? where Wid = ?";
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, String.valueOf(storepart.getNumber()));
            preSql.setString(2, String.valueOf(storepart.getWarehouseID()));
            ok = preSql.executeUpdate();
            Sql = "insert into inbound(operaterid, pid,intime,inpartamount) values(?, ? ,NOW(), ?)";
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, String.valueOf(storepart.getManagerid()));
            preSql.setString(2, String.valueOf(storepart.getPartID()));
            preSql.setString(3, String.valueOf(storepart.getInoutPartNumber()));
            ok = preSql.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    //显示个人信息
    public String[] revealPerson(String x) {
        Sql = "select * from manager where account=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            while (rs.next()) {
                oneManager = new String[columnCount];
                oneManager[0] = String.valueOf(rs.getInt(1));
                oneManager[1] = rs.getString(2);
                if (rs.getString(3).equals("m")) {
                    oneManager[2] = "男";
                } else {
                    oneManager[2] = "女";
                }
                oneManager[3] = String.valueOf(rs.getInt(4));
                oneManager[4] = rs.getString(5);
                oneManager[5] = String.valueOf(rs.getDouble(6));
                oneManager[6] = String.valueOf(rs.getInt(7));
                oneManager[7] = rs.getString(8);
                oneManager[8] = rs.getString(9);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return oneManager;
    }

    //搜索零件信息
    public String[][] statrpartRecord() {
        Sql = "select * from part";
        try {
            preSql = con.prepareStatement(Sql);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            part = new ArrayList<>();
            while (rs.next()) {
                pa = new partRecord();
                pa.setPartID(rs.getInt(1));
                pa.setPartName(rs.getString(2));
                pa.setSpecs(rs.getString(3));
                pa.setPrice(rs.getDouble(4));
                pa.setAmount(rs.getInt(5));
                pa.setWarehouseID(rs.getInt(6));
                part.add(pa);
            }
            tableHeader = new String[part.size()][columnCount];
            for (int i = 0; i < part.size(); i++) {
                pa = part.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(pa.getPartID());
                    } else if (j == 1) {
                        tableHeader[i][j] = pa.getPartName();
                    } else if (j == 2) {
                        tableHeader[i][j] = pa.getSpecs();
                    } else if (j == 3) {
                        tableHeader[i][j] = String.valueOf(pa.getPrice());
                    } else if (j == 4) {
                        tableHeader[i][j] = String.valueOf(pa.getAmount());
                    } else {
                        tableHeader[i][j] = String.valueOf(pa.getWarehouseID());
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }

    //寻找某个零件
    public String[][] findpartRecord(String x) {
        Sql = "select * from part where pname=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            part = new ArrayList<>();
            while (rs.next()) {
                pa = new partRecord();
                pa.setPartID(rs.getInt(1));
                pa.setPartName(rs.getString(2));
                pa.setSpecs(rs.getString(3));
                pa.setPrice(rs.getDouble(4));
                pa.setAmount(rs.getInt(5));
                pa.setWarehouseID(rs.getInt(6));
                part.add(pa);
            }
            tableHeader = new String[part.size()][columnCount];
            for (int i = 0; i < part.size(); i++) {
                pa = part.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(pa.getPartID());
                    } else if (j == 1) {
                        tableHeader[i][j] = pa.getPartName();
                    } else if (j == 2) {
                        tableHeader[i][j] = pa.getSpecs();
                    } else if (j == 3) {
                        tableHeader[i][j] = String.valueOf(pa.getPrice());
                    } else if (j == 4) {
                        tableHeader[i][j] = String.valueOf(pa.getAmount());
                    } else {
                        tableHeader[i][j] = String.valueOf(pa.getWarehouseID());
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }

    //搜索库房信息
    public String[][] startwarehouseRecords() {

        Sql = "select * from warefind";
        try {
            preSql = con.prepareStatement(Sql);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            ware = new ArrayList<>();
            while (rs.next()) {
                wa = new warehouseRecord();
                wa.setWarehouseID(rs.getInt(1));
                wa.setWarehouseName(rs.getString(2));
                wa.setAddress(rs.getString(3));
                wa.setArea(rs.getDouble(4));
                wa.setManagermunber(rs.getInt(5));
                wa.setNumber(rs.getInt(6));
                wa.setCapamount(rs.getInt(7));
                ware.add(wa);
            }
            tableHeader = new String[ware.size()][columnCount];
            for (int i = 0; i < ware.size(); i++) {
                wa = ware.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(wa.getWarehouseID());
                    } else if (j == 1) {
                        tableHeader[i][j] = wa.getWarehouseName();
                    } else if (j == 2) {
                        tableHeader[i][j] = wa.getAddress();
                    } else if (j == 3) {
                        tableHeader[i][j] = String.valueOf(wa.getArea());
                    } else if (j == 4) {
                        tableHeader[i][j] = String.valueOf(wa.getManagermunber());
                    } else if (j == 5) {
                        tableHeader[i][j] = String.valueOf(wa.getNumber());
                    } else {
                        tableHeader[i][j] = String.valueOf(wa.getCapamount());
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }

    //查找库房信息
    public String[][] findwarehouseRecord(String x) {
        Sql = "select * from warefind where widname=?";
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setString(1, x);
            rs = preSql.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();// 获得元数据的数据集对象
            columnCount = metadata.getColumnCount();
            ware = new ArrayList<>();
            while (rs.next()) {
                wa = new warehouseRecord();
                wa.setWarehouseID(rs.getInt(1));
                wa.setWarehouseName(rs.getString(2));
                wa.setAddress(rs.getString(3));
                wa.setArea(rs.getDouble(4));
                wa.setManagermunber(rs.getInt(5));
                wa.setNumber(rs.getInt(6));
                wa.setCapamount(rs.getInt(7));
                ware.add(wa);
            }
            tableHeader = new String[ware.size()][columnCount];
            for (int i = 0; i < ware.size(); i++) {
                wa = ware.get(i);
                for (int j = 0; j < columnCount; j++) {
                    if (j == 0) {
                        tableHeader[i][j] = String.valueOf(wa.getWarehouseID());
                    } else if (j == 1) {
                        tableHeader[i][j] = wa.getWarehouseName();
                    } else if (j == 2) {
                        tableHeader[i][j] = wa.getAddress();
                    } else if (j == 3) {
                        tableHeader[i][j] = String.valueOf(wa.getArea());
                    } else if (j == 4) {
                        tableHeader[i][j] = String.valueOf(wa.getManagermunber());
                    } else if (j == 5) {
                        tableHeader[i][j] = String.valueOf(wa.getNumber());
                    } else {
                        tableHeader[i][j] = String.valueOf(wa.getCapamount());
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableHeader;
    }


    //高级管理员

    //添加更新管理员
    public void updateaddManager(String x, managerRecord ma) {
        if (x.equals("添加")) {
            Sql = "insert into manager(name,sex,age,phone,salary,Wid,account,password) values(?,?,?,?,?,?,?,?)";
            try {
                preSql = con.prepareStatement(Sql);
                preSql.setString(1, ma.getName());
                preSql.setString(2, ma.getSex());
                preSql.setInt(3, ma.getAge());
                preSql.setString(4, ma.getPhone());
                preSql.setDouble(5, ma.getSalary());
                preSql.setInt(6, ma.getWarehouseID());
                preSql.setString(7, ma.getAccount());
                preSql.setString(8, ma.getPassword());
                int ok = preSql.executeUpdate();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            Sql = "update manager set name = ?, sex=?,age=?,phone=?,salary=?,Wid=?" +
                    ",account=?,password=? where Mid = ?";
            try {
                preSql = con.prepareStatement(Sql);
                preSql.setString(1, ma.getName());
                preSql.setString(2, ma.getSex());
                preSql.setInt(3, ma.getAge());
                preSql.setString(4, ma.getPhone());
                preSql.setDouble(5, ma.getSalary());
                preSql.setInt(6, ma.getWarehouseID());
                preSql.setString(7, ma.getAccount());
                preSql.setString(8, ma.getPassword());
                preSql.setInt(9, ma.getId());
                int ok = preSql.executeUpdate();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }

    //删除功能 (库房，管理员，零件信息）
    public void deleteInformation(String text, String choose) {
        if (choose.equals("管理员")) {
            Sql = "delete from manager where Mid=?";
        } else if (choose.equals("库房")) {
            Sql = "delete from warehouse where Wid=?";
        } else {
            Sql = "delete from part where Pid=?";
        }
        try {
            preSql = con.prepareStatement(Sql);
            preSql.setInt(1, Integer.valueOf(text));
            int ok = preSql.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //添加更新零件
    public void updateaddPart() {

    }

    //添加更新库房
    public void updateaddWarehouse() {

    }

    //出入库记录

}
