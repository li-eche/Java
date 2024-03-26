package com.lyk.d2_polymorphism.d5_abstract;

public class Test {
    public static void main(String[] args) {
        //目标：掌握抽象类的好处
        Animal a=new Cat();
        a.setName("叮当猫");
        a.cry();//更好的支持了多态
    }
}
