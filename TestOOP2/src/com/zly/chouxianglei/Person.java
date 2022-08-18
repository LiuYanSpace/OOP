package com.zly.chouxianglei;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/5 - 08 - 05 - 10:54
 * @Description:
 * @version:1.0
 4.一个类中如果有方法有抽象方法，这个类也要变成一个抽象类
 5.一个抽象类中有0到n个抽象方法
 */
public abstract class Person {
    //1.在一个类中，会有一类方法，子类对这个方法非常满意，无需重写
    public void eat() {
        System.out.println("一顿不吃");
    }
    //2.在一个类中，会有一类方法，子类对这个方法永远满意，会对这个方法重写
    //3.一个方法去掉方法体，然后被abstract修饰，那么这个方法就变成了一个抽象方法
    public abstract void say();
    public abstract void sleep();
}
//6抽象类可以被其他类继承：
//7一个类继承一个抽象类，那么这个类可以变成抽象类
//8一般子类不会加抽象类，一般会让子类重写父类中的抽象方法
//9子类继承抽象类，就必须重写全部的抽象方法
//10如果子类不想重写全部的抽象方法，那么可以加abstract变成抽象类
class Student extends Person{
    @Override
    public void say() {
        System.out.println("我喜欢说东北话");
    }

    @Override
    public void sleep() {
        System.out.println("东北人喜欢");
    }
}
class Demo{
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //11.抽象类不可以创建抽象类的对象
        //Person p = new Person();

        //12创建子类对象
        Student s = new Student();
        s.say();
        s.sleep();


        //13.多态的写法：父类引用子类对象
        Person p = new Student();
        p.say();
        p.sleep();

    }
}

/*
1.一个抽象类中有0到n个抽象方法
2.在抽象类中定义抽象方法，目的就是为子类提供一个通用的模板
 */