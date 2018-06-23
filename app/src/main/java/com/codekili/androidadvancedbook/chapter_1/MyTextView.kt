package com.codekili.androidadvancedbook.chapter_1

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.TextView

/**
 * Created by Administrator on 2018/6/15 0015.
 */
class MyTextView : TextView {
    companion object {
        private val TAG = "MyTextView"
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.e(TAG, "dispatchTouchEvent ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE -> Log.e(TAG, "dispatchTouchEvent ACTION_MOVE")
            MotionEvent.ACTION_UP -> Log.e(TAG, "dispatchTouchEvent ACTION_UP")
            MotionEvent.ACTION_CANCEL -> Log.e(TAG, "dispatchTouchEvent ACTION_CANCEL")
        }
        return super.dispatchTouchEvent(event)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> Log.e(TAG, "onTouchEvent ACTION_DOWN")
            MotionEvent.ACTION_MOVE -> Log.e(TAG, "onTouchEvent ACTION_MOVE")
            MotionEvent.ACTION_UP -> Log.e(TAG, "onTouchEvent ACTION_UP")
            MotionEvent.ACTION_CANCEL -> Log.e(TAG, "onTouchEvent ACTION_CANCEL")
        }
        return super.onTouchEvent(event)
    }
}
