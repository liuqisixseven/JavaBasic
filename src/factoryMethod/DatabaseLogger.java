package factoryMethod;

//具体产品：数据库日志记录器
public class DatabaseLogger implements Logger{
    @Override
    public void writelog() {
        System.out.println("数据库日志记录");
    }
}
