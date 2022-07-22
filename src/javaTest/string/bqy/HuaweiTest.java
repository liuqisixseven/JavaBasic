package javaTest.string.bqy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class HuaweiTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TreeSet set = new TreeSet();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0;i < N;i++){
            set.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(set);
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
