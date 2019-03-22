package com.ts.aop

import android.util.Log

class Apsect {
    fun before() {
        System.out.println("before")
    }

    fun after() {
        System.out.println("after")
    }
}