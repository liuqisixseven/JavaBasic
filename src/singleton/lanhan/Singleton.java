package singleton.lanhan;

//懒汉式单例类.在第一次调用的时候实例化自己

public class Singleton {
    private Singleton(){}
    private static Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
    //懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例，要实现线程安全，有以下三种方式
   /*在getInstance方法上加同步
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    */
   /*双重检查锁定
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    */


    /*静态内部类     既实现了线程安全，又避免了同步带来的性能影响
    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    public static final Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }
    */
}

//Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问。


