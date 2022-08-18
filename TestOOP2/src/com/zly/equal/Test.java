package com.zly.equal;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 17:59
 * @Description:
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {

        //创建phone类的对象
        Phone p1 = new Phone("华为p40", 2035.98, 2020);
        Phone p2 = new Phone("华为p40", 2035.98, 2020);

        //比较两个对象P1、P2
        //==是比较左右两侧的值是否相等，返回true/false
        System.out.println(p1 == p2);//比较的是地址值
        //object类equals方法
        boolean flag = p1.equals(p2);//底层也仍然是==,比较的是地址值
        System.out.println(flag);

        Cat c = new Cat();
        System.out.println(p1.equals(c));//报错


    }
}
