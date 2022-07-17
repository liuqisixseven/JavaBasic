package javaTest.collection.set.bqySet;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名:" + name + "," +
                "年龄:" + age  + ";";
    }

    @Override
    public int compareTo(Person per) {   //覆写compareTo（）方法，指定按年龄排序
        if(this.age > per.age)
            return 1;
        else if(this.age < per.age)
            return -1;
        else
            return this.name.compareTo(per.name);
    }
}

public class bTreeSetDemo2 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<Person>();
        set.add(new Person("张三",30));
        set.add(new Person("张三",30));
        set.add(new Person("李四",40));
        set.add(new Person("孙三",30));
        set.add(new Person("王五",25));
        set.add(new Person("沙漠死神",2000));
        set.add(new Person("荒漠屠夫",1800));
        set.add(new Person("沙漠死神",2000));
        set.add(new Person("李四",40));
        System.out.println(set);
    }
}
