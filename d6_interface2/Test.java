package com.lyk.d6_interface2;

import com.lyk.d2_polymorphism.d5_abstract.Animal;
import com.lyk.d2_polymorphism.d5_abstract.Cat;
import com.lyk.d2_polymorphism.d6_abstact_template.Student;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚接口的好处
        Driver s=new A();
        s.driver();

        Driver d = new A();
        d.driver();

        Animal a = new Cat();
        a.cry();
    }
}

class B implements Driver{
    @Override
    public void drive(){

    }
}

class A extends Student implements Driver,Singer{


    @Override
    public void driver() {

    }

    @Override
    public void sing() {

    }
}

class Student{

}

interface Driver{
    void driver();

}

interface Singer{
    void sing();
}
