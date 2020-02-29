package cn.JDBC;

import java.sql.*;

public class ResultsetDemo1 {
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
        String sql="select  * from c_tt ";

        // System.out.print(sql);
        //执行SQL对象
        Statement stmt=conn.createStatement();
        //执行sql
        ResultSet rs= stmt.executeQuery(sql);

        //获取数据 遍历结果集
        while (rs.next()){
            int id=rs.getInt(1); //collumnindex 根据哪一列取值
            String name=rs.getString("name");
            String text=rs.getString("text");

            System.out.println("id " +id+"名称："+name+"内容："+text);
        }

       // System.out.println(rs);
        //释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
