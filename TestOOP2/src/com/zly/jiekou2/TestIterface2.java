package com.zly.jiekou2;

import com.zly.duotai.Demo;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/5 - 08 - 05 - 14:19
 * @Description:
 * @version:1.0
 */
public interface TestIterface2 {
    //常量
    public static final int NUM = 10;

    //抽象方法
    public abstract void a();

    //public default非抽象方法
    public default void b(){
        System.out.println("------TestIterface2-----");
    }

    //静态方法
    public static void c2(){
        System.out.println("TestInterface2里面的静态方法");
    }

    class demo implements TestIterface2 {
        @Override
        public void a() {
            System.out.println("重写了a方法");
        }
    }

    public static void c(){
        System.out.println("Demo中的静态方法c方法");
    }
}

class A{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
    }
}
