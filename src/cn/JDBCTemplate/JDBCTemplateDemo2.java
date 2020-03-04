package cn.JDBCTemplate;

import cn.druid.JDBCutils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo2 {

    //junit 单元测试 DML语句 （增删改）

    //1修改数据 id 3  name 值
    //1.获取JDBCTemplate对象
    JdbcTemplate template=new JdbcTemplate(JDBCutils.getDataSource());
    @Test
    public void test1(){
        //2.定义sql
        String sql="update c_tt set name=? where id=3";
        int count=template.update(sql,"kfc");
        System.out.print(count);
    }


    //2添加一条记录
    @Test
    public void test2(){
        String sql="insert into c_tt (id,text,name) values(?,?,?)";
        int count=template.update(sql,null,"王五","烧饼");
        System.out.print(count);
    }

    //3删除刚添加的记录
    @Test
    public void test3(){
        String sql="delete from c_tt where id=?";
        int count =template.update(sql,9);
        System.out.print(count);
    }

    //4查询ID为3的记录，将其封装到map集合
    @Test
    public void  test4(){
        String sql="select * from c_tt where id=?";
        Map<String,Object> map=template.queryForMap(sql,2);
        System.out.print(map);
    }

    //5查询所有数据将其封装为list
    @Test
    public void test5(){
        String sql="select * from c_tt";
        List<Map<String ,Object>> list=template.queryForList(sql);
        //遍历list结果集
        for(Map<String ,Object> key :list){
            System.out.println("id:"+ key.get("id")+" text:是"+key.get("text")+" name值是："+key.get("name"));
        }
    }

    //6查询所有记录 ，将其封装到ccc对象的list集合
    @Test
    public void test6(){
        String sql="select * from c_tt";

        //将查询到的结果集 重新封装到Ccc类对象的List中
        List<Ccc> list=template.query(sql, new RowMapper<Ccc>() {
            @Override
            public Ccc mapRow(ResultSet rs, int i) throws SQLException {
                Ccc ccc=new Ccc();
                int id=rs.getInt("id");
                String text=rs.getString("text");
                String name=rs.getString("name");

                ccc.setId(id);
                ccc.setText(text);
                ccc.setName(name);

                return ccc;
            }
        });

        for(Ccc ccc:list){
            System.out.println(ccc);
        }
    }


    //6_2查询所有记录，用JDBCTemolate中的方法将其封装到ccc对象的list集合
    @Test
    public void test6_2(){
        String sql="select * from c_tt";
        List<Ccc> list=template.query(sql,new BeanPropertyRowMapper<Ccc>(Ccc.class));
        for(Ccc ccc:list){ //ccc 相当于 php foreach (xxx as key=> value) 中的 key  （可以随意重写）
          System.out.println(ccc);
           // System.out.println(ccc.getId());
        }

    }

    //假设接收到前端提交的数据，一个一个赋值到ccc类中后，测试能不能直接获取到CCC类对象的值
    @Test
    public void test7(){
        Ccc ccc=new Ccc();
        ccc.setName("aaa");
        ccc.setText("Baa");
        ccc.setId(333);
      System.out.println(ccc);
    }


    //测试templt 按参数查找数据，然后返回一个对象
    @Test
    public void  test8(){
        String sql = "SELECT * FROM c_tt WHERE id = ?";
        int id=2;
        Ccc ccc=template.queryForObject(sql,new BeanPropertyRowMapper<Ccc>(Ccc.class),id);
        System.out.println(ccc);

    }
}
