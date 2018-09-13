package day_01.LianXi_001;

import java.util.Arrays;

public class SystemLianXi {
    public static void main(String[] args) {
        getTime();
    }

    public static void getTime() {
        long l = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            System.out.println("我X你"+i);


        }
        long c=System.currentTimeMillis();
        System.out.println("共用时"+(c-l)+"毫秒");


        System.out.println("===============");
        String[] cc={"124","43","2312","12","3214","2"};
        /*for (int i = 0; i < cc.length; i++) {
            System.out.println(cc[i]);
        }
        System.out.println(cc);*/
    }
}
