package com.example.nativeopengl

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View

class NativeEglExample : Activity(), SurfaceHolder.Callback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate()")
        setContentView(R.layout.main)
        val surfaceView = findViewById<View>(R.id.surfaceview) as SurfaceView
        surfaceView.holder.addCallback(this)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
        nativeOnStart()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
        nativeOnResume()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
        nativeOnPause()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
        nativeOnStop()
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, w: Int, h: Int) {
        nativeSetSurface(holder.surface)
    }

    override fun surfaceCreated(holder: SurfaceHolder) {}
    override fun surfaceDestroyed(holder: SurfaceHolder) {
        nativeSetSurface(null)
    }

    private external fun nativeOnStart()
    private external fun nativeOnResume()
    private external fun nativeOnPause()
    private external fun nativeOnStop()
    private external fun nativeSetSurface(surface: Surface?)

    companion object {
        private const val TAG = "EglSample"

        init {
            System.loadLibrary("nativeegl")
        }
    }
}
