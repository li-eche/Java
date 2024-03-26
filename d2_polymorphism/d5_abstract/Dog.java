package com.lyk.d2_polymorphism.d5_abstract;

public class Dog extends Animal{
    @Override
    public void cry(){
        System.out.println(getName()+"汪汪汪的叫---");
    }
}
