package com.lyk.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态：对象多态，行为多态
        //1.对象多态：你可能是别人的男朋友，可能是儿子
        People p1 = new Student();
        p1.run();//识别技巧：编译看左边，运行看右边

        People p2 = new Student();
        p2.run();
    }
}
