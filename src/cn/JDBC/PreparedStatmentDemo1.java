package cn.JDBC;

import java.sql.*;

public class PreparedStatmentDemo1 {
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
        PreparedStatement pstmt=conn.prepareStatement(sql);
        //执行sql 不需要传递sql
        ResultSet rs= pstmt.executeQuery();

        //获取数据 遍历结果集
        while (rs.next()){
            int id=rs.getInt(2); //数据下标是2 理解从表头1开始，1算表头行，2才从表格中取数据
            String name=rs.getString("name");
            String text=rs.getString("text");

            System.out.println("id " +id+"名称："+name+"内容："+text);
        }

       // System.out.println(rs);
        //释放资源
        rs.close();
        pstmt.close();
        conn.close();

        UpdateTest("2123dfd");

    }



    public static void UpdateTest(String name) throws SQLException {
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
        String sql="update c_tt set name=? where id=2 ";
        //执行sql的对象
        PreparedStatement pstmt=conn.prepareStatement(sql);
        //给 ?赋值
        pstmt.setString(1,name);
        //执行sql
        int rs= pstmt.executeUpdate();

        //获取数据 遍历结果集
        System.out.print(rs);

        //释放资源
        pstmt.close();
        conn.close();
    }
}
