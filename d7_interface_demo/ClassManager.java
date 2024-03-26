package com.lyk.d7_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();

    public ClassManager(){
        students.add(new Student("迪丽热巴",'女',99));
        students.add(new Student("井厚琦",'男',99));
        students.add(new Student("迪丽",'男',91));
        students.add(new Student("迪丽热",'女',9));

    }
    //打印全班全部学生信息
    public void printInfo(){

    }

    //打印全班全部学生的平均分
    public void printSore(){

    }
}
