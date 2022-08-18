package com.zly.jiekou2;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/5 - 08 - 05 - 14:09
 * @Description:
 * @version:1.0
 */
public interface TestInterface {
    //常量
    public static final int NUM = 10;

    //抽象方法
    public abstract void a();

    //public default修饰的非抽象方法
    public default void b(){
        System.out.println("-------interface-----------");
    }

}

class Test implements TestInterface{
    public void c(){
        //用一下接口中的b方法
        b();//可以
        TestInterface.super.b();

    }

    @Override
    public void a() {
        System.out.println("重写了a方法");
    }

    @Override
    public void b() {//default必须省略
        TestInterface.super.b();
    }
}
