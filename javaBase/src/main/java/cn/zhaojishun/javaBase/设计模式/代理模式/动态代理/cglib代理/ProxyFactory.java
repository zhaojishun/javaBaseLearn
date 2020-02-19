package cn.zhaojishun.javaBase.设计模式.代理模式.动态代理.cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 13:07
 */
public class ProxyFactory implements MethodInterceptor {

    //被代理对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //得到代理对象 是target的代理对象
    public Object getProxyInstance(){
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    //处理代理实例，返回结果
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行");
        Object invoke = method.invoke(target,objects);
        return invoke;
    }
}