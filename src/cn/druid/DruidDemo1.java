package cn.druid;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;


public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入jia包 druid
        //2.定义配置文件druid.properties
        //3.加载配置文件
        Properties pro=new Properties();
        InputStream is=DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn=ds.getConnection();
        System.out.print(conn);
    }


}
