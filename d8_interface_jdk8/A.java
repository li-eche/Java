package com.lyk.d8_interface_jdk8;

public class A {
//    1.默认方法，必须使用deefault修饰，默认会被public修饰
//    实例方法：对象方法，必须使用实现类的对象来访问
    default void  test1(){
        System.out.println("默认方法");
        test2();
    }

    //2.私有方法，必须使用private修饰，（jdk 9开始支持的）
    //私有方法，对象的方法
    private void test2(){
        System.out.println("私有方法" +
                "");
    }

    //静态方法，必须static修饰
    public static void test3(){
        System.out.println("静态方法");
    }
}
