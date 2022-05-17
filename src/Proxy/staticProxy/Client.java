package Proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("刘琦");
        StudentProxy studentProxy;
        studentProxy = new StudentProxy(student);
        studentProxy.giveMoney();
    }
}
