package com.zly02;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/29 - 07 - 29 - 17:40
 * @Description:02
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建子类Student的对象
        Student s = new Student();
        s.setSno(1001);
        s.setName("菲菲");
        s.setAge(18);
        s.setHeight(180.4);
        System.out.println("学生名字为：" + s.getName() + "----学生年龄为：" + s.getAge() + "----学生学号为：" + s.getSno() + "------学生身高为：" + s.getHeight());


        //访问方法
        s.eat();
        s.study();
        s.sleep();
    }
}
