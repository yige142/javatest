package cn.JDBCTemplate;

import cn.druid.JDBCutils;
import org.springframework.jdbc.core.JdbcTemplate;

//JDBCTemplate入门
public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包 commons-logging1.2; spring-beans; spring-core; spring-jdbc; spring-tx
        //2.创建JDBCTemplate对象
        JdbcTemplate template=new JdbcTemplate(JDBCutils.getDataSource()); //引入druidutils测试工具类
        //3.调用方法
        String sql="update c_tt set name=? where id=5";
        int count=template.update(sql,"xiexiaomao");
        System.out.print(count);

    }
}
