package cn.evilcoder;

import cn.evilcoder.tree.TreeTravel;
import cn.evilcoder.util.RandomUtil;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(RandomUtil.randomList(10));
        System.out.println(TreeTravel.travelInOrder(RandomUtil.randomTreeNode(20)));
    }
}
