package com.zly.fangfachongxie;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 15:18
 * @Description:
 * @version:1.0
 */
/*
1.重写：
发生在子类和父类中，当子类对父类提供的方法不满意，要对父类的方法进行重写
2.格式要求
子类的方法名和父类必须一致，参数列表（个数、类型、顺序）也要和父类一样
3.重载和重写的区别
 */
public class Student extends Person {
    //方法重写
    public void eat() {
        System.out.println("我喜欢吃小龙虾");
    }

    public void study() {
        System.out.println("学习");
    }
}
