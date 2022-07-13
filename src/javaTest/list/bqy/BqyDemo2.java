package javaTest.list.bqy;


import javaTest.list.Link;

public class BqyDemo2 {
    public static void main(String[] args) {
        Link k = new Link();
        k.addNode("a");
        k.addNode("o");
        k.addNode("e");
        k.addNode("i");
        k.addNode("u");
        System.out.println("韵母表");
        k.printNode();
        System.out.println();
        k.deleteNode("o");
        k.deleteNode("u");
        System.out.println("删除两个");
        k.printNode();
        System.out.println();
        System.out.println("韵母i存在情况：" + k.contains("i"));
    }
}
