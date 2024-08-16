package 题目三;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("123","张三",10000);
        coder.work();
        Manager manager = new Manager("156","李四",20000,10000);
        manager.work();
    }
}
