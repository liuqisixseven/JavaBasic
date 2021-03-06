package proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler<T> implements InvocationHandler{

    //invocationHandler持有的被代理对象
    T target;

    public StuInvocationHandler(T target){
        this.target = target;
    }

    /**
     *
     * @param proxy  动态代理对象
     * @param method   正在执行的方法
     * @param args   调用目标方法时传入的实参
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行"+method.getName()+"方法");
        //代理过程中插入监测方法，计算该方法耗时
        MonitorUtil.start();
        Object result = method.invoke(target,args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
