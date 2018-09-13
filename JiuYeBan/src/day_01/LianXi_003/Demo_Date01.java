package day_01.LianXi_003;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo_Date01 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        Date date1=new Date(1000*60*60*24);
        System.out.println(date);
        System.out.println(date1);

        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        String a = df.format(date);
        System.out.println(a);
        System.out.println("============");
        Date b = df.parse(a);
        System.out.println(b);
        System.out.println("==============");
        Scanner sc =new Scanner(System.in);
        System.out.println("输入你的出生年月_格式:yyyy年MM月dd日");
        String c=sc.nextLine();
        Date d = df.parse(c);
        System.out.println(d);
        //出生时间毫秒值
        long q = d.getTime();
        long w = date.getTime();
        System.out.println("你出生了："+(w-q)/1000/60/60/24+"天");

        System.out.println("===============");

    }
}
