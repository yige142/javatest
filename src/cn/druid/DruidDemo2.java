package cn.druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//调测jdbcutils工具类
public class DruidDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn =null;
        PreparedStatement pstmt=null;
        //添加一条记录
       try {
           //1.获取连接
           conn =JDBCutils.getConnection();
           //2.定义SQL
           String sql="insert into c_tt values(null,?,?)";
           //3.获取pstmt对象
           pstmt=conn.prepareStatement(sql);
           //4.给？赋值
           pstmt.setString(1,"ffdsf2");
           pstmt.setString(2,"aaaaa");
           //5.执行sql
           int count=pstmt.executeUpdate();
           System.out.print(count);
       }catch (SQLException e){
           e.printStackTrace();
       }finally {
           //6.释放资源
           JDBCutils.close(pstmt,conn);
       }

   }
}
