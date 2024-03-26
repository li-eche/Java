package com.lyk.d2_polymorphism.d5_abstract;

public abstract class Animal {
    private String name;

    public abstract void cry(){
        System.out.println("11");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){this.name=name;}

}

