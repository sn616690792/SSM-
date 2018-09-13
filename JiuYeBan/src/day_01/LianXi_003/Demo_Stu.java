package day_01.LianXi_003;

public class Demo_Stu {
    public static void main(String[] args) {
        Student stu=new Student("周杰伦",78,"喝豆奶");
        Student stu1=new Student("毕福剑",38,"吃馒头");
        Student stu2=new Student("周杰伦",78,"喝豆奶");
        System.out.println(stu);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("=========================");
        System.out.println(stu==stu1);
        System.out.println(stu==stu2);
        System.out.println("=========================");
        System.out.println(stu.equals(stu1));
        System.out.println(stu.equals(stu2));

    }
}
