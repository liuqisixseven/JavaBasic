package javaTest.generic.bqyGeneric;


public class BqyGenericDemo {
    public static void main(String[] args) {
        BqyPerson<BqyContact> person = new BqyPerson<>(new BqyContact("风雅园",
                "999999999","123456"));
        System.out.println(person);

        BqyPerson<BqyIntroduction> person1 = new BqyPerson<>(new BqyIntroduction("卜庆延",
                "男",24));
        System.out.println(person1);
    }
}
