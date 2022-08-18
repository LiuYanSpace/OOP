package com.zly.equal;

import java.util.Objects;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/30 - 07 - 30 - 17:56
 * @Description:
 * @version:1.0
 */
public class Phone {
    //属性
    private String brand;//品牌
    private double price;//价格
    private int year;//生产年份


    //方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //构造器
    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }
         /*对equals方法进行重写
         public boolean equals(Object obj){
          /*instanceof
          a instanceof b:
          判断a 对象是否是b这个类的实例，如果是返回true,不是返回false
           */

          /*if(obj instanceof Phone) {//属于Phone类的对象

           //将obj转为Phone类型：
           Phone other = (Phone) obj;

           if (this.getBrand() == other.getBrand() && this.getPrice() == other.getPrice() && this.getYear() == other.getYear()) {
            return true;
           }
          }
          return false;
         }
         */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 && year == phone.year && Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
