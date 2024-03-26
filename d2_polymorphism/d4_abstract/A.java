package com.lyk.d2_polymorphism.d4_abstract;

public class A {
    //抽象类不能创建对象，
    public String name;
    public static String schoolName;

    public A(){

    }

    public A(String name){
        this.name =name;
    }

    public abstract void run();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }
}
