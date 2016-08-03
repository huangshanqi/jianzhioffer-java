package cn.evilcoder.list;

import cn.evilcoder.model.LinkNode;
import cn.evilcoder.util.RandomUtil;

/** 面试题16 反转链表
 * Created by huangshanqi on 2016/8/3.
 */
public class ReverseLinkNode {

    public static LinkNode reverseLinkNode (LinkNode root) {
        if (root == null || root.next == null) {
            return root;
        }
        LinkNode head = new LinkNode(0);
        LinkNode cur = null;
        while (root != null) {
            cur = root;
            root = root.next;
            cur.next = head.next;
            head.next = cur;
        }
        return head.next;
    }

    public static void main(String[] args) {
        int n = 10;
        LinkNode root = RandomUtil.randomLinkNode(n);
        System.out.println(root);
        System.out.println(reverseLinkNode(root));
    }
}
