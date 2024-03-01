public class Test {
    public static void main(String[] args) {
        //目标：有无使用static修饰成员变量的用法
        //1.类变量的用法
        //类名。类变量(推荐)
        Student.name ="李一库";

        //对象。类变量(不推荐)
        Student s1 = new Student();
        s1.name ="袁崇焕";

        Student s2 =new Student();
        s2.name ="孙传庭";

        System.out.println(s1.name);//
        System.out.println(Student.name);

        //2.实例变量的用法，属于每个对象的变量
        s1.age =23;
        s2.age =18;
        System.out.println(s1.age);
        
    }
}
