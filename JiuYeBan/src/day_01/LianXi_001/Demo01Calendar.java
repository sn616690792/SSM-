package day_01.LianXi_001;

import java.util.Calendar;
import java.util.Date;

public class Demo01Calendar {
    public static void main(String[] args) {
        //Calendar类抽象类调用静态方法
        Calendar cal=Calendar.getInstance();
        //System.out.println(cal);
        //获取当前日历时间值
        //年
        int a = cal.get(Calendar.YEAR);
        System.out.println(a);
        //月   中国日历记得+1
        int b = cal.get(Calendar.MONTH)+1;
        System.out.println(b);
        //日
        int c = cal.get(Calendar.DATE);
        System.out.println(c);
        System.out.println("======================");
        //自定义日历时间
        cal.set(Calendar.YEAR,2300);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("=======================");
        //日历偏移   正数为加  负数为减
        cal.add(Calendar.YEAR,200);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("=======================");
        //转换为Date 形式
        Date d = cal.getTime();
        System.out.println(d);

    }
}
