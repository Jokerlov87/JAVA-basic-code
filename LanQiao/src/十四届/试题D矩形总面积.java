package 十四届;

import java.util.Scanner;

public class 试题D矩形总面积 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        int x4=sc.nextInt();
        int y4=sc.nextInt();

        int R1,R2,S,S1,l,w;

        R1=(x2-x1)*(y2-y1);
        R2=(x4-x3)*(y4-y3);

        if(x3>=x2||y3>=y2||x4<=x1||y4<=y1){//无重叠
            S1=0;
        }else{//重叠
            l=length(x1,x2,x3,x4);
            w=wide(y1,y2,y3,y4);
            S1=l*w;
        }

        S=R1+R2-S1;
        System.out.println(S);
    }

    public static int length(int x1,int x2,int x3,int x4){
        int l=0;
        if(x3>=x1&&x4<=x2){
            l=x4-x3;
        }else if(x3<=x1&&x4>=x2){
            l=x2-x1;
        }else if(x3>=x1&&x4>=x2){
            l=x2-x3;
        }else if(x3<=x1&&x4<=x2)
        {
            l=x4-x1;
        }
        return l;
    }

    public static int wide(int y1,int y2,int y3,int y4){
        int w=0;
        if(y3>=y1&&y4<=y2){
            w=y4-y3;
        }else if(y3<=y1&&y4>=y2){
            w=y2-y1;
        }else if(y3>=y1&&y4>=y2){
            w=y2-y3;
        }else if(y3<=y1&&y4<=y2)
        {
            w=y4-y1;
        }
        return w;

    }
}
