package com.zly.duotai;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 19:25
 * @Description:
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //具体的小女孩的对象
        Girl g = new Girl();

        //跟小动物玩
        Animal an = PetStore.getAnimal("小猪");
        Animal an2 = PetStore.getAnimal("狗");
        g.play(an);
        g.play(an2);
    }
}
