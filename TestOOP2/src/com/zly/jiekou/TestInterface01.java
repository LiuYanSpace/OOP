package com.zly.jiekou;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/5 - 08 - 05 - 11:30
 * @Description:
 * @version:1.0
 * 1.类是类，接口是接口，它们是同一层次的概念
 * 2.接口中没有构造器
 * 3.接口声明：interface
 * 4.在JDK1.8之前，接口只有常量和抽象方法
 * 1）常量：固定修饰符：public static final
 * 2)抽象方法：固定修饰符：public abstract
 * 注意：修饰符可以省略不写
 *
 */
public interface TestInterface01 {
    //常量
    public static final int NUM = 10;

    //抽象方法
    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String name);
}



    /*5.类和接口的关系：类实现接口。
    // 6实现类要重写接口中的全部的抽象方法
    // 7如果没有全部重写，可以变成一个抽象类
    // 8java单继承，java多实现。
    9.先继承再实现
    10.接口不能创建对象
    11.接口.常量名------来访问

     */
    class Student implements TestInterface01{
        @Override
        public void a() {
            System.out.println();
        }

        @Override
        public void b(int num) {
            System.out.println();
        }

        @Override
        public int c(String name) {
            return 100;
        }
    }
