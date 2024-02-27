public class Student {
    //1 必须私有成员变量，并为每个成员变量提供get set 方法
    private String na;
    private static double score;

    //2 必须为类提供一个公开的无参数构造器

    public Student() {
    }

    public Student(String na, double score) {
        this.na = na;
        this.score = score;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public static double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
