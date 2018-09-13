package day_01.LianXi_001;

public class ShuJuZhuanHuan001 {
    public static void main(String[] args) {
        //转换前 必须确保转换前后类型对应！！！！
        //将 字符串 转换为 字符
        String c="男";
        char c1=c.charAt(0);
        System.out.println(c1);
        //将字符串转换为int类型
        String  a="123";
        Integer a1=Integer.parseInt(a);
        System.out.println(a1);
        //将字符串转换为布尔值
        String b="true";
        boolean b1=Boolean.parseBoolean(b);
        System.out.println(b1);

    }
}
