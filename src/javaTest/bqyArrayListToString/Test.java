package javaTest.bqyArrayListToString;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("100m");
        arr2.add("200m");
        String a = arr2.toString();
        String b = String.valueOf(arr2);
        System.out.println(a.toString());
        System.out.println(b.toString());
        
        ArrayList<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        StringBuilder sb = new StringBuilder();
        for (String s : list)
        {
            sb.append(s);
        }
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
