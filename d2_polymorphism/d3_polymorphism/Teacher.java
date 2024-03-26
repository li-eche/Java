package com.lyk.d2_polymorphism.d3_polymorphism;

public class Teacher extends People {
    public String name ="子类Teacher的名称";
    @Override
    public void run(){
        System.out.println("老师气喘吁吁");
    }

    public void teach(){
        System.out.println("老师需要教知识--");
    }

}

