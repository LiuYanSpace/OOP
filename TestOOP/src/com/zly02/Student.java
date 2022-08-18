package com.zly02;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/29 - 07 - 29 - 17:36
 * @Description:02
 * @version:1.0 继承的好处，提高代码的复用性
 */
public class Student extends Person {//子类Student 继承 父类Person
    //学生特有的属性
    private int sno;//学号

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //学生特有的方法
    public void study() {
        System.out.println("学生可以学习");
    }

}
