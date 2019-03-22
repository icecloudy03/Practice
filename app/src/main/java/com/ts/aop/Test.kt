package com.ts.aop

fun main() {
    val userService = BeanFactory.createUserService()

    userService.addUser()


}