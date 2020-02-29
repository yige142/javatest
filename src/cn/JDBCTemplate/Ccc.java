package cn.JDBCTemplate;

//对应数据库ccc c_tt表
public class Ccc {
    private Integer id;
    private String text;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ccc{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
