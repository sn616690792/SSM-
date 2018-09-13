package day_01.LianXi_001;

import day_01.LianXi_001.toStringLianXi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class person  {
    public static void main(String[] args) throws ParseException {
        toStringLianXi tt=new toStringLianXi("王小明",23);
        toStringLianXi tt1=new toStringLianXi("李小壮",13);
        toStringLianXi tt2=new toStringLianXi("王小明",23);
        System.out.println(tt);
        //equals比较
        System.out.println(tt.equals(tt1));
        System.out.println(tt.equals(tt2));
        System.out.println("================================");
        //时间练习
        //打印当前时间 与自定义时间
        Date date=new Date();
        Date date1=new Date(1000*60*60);
        System.out.println(date);
        System.out.println(date1);
        //时间毫秒值
        System.out.println(date.getTime());
        System.out.println(date1.getTime());
        System.out.println("========================================");
        //日期时间自定义 并按照指定格式打印
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
        System.out.println(df.format(date));
        System.out.println("===========================================");
        //将字符串时间解析为Date对象
        String str="2018-03-21";
        DateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
        Date date3=df1.parse(str);
        System.out.println(date3);
    }
}
