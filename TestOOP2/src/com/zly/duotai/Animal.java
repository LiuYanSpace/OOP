package com.zly.duotai;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/2 - 08 - 02 - 15:29
 * @Description:
 * @version:1.0 1.猫、狗、小猪都有一个方法是喊叫，所以向上抽取一个 Animal的父类
 * <p>
 * 现有父类再有子类————继承
 * 现有子类再有父类————泛化
 * <p>
 * 2.多态就是多种形态：同一个行为，不同的子类表现出来的不同形态
 * 多态就是同一个方法调用，然后由于对象不同会产生不同的行为
 * <p>
 * 3.多态的好处，提高代码的扩展性，符合面向对象的设计原则：开闭原则
 * 开闭原则：扩展是开放的，修改是关闭的
 * 注意：多态可以提高代码的扩展性，但扩展性没有达到最好，以后我们会学习反射
 * <p>
 * 4.多态的要素
 * 1）继承
 * 2）重写
 * 3）父类引用指向子类对象
 * Cat c = new Cat();
 * Animal an = c;
 * 将上面的代码合成一行：
 * Animal an = new Cat();
 * 左侧：编译器的类型
 * 右侧：运行期的类型
 * <p>
 * Animal an = new Cat();
 * g.play(c);
 * <p>
 * public void play(Animal an){//代码调用的时候，传入的子类对象Animal an = an =new Cat();
 * an.shout();
 * }
 * 上面的代码也是多态的一种非常常见的应用场合：父类当方法的形参，然后传入的是具体的子类的对象，然后调用同一个方法，
 * 根据传入的子类的不同展现出来的效果也不同，构成了多态
 */
public class Animal {//父类是动物类
    int age;

    public void shout() {
        System.out.println("我是小动物，我可以喊叫");
    }
}
