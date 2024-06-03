package interfacedemo2;

public class PingPongSporter extends Sporter implements English{
    @Override
    public void study() {
        System.out.println("在说英语");
    }

    @Override
    public void speakEnglish() {
        System.out.println("在学乒乓球");
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    public PingPongSporter() {
    }
}
