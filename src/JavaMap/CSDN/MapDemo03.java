package JavaMap.CSDN;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合
 */
public class MapDemo03 {
    public static void main(String[] args) {
        HashMap<Car, Integer> hashMap = new HashMap<Car, Integer>();

        hashMap.put(new Car("宝马",123.0),2);
        hashMap.put(new Car("奔驰",222.0),3);
        hashMap.put(new Car("红旗",333.0),4);

        Set<Car> cars = hashMap.keySet();
        for (Car s:cars) {
            System.out.println(s.getName()+"  "+s.getPrice());
        }


        System.out.println("---------");
        Set<Map.Entry<Car, Integer>> entries = hashMap.entrySet();

        for (Map.Entry<Car,Integer> entry:entries) {
            Car car = entry.getKey();
            Integer i = entry.getValue();

            System.out.println(car.getName()+" "+car.getPrice()+" "+i);
        }
    }
}

