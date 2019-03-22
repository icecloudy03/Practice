package com.ts.aop

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class BeanFactory {
    companion object {
        fun createUserService(): IUserService {
            val userService: IUserService = UserServiceImpl()
            val aspect: Apsect = Apsect()

            return Proxy.newProxyInstance(
                this::class.java.classLoader,
                userService.javaClass.interfaces,
                object : InvocationHandler {
                    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
                        aspect.before()
                        val obj = method!!.invoke(userService, *args.orEmpty())
                        aspect.after()
                        return obj
                    }
                })as IUserService
        }
    }
}