package factoryMethod;

//具体产品：文件日志记录器
public class FileLogger implements Logger{
    @Override
    public void writelog() {
        System.out.println("文件日志记录");
    }
}
