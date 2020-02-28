package cn.druid;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
*
* druid 连接池工具类
* */
public class JDBCutils {
   //定义成员变量 Datasouce
    private static DataSource ds;
    static{
        try {
            //加载配置文件
            Properties pro=new Properties();
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties"));

            //获取Datasouce
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    //获取链接
    public static Connection getConnection() throws SQLException {
            return ds.getConnection();
    }

    //获取连接池方法
    public static DataSource getDataSource(){
        return ds;
    }

    //释放资源
    public static void close(Statement stmt,Connection conn) throws SQLException {
          if(stmt != null){
              stmt.close();
          }

          if(conn != null){
              conn.close();
          }
    }

    //释放资源重载
    public static void close(ResultSet rs, Statement stmt, Connection conn) throws SQLException {
        if(rs != null){
           rs.close();
        }

        if(stmt != null){
            stmt.close();
        }

        if(conn != null){
            conn.close();
        }
    }

}
