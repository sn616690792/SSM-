package day_01.LianXi_001;

public class Demo_system01 {
    public static void main(String[] args) {
        //当前时间毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println("==============");
        //数组的拷贝
        int[] a={11,22,33,44,55,66,77,88,99};
        int[] b=new int[10];
        System.arraycopy(a,2,b,0, 4);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
