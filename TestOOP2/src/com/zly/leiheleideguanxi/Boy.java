package com.zly.leiheleideguanxi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 18:46
 * @Description:
 * @version:1.0
 */
public class Boy {
    //属性
    int age;
    String name;

    //方法
    public void buy() {
        System.out.println("谈恋爱，买买买");

    }

    //构造器
    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
