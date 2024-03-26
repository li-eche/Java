package com.lyk.d2_polymorphism;

public class Teacher extends People{
    public String name ="子类Teacher的名称";
    @Override
    public void run(){
        System.out.println("老师气喘吁吁");
    }

}
