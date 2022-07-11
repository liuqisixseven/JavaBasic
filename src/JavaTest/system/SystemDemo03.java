package JavaTest.system;

/**
 * 列出指定属性
 * @author w-liuqi
 *
 */
public class SystemDemo03 {
	public static void main(String[] args) {
		System.out.println("系统版本为："+System.getProperty("so.name")+System.getProperty("os.version")+System.getProperty("os.arch"));
		System.out.println("系统用户为："+System.getProperty("user.name"));
		System.out.println("当前用户目录："+System.getProperty("user.home"));
		System.out.println("当前用户工作目录"+System.getProperty("user.dir"));
	}
}
