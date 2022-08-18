package com.zly.superxiushigouzaoqi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 16:06
 * @Description:
 * @version:1.0
 */
public class Student extends Person {
    double score;

    //空构造器:其实我们平时写的空构造器的第一行都有super(调用父类的空构造器)，一般省略不写
    //所有构造器的第一行默认情况下都有super
    public Student() {
        /*super();*/

    }

    public Student(double score) {
        this.score = score;
    }

    public Student(int age, String name, double score) {
        //super、this都只能放在第一行
        super(age, name);//super(age,name);利用super来调用父类构造器
        //super.age = age;
        // super.name = name;
        this.score = score;


    }
}
