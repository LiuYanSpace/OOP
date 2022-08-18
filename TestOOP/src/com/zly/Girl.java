package com.zly;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/29 - 07 - 29 - 11:31
 * @Description:com.zly.01
 * @version:1.0
 */
/*
封装
1.修饰符private，访问受到限制

2.定义方法来进行限制条件的添加
1）将属性私有化，private
2)提供private方法进行访问
3）
4)set/get快捷键：alt+insert 然后选择getter and setter

3.封装提高代码的安全性

4.权限修饰符有四个

 */
public class Girl {
    //属性
    private int age;
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //读取年龄
    public int getAge() {
        return age;
    }

    //设置年龄
    public void setAge(int age) {
        if (age >= 30) {
            this.age = 18;
        } else {
            this.age = age;
        }


    }

}
