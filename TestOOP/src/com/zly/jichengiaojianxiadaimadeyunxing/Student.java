package com.zly.jichengiaojianxiadaimadeyunxing;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 16:46
 * @Description:
 * @version:1.0
 */
public class Student extends Person {
    double height;

    public Student() {
    }

    public Student(int age, String name, double height) {
        super(age, name);
        this.height = height;
    }
}
