package test;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend gf1 =new Girlfriend();
        gf1.setName("qq");
        gf1.setAge(-18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
