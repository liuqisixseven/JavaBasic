package JavaTest.arrays;

import java.util.Arrays;

public class BqyArraysDemo {
    public static void main(String[] args) {
        byte temp1[] = null;
        int[] temp2 = new int[15];
        int temp3[] = {0,9,8,7,6,5,4,3,2,1};
        Arrays.sort(temp3);
        System.out.println("数组排序：" + Arrays.toString(temp3));
        //使用Arrays的二分法查【有序数组】某个元素的下标
        int index = Arrays.binarySearch(temp3, 5);
        System.out.println("元素“5”的下标为：" + index);
        //元素填充
        Arrays.fill(temp3,33);
        System.out.println(Arrays.toString(temp3));
    }
}
