package day_01.ZuoYe_day01;

/*分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
        计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。*/
public class Demo_StringBuilder {
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        String a ="";
        for (int i = 0; i < 100000; i++) {
            a += "append";
        }
        long c = System.currentTimeMillis();
        System.out.println("共用时"+(c-b)+"毫秒");
        System.out.println("========================");
        long d = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("append");
        }
        long e = System.currentTimeMillis();
        System.out.println("共用时"+(e-d)+"毫秒");


    }
}
