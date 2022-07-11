package JavaTest.system;

/**
 * 计算一个程序的执行时间
 * @author w-liuqi
 *
 */
public class SystemDemo01 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		@SuppressWarnings("unused")
		int sum = 0;
		for(int i=0;i<30000000;i++) {
			sum+=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("计算所花费的时间："+(endTime-startTime)+"毫秒");
	}
}
