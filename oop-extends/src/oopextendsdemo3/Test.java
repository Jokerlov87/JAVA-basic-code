package oopextendsdemo3;

public class Test {
    public static void main(String[] args) {
        Manager m=new Manager("heima001","zhangsan",15000,8000);
        System.out.println(m.getId()+","+m.getName()+","+
                m.getSalary()+","+m.getBonus());
        m.work();
        m.eat();


        Cook c=new Cook();
        c.setId("heima002");
        c.setName("lisi");
        c.setSalary(8000);
        System.out.println(c.getId()+","+c.getName()+","+
                c.getSalary());
        c.work();
        c.eat();
    }
}
