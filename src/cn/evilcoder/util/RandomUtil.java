package cn.evilcoder.util;

import cn.evilcoder.model.LinkNode;
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

    public static TreeNode randomTreeNode(int n) {
        List<Integer> numbers = randomList(n);
        return buildTreeNode(numbers, 0, numbers.size()-1);
    }

    public static LinkNode randomLinkNode(int n) {
        List<Integer> numbers = randomList(n);
        return buildLinkNode(numbers);
    }

    private static TreeNode buildTreeNode(List<Integer> numbers, int begin, int end) {
        TreeNode treeNode = null;
        if (begin <= end) {
            int mid = begin + (end - begin)/2;
            treeNode = new TreeNode(numbers.get(mid));
            treeNode.left = buildTreeNode(numbers, begin, mid -1);
            treeNode.right = buildTreeNode(numbers, mid + 1, end);
        }
        return treeNode;
    }

    private static LinkNode buildLinkNode(List<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return null;
        }
        LinkNode root = new LinkNode(0);
        LinkNode head = root;
        for (int number : numbers) {
            LinkNode next = new LinkNode(number);
            root.next = next;
            root = root.next;
        }
        return head.next;
    }
}
