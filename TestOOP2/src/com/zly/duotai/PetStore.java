package com.zly.duotai;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/2 - 08 - 02 - 17:50
 * @Description:
 * @version:1.0

  父类做方法的返回值类型，真实返回的对象可以是该类的任意一个子类对象
 1.定义一个static方法，通过类名直接调用
 2.返回值类型是父类类型，返回的可以是任意子类类型
 3.传入一个字符类型的参数，工厂可以根据参数创建对应的子类产品


 */
public class PetStore {//宠物店---工厂类
    //方法：提供动物
    public static  Animal getAnimal(String petName){//多态应用
        Animal an = null;

        if("猫".equals(petName)){//petName.equals("猫”）---容易发生空指针异常
            an = new Cat();
        }

        if("狗".equals(petName)){
            an = new Dog();
        }

        if("小猪".equals(petName)){
            an = new Pig();
        }


        return an;
    }


}
