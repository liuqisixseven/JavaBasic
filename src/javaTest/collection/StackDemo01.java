package javaTest.collection;

import java.util.Stack;

/**
 * 完成入栈及出栈
 * @author w-liuqi
 *
 */
public class StackDemo01 {
	public static void main(String[] args) {
		//先进的内容最后取出
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.pop()+"、");
		System.out.println(s.pop()+"、");
		System.out.println(s.pop()+"、");
		System.out.println(s.pop()+"、");  //错误，出栈，出现异常，栈为空
	}
}
