package javaTest.pol.bqy;

public class PolDemo1 {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = son;
        father.sleep();
    }
}
