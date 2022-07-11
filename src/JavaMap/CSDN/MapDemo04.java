package JavaMap.CSDN;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 现在有一个map集合如下：
 * Map<Integer,String> map = new HashMap<Integer, String>();
 * map.put(1, “张三丰”);
 * map.put(2, “周芷若”);
 * map.put(3, “汪峰”);
 * map.put(4, “灭绝师太”);
 * 要求：
 * 1.遍历集合，并将序号与对应人名打印。
 * 2.向该map集合中插入一个编码为5姓名为李晓红的信息
 * 3.移除该map中的编号为1的信息
 * 4.将map集合中编号为2的姓名信息修改为"周林"
 *
 */
public class MapDemo04 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");


        Set<Integer> integers = map.keySet();
        for (Integer i:integers) {
            System.out.println(i+" "+ map.get(i));
        }

        map.put(5,"李晓红");

        String remove = map.remove(1);
        System.out.println("已经移除 " + remove);
        boolean flag = map.replace(2, map.get(2), "周林");
        System.out.println("将map集合中编号为2的姓名信息修改为周林，是否完成："+flag);
        System.out.println(map);
    }
}
