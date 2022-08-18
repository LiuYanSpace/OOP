package com.zly.duotai;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 19:25
 * @Description:
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        //具体的猫的对象
        //Cat c = new Cat();
        //具体的小女孩的对象
        //Girl g = new Girl();
        //小女孩跟猫玩
        //g.play(c);

        //具体的狗的对象
        // Dog d = new Dog();
        //小女孩跟狗玩耍
        // g.play(d);


        //具体的小女孩的对象
        Girl g = new Girl();
        //优化
        //跟小动物玩
        Cat c = new Cat();
        Animal an = c;
        g.play(c);

        Dog d = new Dog();
        Animal an2 = d;
        g.play(d);

        Pig p = new Pig();
        Animal an3 = p;
        g.play(p);
    }
}
