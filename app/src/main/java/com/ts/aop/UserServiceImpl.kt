package com.ts.aop

import android.util.Log

class UserServiceImpl:IUserService {
    override fun addUser() {
        System.out.println("add user")
    }

    override fun updateUser() {
        System.out.println("update user")
    }

    override fun deleteUser() {
        System.out.println("delete user")
    }
}