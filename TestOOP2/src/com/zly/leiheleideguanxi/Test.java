package com.zly.leiheleideguanxi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 18:56
 * @Description:
 * @version:1.0 1.面向对象的思维:找参与者：男孩类、女孩类
 * 2.形参、实参
 * 3.类和类可以产生关系：
 * 1）将一个类作为另一个类中的方法的形参：
 */
public class Test {
    public static void main(String[] args) {
        //创建一个Boy类的具体对象
        Boy b = new Boy(30, "鹿晗");
        //创建一个Girl类的具体对象
        Girl g = new Girl("关晓彤", 100.8);

        //谈恋爱
        g.love(b);

        //跟妈妈聊天
        //g.m = new Mom();
        g.wechat();

    }
}
