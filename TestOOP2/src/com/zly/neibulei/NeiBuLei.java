package com.zly.neibulei;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/13 - 08 - 13 - 9:57
 * @Description:
 * @version:1.0
 * 1.类的组成
 * 属性、方法、构造器、代码块（普通块、静态块、构造块、同步块），内部类

 * 2.一个类的内部类叫内部类

 * 3.内部类：成员内部类、局部内部类（方法内、块内、构造器内）

 * 4.成员内部类:
 * 1）里面有属性、方法、构造器等
 * 2）修饰符：private/default/protect/public/final/abstract
 */
public class NeiBuLei {
    //非静态的成员内部类
    public class D {
        String name;
        int age = 20;

        public void method() {
            //内部类可以访问外部类的内容
            //System.out.println(age);
            int age = 30;

            //内部类和外部类属性重名的时候如何调用
            System.out.println(age);//30
            System.out.println(this.age);//20
            System.out.println(NeiBuLei.this.age);//10

        }
    }

    //静态成员内部类
    static class E {
        public void method() {
            //System.out.println(age);
            //a();
            //静态内部类只可以访问被static修饰的内容
            System.out.println(height);
            f();
        }

    }

    //属性
    int age = 10;
    static double height;

    //方法
    public void a() {
        System.out.println("这是a方法");

        {
            System.out.println("这是一个普通块");

            class B {

            }
        }
        class A {

        }

        //System.out.println(name);
        //外部类访问内部类需要创建对象
        D d = new D();
        System.out.println(d.name);
        d.method();

    }

    //静态方法
    public static void f() {

    }

    static {
        System.out.println("这是一个静态块");
    }

    {
        System.out.println("这是一个构造块");
    }

    //构造器
    public NeiBuLei() {
        class C {

        }

    }

    public NeiBuLei(int age) {
        this.age = age;
    }
}

class Demo {
    public static void main(String[] args) {
        //创建外部类的对象
        NeiBuLei n = new NeiBuLei();
        n.a();

        //创建内部类的对象
        //静态的成员内部类创建对象
        NeiBuLei.E e = new NeiBuLei.E();

        //非静态的成员内部类创建对象
        //NeiBuLei.D d = new NeiBuLei.D();
        NeiBuLei n2 = new NeiBuLei();
        NeiBuLei.D d = n2.new D();
    }

}
