package com.zly.tostringdefangfa;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 17:44
 * @Description:
 * @version:1.0
 */
/*
toString
1.返回该对象的字符串表示形式
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);//10

        //创建一个student类的具体对象
        Student s = new Student("菲菲", 19, 160.5);
        System.out.println(s.getAge());
        System.out.println(s);//com.zly.tostringdefangfa.Student@1b6d3586
        System.out.println(s.toString());//com.zly.tostringdefangfa.Student@1b6d3586
    }
}
