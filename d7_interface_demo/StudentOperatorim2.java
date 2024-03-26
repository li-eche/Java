package com.lyk.d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorim2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students){
        System.out.println("----全部学生信息如下————");
        for(int i =0;i<students.size();i++) {
            Studnet s = Student.get(i);
            System.out.println("姓名"+);
        }
        System.out.println(——-————————————);
    }
}
    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
        }
        System.out.println("平均分" + (allScores) / students.size());

    }    }
