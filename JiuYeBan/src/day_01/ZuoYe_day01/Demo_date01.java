package day_01.ZuoYe_day01;

import day_01.Week;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,
// 如2088-08-08 08:08:08。
public class Demo_date01 {
    public static void main(String[] args) throws ParseException {
        //第五题
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
        System.out.println("====================");
        //第六题
        //使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日
        String a="2018-03-04";
        //先解析成Date格式
        DateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
        Date c = df1.parse(a);
        //然后在格式化指定格式的字符串
        DateFormat df2=new SimpleDateFormat("yyyy年MM日dd");
        System.out.println(df2.format(c));
        System.out.println("=======================");
        //第七题
        //七、用程序判断2018年2月14日是星期几
        Calendar cl = Calendar.getInstance();
        /*cl.set(Calendar.YEAR,2018);
        cl.set(Calendar.MONTH,2);
        cl.set(Calendar.DATE,14);*/
        cl.set(2018,2,14);
        int i = cl.get(Calendar.DAY_OF_WEEK);
        String week = week(i);

        System.out.println(week);



    }
    public static String week(int a){
        String[] week={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

        return week[a];
    }
}
