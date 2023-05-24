package base;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {                 //数据库连接配置
    public static Connection connectdb(String user, String id, String password) {
        Connection con =null;
        try{
            String uri ="jdbc:mysql://localhost:3306/"+user+"?useSSL=true&serverTimezone=UTC&characterEncoding=utf-8";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(uri,id,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

}