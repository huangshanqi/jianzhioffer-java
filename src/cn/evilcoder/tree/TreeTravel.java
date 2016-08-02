package cn.evilcoder.tree;

import cn.evilcoder.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by huangshanqi on 2016/8/2.
 */
public class TreeTravel {

    /**
     * 先序遍历
     * @param root
     */
    public static List<Integer> travelPreOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.add(root.value);
            result.addAll(travelInOrder(root.left));
            result.addAll(travelInOrder(root.right));
        }
        return result;
    }

    /**
     * 中序遍历
     * @param root
     * @return
     */
    public static List<Integer> travelInOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(travelInOrder(root.left));
            result.add(root.value);
            result.addAll(travelInOrder(root.right));
        }
        return result;
    }

    /**
     * 后续遍历
     * @param root
     */
    public static List<Integer> travelPostOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(travelInOrder(root.left));
            result.addAll(travelInOrder(root.right));
            result.add(root.value);
        }
        return result;
    }

    /**
     * 层次遍历
     * @param root
     * @return
     */
    public static List<Integer> travelInLevel(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i< size; i++) {
                    TreeNode cur = queue.poll();
                    result.add(cur.value);
                    if (null != cur.left) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
        }

        return result;
    }

    public static void travelInRecursion(TreeNode root) {

    }
}
