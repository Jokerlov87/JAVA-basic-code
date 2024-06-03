package 十二届;

public class 试题B卡片 {
    public static void main(String[] args) {
        int ling=2021;
        int yi=2021;
        int er=2021;
        int san=2021;
        int si=2021;
        int wu=2021;
        int liu=2021;
        int qi=2021;
        int ba=2021;
        int jiu=2021;
        int i=1;

        loop:
        while(true){
            int num=i;
            while(num!=0){
                int ge=num%10;
                num/=10;
                if(ge==0){
                    ling--;
                }else if(ge==1){
                    yi--;
                }else if(ge==2){
                    er--;
                }else if(ge==3){
                    san--;
                }else if(ge==4){
                    si--;
                }else if(ge==5){
                    wu--;
                }else if(ge==6){
                    liu--;
                }else if(ge==7){
                    qi--;
                }else if(ge==8){
                    ba--;
                }else if(ge==9){
                    jiu--;
                }
                if(ling==-1||yi==-1||er==-1||san==-1||si==-1||wu==-1||liu==-1||qi==-1||ba==-1||jiu==-1){
                    System.out.println(i-1);
                    break loop;
                }
            }
            i++;
        }
    }
}
