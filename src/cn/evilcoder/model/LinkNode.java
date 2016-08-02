package cn.evilcoder.model;

/**
 * Created by huangshanqi on 2016/8/2.
 */
public class LinkNode {

    public int value;
    public LinkNode next;

    public LinkNode(int value) {
        this.value = value;
        next = null;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LinkNode other = (LinkNode) obj;
        return other.value == this.value && this.next == other.next;
    }
}
