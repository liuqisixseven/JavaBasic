package javaTest.collection.map.bqyMap;

import java.util.*;

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        //if (o == null || getClass() != o.getClass())
        if(!(obj instanceof Person))
            return false;
        Person person = (Person) obj;
        return this.age == person.age && this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.age;
    }

    @Override
    public String toString() {
        return "姓名：" + name +
                ", 年龄：" + age +
                ";";
    }
}
/*
* key可以重复的Map集合 IdentifyHashMap
* */
public class BqyIdentifyHashMapDemo {
    public static void main(String[] args) {
        Map<Person,String> map = new IdentityHashMap<Person,String>();
        map.put(new Person("卜庆延",25),"buqingyan");
        map.put(new Person("卜延庆",24),"buyanqing");
        map.put(new Person("卜庆延",25),"buqingyan");
        map.put(new Person("庆延卜",28),"qingyanbu");
        Set<Map.Entry<Person,String>> key = map.entrySet();
        Iterator<Map.Entry<Person,String>> iter = key.iterator();
        while (iter.hasNext()){
            Map.Entry<Person,String> me = iter.next();
            System.out.println(me.getKey() + "————>" + me.getValue());
        }
    }
}
