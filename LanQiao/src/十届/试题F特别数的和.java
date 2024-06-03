package 十届;

import java.util.Scanner;

public class 试题F特别数的和 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if(is(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean is(int n){
        while(n!=0){
            int ge=n%10;
            if(ge==2||ge==0||ge==1||ge==9){
                return true;
            }
            n/=10;
        }
        return false;
    }
}
