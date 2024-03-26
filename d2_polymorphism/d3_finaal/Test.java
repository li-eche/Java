package com.lyk.d2_polymorphism.d3_finaal;

public class Test {
    //final修饰静态成员变量 一定要赋一个值，又称为常量，名称全部大写，多个单词下划线连接
    public static final String School_Name = "黑马";

    private final String name ="组八戒";//这种方法没有意义
    public static void main(String[] args) {

        //目标：认识final作用
        //3.final可以修饰变量：有且只能赋值一次
        //变量
//        //1 局部变量
//        2 成员变量
//            1.静态成员变量
//            2实例成员变量

        //1 修饰局部变量
        final int a;
        a=12;
        //a =13//第二次赋值，出错了

        final double r =3.14;
        //r =0.1//第二次赋值出错了

        final int[] arr ={11,22,33};
        //arr =null;第二次赋值出错了
        //修改地址值不行.但是修改里面的数据是可以的
        arr[1] =222;

        schoolName ="白马";

    }
    public static void  boy(final double z){

    }
}
//1.final修饰类，类不需要继承
final class A{}
class B extends  A{};

//2.final修饰方法，方法不能被重写了
class C{
    public final void test(){

    }
}
class D extends C{
    @Override
    public void test(){

    }
}


