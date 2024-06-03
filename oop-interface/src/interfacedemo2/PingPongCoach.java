package interfacedemo2;

public class PingPongCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("在教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("在说英语");
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    public PingPongCoach() {
    }
}
