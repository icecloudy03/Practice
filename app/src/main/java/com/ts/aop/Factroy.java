package com.ts.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Factroy {

    public static IUserService createUserService() {
        IUserService userService = new UserServiceImpl();
        Apsect apsect = new Apsect();

        IUserService proxyInstance = (IUserService)Proxy.newProxyInstance(Factroy.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                apsect.before();
                Object o = method.invoke(userService, args);
                apsect.after();
                return o;
            }
        });
        return proxyInstance;
    }

    public static final String A = "a";
    public static final String B = "b";
}
