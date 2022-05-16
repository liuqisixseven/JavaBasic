package FactoryMethod;

//客户端测试类
public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = new FileLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writelog();
    }
}
