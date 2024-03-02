public class Test {
    public static void main(String[] args) {
        //目标：掌握有无static修饰方法的用法
        //1.类方法的用法
        //类型.(推荐)
        Student.printHelloWorld();

        //通过对象，不推荐
        Student s =new Student();
        s.printHelloWorld();

        //2.实例方法的用法
        //对象，实例方法
        s.printPass();
        //
    }
}
