package FactoryMethod;

//具体工厂：数据库日志记录器工厂类
public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
