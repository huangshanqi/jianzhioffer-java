package cn.evilcoder.list;

import cn.evilcoder.model.LinkNode;

/**
 * 面试题13 O(1)时间删除链表节点
 * Created by huangshanqi on 2016/8/2.
 */
public class DeleteNode {

    public static void delete(LinkNode root, LinkNode delete) {
        if (null == root || null == delete) {
            return;
        }
        if (null != delete.next) {
            // 不是最后节点
            LinkNode next = delete.next;
            delete.value = next.value;
            delete.next = next.next;
            next.next = null;
        } else if (root == delete) {
            // 是最后节点并且是根节点
            root = null;
        } else {
            // 是最后节点但不是根节点
            LinkNode head = root;
            while (head.next != delete) {
                head = head.next;
            }
            head.next = null;
        }
    }
}
