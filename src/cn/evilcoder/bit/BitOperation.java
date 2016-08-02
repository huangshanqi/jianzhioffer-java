package cn.evilcoder.bit;

/**
 * Created by huangshanqi on 2016/8/2.
 */
public class BitOperation {

    /**
     * 统计十进制n的二进制里1的个数
     * @param n
     * @return
     */
    public static int getBitOneCount(int n) {
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while (n != 0) {
            n = n & (n -1 );
            count++;
        }
        return count;
    }

    public static double getPower(int base, int exponent) {
        if (base == 0 && exponent < 0) {
            return 0;
        }
        long result = getPositivePower(base, Math.abs(exponent));
        if (exponent < 0) {
            return  1/result;
        }
        return result;
    }

    private static long getPositivePower(int base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return exponent;
        long result = getPositivePower(base, exponent >> 1);
        result *= result;
        if ((result & 1) != 0) {
            result *= exponent;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getBitOneCount(15));
    }
}
