package day_01.LianXi_003;

import java.util.Calendar;
import java.util.Date;

public class Demo_calendar01 {
    public static void main(String[] args) {
        Calendar cl=Calendar.getInstance();
        int a = cl.get(Calendar.YEAR);
        System.out.println(a);
        int b = cl.get(Calendar.MONTH)+1;
        System.out.println(b);
        int c = cl.get(Calendar.DATE);
        System.out.println(c);
        //因为是用星期日作为第一天，所以为了转换为中国通用的算法，所以是用方法week进行转换
        int d = cl.get(Calendar.DAY_OF_WEEK);
        String week = week(d);
        System.out.println(week);
        System.out.println("=================");
        //自定义时间 年月日均可 分开定义
        cl.set(Calendar.YEAR,1945);
        int e=cl.get(Calendar.YEAR);
        System.out.println(e);
        cl.set(Calendar.MONTH,6);
        System.out.println(cl.get(Calendar.MONTH));
        System.out.println("==================");
        //可将时间进行加减
        cl.add(Calendar.YEAR,10);
        int f=cl.get(Calendar.YEAR);
        System.out.println(f);
        System.out.println("=====================");
        //转换为
        Date date=cl.getTime();
        System.out.println(date);
    }
    public static String week(int a){
        //0索引位置没有星期
        String[] array={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return array[a];
    }
}
