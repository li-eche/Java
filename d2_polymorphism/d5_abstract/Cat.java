package com.lyk.d2_polymorphism.d5_abstract;

public class Cat extends Animal {
    @Override
    public void cry(){
        System.out.println(getName()+"喵喵的叫");
    }
}
