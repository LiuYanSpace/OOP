package com.zly.finalxiushifu;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/4 - 08 - 04 - 16:28
 * @Description:
 * @version:1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //第一种情况，final修饰一个变量，变量的值不能改变，这个变量变成了字符常量，约定俗成的规定：名字大写
        final int A = 10;//final修饰的是基本数据类型
        //A = 20;报错，不可以修改值


        //第二种情况
        final Dog d = new Dog();//final修饰的是引用数据类型，那么地址值不可以改变
        //d = new Dog();地址值不可以改变
        //d对象的属性依然可以改变
        d.age = 10;
        d.weight = 13.7;

        //第三种情况
        final Dog d2 = new Dog();
        a(d2);

        //第四种情况
        b(d2);

    }
    public static void a(Dog d){
        d = new Dog();
    }

    public static void b(final Dog d){//d被final修饰，不可以改变
        //d = new Dog();错误，

    }

}