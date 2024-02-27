public class text {
    public static void main(String[] args) {
        //目标：掌握实体类的书写要求，特点，应用场景。
        Student s1 = new Student();
        s1.setNa("李一库");
        s1.setScore(99);
        System.out.println(s1.getNa());
        System.out.println(s1.getScore());

        StudentOp operator =new StudentOp(s1);
        operator.printPass();


    }
}
