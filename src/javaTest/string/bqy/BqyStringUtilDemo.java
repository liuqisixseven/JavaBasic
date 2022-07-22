package javaTest.string.bqy;


import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BqyStringUtilDemo {
    public static void main(String[] args) throws IOException{
//        String strIn;
//        String strAll[] = null;
//        Scanner scanner = new Scanner(System.in);
//        strIn = scanner.nextLine();
//        strAll = strIn.split(" ");
//        System.out.println(strIn);
//        for (int i = 0; i < strAll.length;i++)
//            System.out.println(strAll[i]);

//        InputStream input = System.in;
//        byte b[] = new byte[1024];
//        int len = input.read(b);
//        input.close();
//        System.out.println(len);
//        int count = 0;
//        for (int i = len-1;i >= 0;i --){
//            if(String.valueOf((char)b[i]).equals(" ")) {
//                break;
//            }
//            count++;
//        }
//        System.out.println(count);

//        String str = "9876673";
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0;i < str.length();i++){
//            //System.out.println(str.indexOf(str.charAt(i)));
//            if (str.indexOf(str.charAt(i)) == i)
//                sb.append(str.charAt(i));
//        }
//        System.out.println(sb);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char ch[] = new char[4];
//        br.read(ch);
//        System.out.println(new String(ch));
//        String str[] = br.readLine().split(" ");
//        System.out.print(Integer.parseInt(str[4]));
//        System.out.print(10);
//        for (String st:str
//             ) {
//            System.out.print(st + " ");
//        }
        //System.out.println(ch[0]);
        //System.out.println(ch[1]);
        //System.out.println(ch[2]);
        //System.out.println(ch[3]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch[] = new char[3];
        br.read(ch);
        int n = ch[0] - '0';
        //int n = Integer.parseInt(String.valueOf(ch[0]));
        //System.out.println(n);
        int k = ch[2] - '0';
        //System.out.println(k);
        int num[] = new int[n];
        String str2 = br.readLine();
        String str1 = br.readLine();
        String str[] = str1.split(" ");
        for(int i = 0;i < str.length;i++){
            //System.out.println(str[i]);
            num[i] = Integer.parseInt(str[i]);
        }
        int temp;
        for(int m = 0;m < n - 1;m++){
            for(int l = m;l < n - 1 ;l++){
                if(num[m] > num[l + 1]){
                    temp = num[m];
                    num[m] = num[l + 1];
                    num[l + 1] = temp;
                }
            }
        }
        for(int nu : num){
            System.out.print(nu + " ");
        }
    }
}

