package cn.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo1 {
    public static void main(String[] args) throws SQLException {
        //mysql jar5包后可以省略driver注册， jar包下的META-INF-serverces\java.sql.driver文件写好注册信息，没写先读那里
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //创建数据库对象
        Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ccc","root","root");
        String aa="dfdsaaa";
        //定义sql语句
       // String sql="update c_tt set name='yige222' where id=2 ";
        String sql="update c_tt set name='"+aa+"' where id=2 ";

        //System.out.print(sql);
        //执行sql的对象
        Statement stmt=conn.createStatement();
        //执行sql
        int count= stmt.executeUpdate(sql);
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
    }
}
