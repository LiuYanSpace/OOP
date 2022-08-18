package com.zly01;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/29 - 07 - 29 - 15:43
 * @Description:
 * @version:1.0
 */
public class Tset01 {
    public static void main(String[] args) {
        //创建一个Student的对象：
        Student s1 = new Student();
        s1.setName("nana");
        s1.setAge(18);
        s1.setSex("aaaaa");
        System.out.println(s1.getName() + "-----" + s1.getSex() + "---------" + s1.getAge());

        Student s2 = new Student(18, "菲菲", "aaaaa");
        System.out.println(s2.getName() + "-----" + s2.getSex() + "---------" + s2.getAge());
    }
}
