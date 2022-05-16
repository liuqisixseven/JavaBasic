package singleton.ehan;


//饿汉式单例类.在类初始化时，已经自行实例化
public class Singleton {
    private Singleton(){}
    private static final Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}

//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。