package 十届;

public class 试题C数列求值 {
    public static void main(String[] args) {
        int[] a=new int[20190325];
        a[1]=1;
        a[2]=1;
        a[3]=1;
        for (int i = 4; i <=20190324; i++) {
            a[i]=(a[i-1]+a[i-2]+a[i-3])%10000;
        }
        System.out.println(a[20190324]);
    }
}

