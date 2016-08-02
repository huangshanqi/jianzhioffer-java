package cn.evilcoder.collection;

/**
 * 面试题12 打印1到最大的N位数
 * Created by huangshanqi on 2016/8/2.
 */
public class Print1ToNDigit {

    public static void print1ToNDigit(int n) {
        int[] buffer = new int[n];
        for (int i=0; i<10; i++) {
            buffer[0] = i;
            print1ToNDigit(buffer, 0);
        }
    }

    private static void print1ToNDigit(int[] buffer, int index) {
        if (index+1 == buffer.length) {
            printArray(buffer);
            return;
        }
        for (int i=0; i<10; i++) {
            buffer[index+1] = i;
            print1ToNDigit(buffer, index+1);
        }
    }

    private static void printArray(int[] buffer) {
        boolean notZero = false;
        StringBuilder sb = new StringBuilder();
        for (int i : buffer) {
            if (i != 0) {
                notZero = true;
            }
            if (notZero) {
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        print1ToNDigit(6);
    }
}
