package com.lyk.d2_polymorphism.d6_abstact_template;

public class People {
//    设计模板方法
public void write(){
    System.out.println("\t\t\t《我的爸爸》");
    System.out.println("\t\t总是向你索取却不曾谢谢你");
    System.out.println("每次离开都是装作轻松的样子");
    System.out.println("微笑着说回去吧转身泪湿眼底");

    System.out.println(writeMain());
}
    public abstract boolean writeMain();}

