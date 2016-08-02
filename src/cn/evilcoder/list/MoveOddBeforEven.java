package cn.evilcoder.list;

import java.util.Arrays;

/**
 * 面试题14 调整数组顺序使奇数位于偶数前
 * Created by huangshanqi on 2016/8/2.
 */
public class MoveOddBeforEven {

    public static void moveOddBeforEven(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] & 1) == 1) {
                int odd = numbers[i];
                numbers[i] = numbers[count];
                numbers[count++] = odd;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8};
        moveOddBeforEven(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
