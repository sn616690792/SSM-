package day_01.LianXi_001;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
请使用日期时间相关的API，计算出一个人已经出生了多少天
  */
public class Function {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        System.out.println("请按照格式输入出生日期yyyy-MM-dd");
        String str = sc.next();
        //将出生日期格式化
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dft.parse(str);
        //出生日期 时间毫秒值
        long a = date1.getTime();
        //当前日期 时间毫秒值
        long b = date.getTime();
        long c = b - a;
        //  DateFormat dft1=new SimpleDateFormat("yyyy-MM-dd");
        //把时间毫秒值 转换成以天为单位
        long d = c / (1000 * 60 * 60 * 24);
        System.out.println("出生天数为:" + d + "天");
    }
}
