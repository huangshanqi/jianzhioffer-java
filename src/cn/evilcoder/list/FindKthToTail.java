package cn.evilcoder.list;

import cn.evilcoder.model.LinkNode;
import cn.evilcoder.util.RandomUtil;

/** 面试题15 链表中倒数第K个节点
 * Created by huangshanqi on 2016/8/3.
 */
public class FindKthToTail {

    public static LinkNode findKthToTail(LinkNode root, int k) {
        if (k <= 0) {
            return null;
        }
        LinkNode fast = root;
        for (int i=0; i<k; i++) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }

        LinkNode slow = root;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int n = 10;
        LinkNode root = RandomUtil.randomLinkNode(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(String.format("k=%s,%s", i, findKthToTail(root, i)));
        }
    }
}
