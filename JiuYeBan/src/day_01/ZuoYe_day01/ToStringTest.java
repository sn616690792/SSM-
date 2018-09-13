package day_01.ZuoYe_day01;

public class ToStringTest{
    static int i= 1;
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }


    public static void main(String args[]){
        ToStringTest b = new ToStringTest();
        String s1 = b.toString();
        String s = "love "+s1;
        System.out.println(s);//love java
        ToStringTest a = new ToStringTest();
        a.i++;
        System.out.println("me " + a.i);//me 2
    }
}
