package JavaMap.CSDN;

import java.util.HashMap;

/**
 * 请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作
 */
public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","我们");
        hashMap.put("2","他们");
        hashMap.put("3","你们");

//        删除
        hashMap.remove("2");

//        获取
        System.out.println(hashMap.get("3"));
    }
}
