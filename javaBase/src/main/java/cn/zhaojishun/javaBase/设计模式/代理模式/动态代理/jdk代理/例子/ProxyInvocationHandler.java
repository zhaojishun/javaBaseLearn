package cn.zhaojishun.javaBase.设计模式.代理模式.动态代理.jdk代理.例子;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: javaBaseLearn
 * @description: 代理工具类
 * @author: Shunji Zhao
 * @create: 2020-02-19 12:03
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    //处理代理实例，返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //TODO
        System.out.println("调用了 "+method.getName()+"方法");
        Object invoke = method.invoke(target, args);
        //TODO
        return invoke;
    }
}