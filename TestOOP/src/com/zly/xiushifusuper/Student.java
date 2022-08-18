package com.zly.xiushifusuper;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 15:41
 * @Description:
 * @version:1.0 1.super指的是父类
 * 2.super可以修饰属性、方法
 * 在子类的方法中可以通过super.属性、super.方法的方式，显示的去调用父类提供的属性、方法。在通常情况下super. 可以省略不写
 * 3.当子类和父类的属性、方法重名时，super.不能省略
 * 4.super修饰构造器
 */
public class Student extends Person {
    double score;
    int age = 20;

    public void study() {
        System.out.println("学习");
    }

    public void a() {
        System.out.println(age);//20
        System.out.println(super.age);//10
        System.out.println(this.age);//20

    }
}
