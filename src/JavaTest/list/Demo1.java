package JavaTest.list;

public class Demo1 {
	public static void main(String[] args) {
		Node n3 = new Node("车厢C",null);
		Node n2 = new Node("车厢B",n3);
		Node n1 = new Node("车厢A",n2);
		Node root = new Node("火车头",n1);
		Node n0 = new Node();
		n0.setData("火车头前面的木桩");
		n0.setNext(root);
		printNode(n0);
	}
	public static void printNode(Node node) {
		System.out.println(node.getData()+"\t");
		if(node.getNext()!=null) {
			printNode(node.getNext());
		}
	}
	
}
