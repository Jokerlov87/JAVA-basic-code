package 十四届;

import java.util.Scanner;

public class 试题C数组分割 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();//有T组数据

        for (long i = 0; i < T; i++) {
            long N = sc.nextLong();

            long odd=0,even=0;
            for (long j = 0; j < N; j++) {
                long x = sc.nextLong();
                if(x%2!=0){
                    odd++;
                }else{
                    even++;
                }
            }
            long sum=0,mod=1000000007;
            if(odd%2!=0){
                System.out.println(sum);;
            }else{
                sum=1;
                for (long l = 1; l <= even; l++) {
                    sum*=2;
                    sum%=mod;
                }
                for (long l = 1; l <= odd - 1; l++) {
                    sum*=2;
                    sum%=mod;
                }
                System.out.println(sum);
            }
        }
    }
}



