package cn.Demo.demo01;

import javax.naming.Name;
import java.util.ArrayList;


public class DemoArrayListChar {
    public static void main(String[] args) {
        //输出集合格式 {xxx-@-cccc-@-zzz}

        ArrayList<String> list= new ArrayList<>();
        list.add("谢小盟");
        list.add("谢小米");
        list.add("谢小毛");
     //   System.out.println(list);
         aa(list);
        System.out.println(dd("zxc"));
    }

    private static String dd(String name) {
        return name;
    }

    private static void aa(ArrayList<String> list){
        System.out.print("{");
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                System.out.print(list.get(i)+"}");
            }else{
                System.out.print(list.get(i)+"-@-");
            }
        }
    }
}
