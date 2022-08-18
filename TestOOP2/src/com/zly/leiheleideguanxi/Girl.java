package com.zly.leiheleideguanxi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 18:49
 * @Description:
 * @version:1.0
 */
public class Girl {
    //属性
    String name;
    double weight;
    Mom m = new Mom();//重要赋值

    //方法
    public void add(int a) {//参数是基本数据类型
        System.out.println(a);
        System.out.println(a + 100);
    }

    //女孩和妈妈聊天
    public void wechat() {
        m.say();
    }

    //谈恋爱方法
    public void love(Boy b) {//参数是引用数据类型Boy
        System.out.println("我男朋友的名字是：" + b.name + ",我男朋友的年龄是" + b.age);
        b.buy();
    }

    //构造器
    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
