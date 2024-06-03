package 十一届;

public class 试题A门牌制作 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=2020; i++) {
            sum+=get2(i);
        }
        System.out.println(sum);
    }

    public static int get2(int n){
        int ge,count=0;
        while(n!=0){
            if(n<=10){
               ge=n;
               n/=10;
            }else{
                ge=n%10;
                n/=10;
            }
            if(ge==2){
                count++;
            }
        }
        return count;
    }
}
