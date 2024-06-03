package 十四届;

public class 试题A阶乘求和 {
    public static void main(String[] args) {
        long sum=0;
        for(long i=1;i<=90L;i++){
            sum=sum+get(i);
            System.out.println(sum%1000000000L);
        }
    }
    public static long get(long n){
        long s=1L;
        for(long i=1;i<=n;i++){
            s=s*i;
            if(s>1000000000L){
                s=s%1000000000L;
            }
        }
        return s;
    }
}
