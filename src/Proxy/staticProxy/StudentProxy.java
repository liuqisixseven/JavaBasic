package Proxy.staticProxy;

public class StudentProxy implements Person{

    Student student;

    public StudentProxy(Student student){
        this.student = student;
    }

    @Override
    public void giveMoney() {
        System.out.println("班长收集班费");
        System.out.println("班长给刘琦磕了个头");
        student.giveMoney();
    }
}
