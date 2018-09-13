package day_01.LianXi_002;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_Time {
    public static void main(String[] args) throws ParseException {
        //自定义时间
        Date dt=new Date();
        System.out.println(dt);
        Date dt1=new Date(1000*60*60*24);
        System.out.println(dt1);
        System.out.println("======================");
        //时间毫秒值
        long a = dt.getTime();
        System.out.println(a);
        System.out.println("===================");
        //默认格式打印当前时间
        DateFormat df=new SimpleDateFormat();
        String c = df.format(dt);
        System.out.println(c);
        System.out.println("=======================");
        //自定义时间格式
        DateFormat df1=new SimpleDateFormat("yyyy年MM月dd  HH点mm分ss秒");
        String d = df1.format(dt);
        System.out.println(d);
        System.out.println("===================");
        //将字符串形式的时间 解析成Date格式
        String e=d;
       // System.out.println(e);
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd  HH点mm分ss秒");
        Date ccc = df2.parse(e);
        System.out.println(ccc);
    }
}
