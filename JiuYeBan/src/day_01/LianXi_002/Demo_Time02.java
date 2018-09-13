package day_01.LianXi_002;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 计算出生天数
* */
public class Demo_Time02 {
    public static void main(String[] args) throws ParseException {
        Date dt=new Date();
        Scanner sc=new Scanner(System.in);
        System.out.println("请按照指定格式输入出生年月xxxx-xx-xx");
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date dt1 = df.parse(sc.next());



        if(dt.getTime()> dt1.getTime()){
            System.out.println("你出生了"+(dt.getTime() - dt1.getTime())/1000/60/60/24+"天");
        }else{
            System.out.println("你确定你这会出生的？？？？");
        }
    }
}
