package JavaTest.list;


public class Demo2 {
	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out.println("删除之前");
		l.printNode();
		l.deleteNode("C");
		l.deleteNode("D");
		System.out.println();
		System.out.println("删除之后");
		l.printNode();
		System.out.println();
		System.out.println("查询节点："+l.contains("A"));
	}
}
