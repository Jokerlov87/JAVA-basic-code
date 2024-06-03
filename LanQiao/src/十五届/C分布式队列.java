package 十五届;

import java.util.Scanner;

public class C分布式队列 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=15;
        int[] pos =new int[N];
        int n=sc.nextInt();
        sc.nextLine();

        while(sc.hasNext()){
            String x=sc.next();
            if(x.equals("add")){
                int y =sc.nextInt();
                pos[0]++;
            }else if(x.equals("sync")){
                int y=sc.nextInt();
                pos[y]++;
                pos[y]=Math.min(pos[y],pos[0]);
            }else if(x.equals("query")){
                int ans = Integer.MAX_VALUE;
                for(int j=0;j<n;j++)
                    ans=Math.min(ans,pos[j]);
                System.out.println(ans);
            }
        }
    }
}
