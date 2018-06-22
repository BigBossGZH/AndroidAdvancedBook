package com.codekili.androidadvancedbook.chapter_1

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.RelativeLayout

/**
 * Created by Administrator on 2018/6/20 0020.
 */
class MyRelativeLayout : RelativeLayout {
    companion object {
        val TAG = "MyRelativeLayout"
    }

    constructor(context: Context) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int = 0) : super(context, attrs, defStyleAttr)

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.e(TAG, "dispatchTouchEvent ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE -> Log.e(TAG, "dispatchTouchEvent ACTION_MOVE")
            MotionEvent.ACTION_UP -> Log.e(TAG, "dispatchTouchEvent ACTION_UP")
            MotionEvent.ACTION_CANCEL -> Log.e(TAG, "dispatchTouchEvent ACTION_CANCEL")
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.e(TAG, "onInterceptTouchEvent ACTION_DOWN")
                return true
            }
            MotionEvent.ACTION_MOVE -> Log.e(TAG, "onInterceptTouchEvent ACTION_MOVE")
            MotionEvent.ACTION_UP -> {
                Log.e(TAG, "onInterceptTouchEvent ACTION_UP")
//                return true
            }
            MotionEvent.ACTION_CANCEL -> Log.e(TAG, "onInterceptTouchEvent ACTION_CANCEL")
        }
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> Log.e(TAG, "onTouchEvent ACTION_DOWN")
            MotionEvent.ACTION_MOVE -> Log.e(TAG, "onTouchEvent ACTION_MOVE")
            MotionEvent.ACTION_UP -> {
                Log.e(TAG, "onTouchEvent ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL -> Log.e(TAG, "onTouchEvent ACTION_CANCEL")
        }
        return super.onTouchEvent(event)
    }
}