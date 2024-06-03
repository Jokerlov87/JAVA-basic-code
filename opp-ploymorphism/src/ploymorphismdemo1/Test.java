package ploymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法

        Student s=new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("wangjianguo");
        t.setAge(30);

        Administractor admin =new Administractor();
        admin.setName("guanliyuan");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);

    }
    //这个方法既能接受老师，又能接受学生，还能接受管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p){
        p.show();

    }
}
