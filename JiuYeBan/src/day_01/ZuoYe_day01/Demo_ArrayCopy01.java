package day_01.ZuoYe_day01;
/*八、现有一个字符数组{'i','t','c','a','s','a'}，
        请使用System类中的arraycopy()方法在控制台输出“itcast”。
        （提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）*/
public class Demo_ArrayCopy01 {
    public static void main(String[] args) {
        char[] ch={'i','t','c','a','s','a'};
        System.arraycopy(ch,1,ch,5,1);
        String str=new String(ch);
        System.out.println(str);

    }
}
