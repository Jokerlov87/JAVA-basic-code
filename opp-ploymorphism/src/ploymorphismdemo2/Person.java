package ploymorphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    //饲养狗
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getAge()+"岁的"+dog.getColor()+"颜色的狗");
//        dog.eat(something);
//    }
//    //饲养猫
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getAge()+"岁的"+cat.getColor()+"颜色的狗");
//        cat.eat(something);
//    }

    //想要一个方法，能接受所有的动物，包括猫，包括狗
    //方法的形参：可以写这些类的父类 Animal
    public void keepPet(Animal a,String something){
        if(a instanceof Dog){
            Dog d=(Dog) a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getAge()+"岁的"+a.getColor()+"颜色的狗");
            d.eat(something);
        }else if(a instanceof Cat){
            Cat c=(Cat) a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getAge()+"岁的"+a.getColor()+"颜色的猫");
            c.eat(something);
        }else{
            System.out.println("没有这种动物");
        }

    }
}
