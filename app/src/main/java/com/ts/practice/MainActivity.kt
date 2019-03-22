package com.ts.practice

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.annotation.NonNull
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View


class MainActivity : AppCompatActivity(),LifecycleOwner {

    private var mLifeRegister:LifecycleRegistry? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.initialPrefetchItemCount = 10

        val manager = layoutManager
        lifecycle.addObserver(StudyLifecycle())
        mLifeRegister = LifecycleRegistry(this)
        mLifeRegister!!.markState(Lifecycle.State.CREATED)
    }

    override fun onStart() {
        super.onStart()
        mLifeRegister!!.markState(Lifecycle.State.STARTED)
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }


}
