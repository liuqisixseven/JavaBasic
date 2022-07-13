package javaTest.list.bqy;




import javaTest.list.Node;

import static javaTest.list.Demo1.printNode;

public class BqyDemo1 {
    public static void main(String[] args) {
        Node nx3 = new Node("逆行人员3",null);
        Node nx2 = new Node("逆行人员2",nx3);
        Node nx1 = new Node("逆行人员1",nx2);
        Node stop = new Node("停下",nx1);
        Node sss = new Node();
        sss.setData("查逆行人员");
        sss.setNext(stop);
        printNode(sss);
    }
}
