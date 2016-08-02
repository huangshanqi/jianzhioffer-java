package cn.evilcoder.tree;

import cn.evilcoder.model.Node;

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
    public static List<Integer> travelPreOrder(Node root) {
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
    public static List<Integer> travelInOrder(Node root) {
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
    public static List<Integer> travelPostOrder(Node root) {
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
    public static List<Integer> travelInLevel(Node root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i< size; i++) {
                    Node cur = queue.poll();
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

    public static void travelInRecursion(Node root) {

    }
}
