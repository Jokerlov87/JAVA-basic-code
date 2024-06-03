package interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PingPongSporter pps=new PingPongSporter("刘诗雯",23);
        System.out.println(pps.getName()+","+pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
