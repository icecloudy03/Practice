package com.ts.practice

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log


class StudyLifecycle : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i("tsss", "onCreate")
        handle(Lifecycle.Event.ON_CREATE)
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.i("tsss", "onStart")
        handle(Lifecycle.Event.ON_START)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.i("tsss", "onResume")
        handle(Lifecycle.Event.ON_RESUME)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.i("tsss", "onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.i("tsss", "onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.i("tsss", "onDestroy")
    }

    fun handle(event: Lifecycle.Event) {
        when(event) {
//            Lifecycle.Event.ON_CREATE-> Log.i("tsss", "onCreate1")
//            Lifecycle.Event.ON_START-> Log.i("tsss", "onStart1")
//            Lifecycle.Event.ON_RESUME-> Log.i("tsss", "onResume1")
        }
    }
}