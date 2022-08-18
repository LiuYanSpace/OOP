package com.zly;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/29 - 07 - 29 - 11:33
 * @Description:
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个girl类的对象：
        Girl g = new Girl();
        /* g.age = 18;
        System.out.println(g.age);
        */

        //设置年龄
        g.setAge(18);

        //读取年龄
        System.out.println(g.getAge());

    }
}
