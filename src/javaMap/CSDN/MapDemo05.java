package javaMap.CSDN;

import java.util.HashMap;

/**
 * 有2个数组，
 * 第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 *
 */
public class MapDemo05 {
    public static void main(String[] args) {
        String[] onearray = new String[]{"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] twoarray = new String[]{"哈尔滨","杭州","南昌","广州","福州"};

        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0;i < onearray.length;i++){
            hashMap.put(onearray[i],twoarray[i]);
        }

        System.out.println(hashMap);

    }
}