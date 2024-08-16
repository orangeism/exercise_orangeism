package 题目四;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat("黄色","波斯猫");
        Dog dog=new Dog("黑色","秋田犬");
        cat.eat();
        dog.eat();
        cat.catchMouse();
        dog.lookHome();
    }

}
