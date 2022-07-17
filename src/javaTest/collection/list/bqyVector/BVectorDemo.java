package javaTest.collection.list.bqyVector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BVectorDemo {
    public static void main(String[] args) {
        List<String> list = new Vector<String>();
        list.add("World");
        list.add(0,"Hello");
        list.add("CSDN");
        list.add("www.buqingyan.com");
        System.out.println(list);

        Vector<String> vector = new Vector<String>();
        vector.addElement("Hello");
        vector.addElement("World");
        vector.addElement("CSDN");
        vector.addElement("www.buqingyan.com");
        System.out.println(vector);
    }
}
