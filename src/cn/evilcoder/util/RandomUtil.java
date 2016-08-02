package cn.evilcoder.util;

import cn.evilcoder.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by huangshanqi on 2016/8/2.
 */
public class RandomUtil {

    public static final Random random = new Random(System.currentTimeMillis());

    public static List<Integer> randomList(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }

        // 随机数
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(i+1);
            int temp = result.get(index);
            result.set(index, result.get(i));
            result.set(i, temp);
        }

        System.out.println(result);
        return result;
    }

    public static TreeNode randomNode(int n) {
        List<Integer> numbers = randomList(n);
        return buildNode(numbers, 0, numbers.size()-1);
    }

    private static TreeNode buildNode(List<Integer> numbers, int begin, int end) {
        TreeNode treeNode = null;
        if (begin <= end) {
            int mid = begin + (end - begin)/2;
            treeNode = new TreeNode(numbers.get(mid));
            treeNode.left = buildNode(numbers, begin, mid -1);
            treeNode.right = buildNode(numbers, mid + 1, end);
        }
        return treeNode;
    }
}
