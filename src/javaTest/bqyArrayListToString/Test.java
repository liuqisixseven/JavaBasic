package javaTest.bqyArrayListToString;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("100m");
        arr2.add("200m");
        String a = arr2.toString();
        String b = String.valueOf(arr2);
        System.out.println(a);
        System.out.println(b);
    }
}
