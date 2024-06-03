package 十三届;

import java.util.Scanner;

public class 试题C字符统计 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=new String();
        S=sc.next();
        int[] a=new int[26];
        for (int i = 0; i < S.length(); i++) {
            a[S.charAt(i)-'A']++;
        }
        int maxIndex=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=a[maxIndex]){
                maxIndex=i;
            }
        }
        int max=a[maxIndex];
        for (int i = 0; i < a.length; i++) {
            if(a[i]==max){
                System.out.print((char)('A'+i));
            }
        }

    }
}
