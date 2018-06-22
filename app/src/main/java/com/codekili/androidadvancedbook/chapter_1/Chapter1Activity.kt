package com.codekili.androidadvancedbook.chapter_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import com.codekili.androidadvancedbook.R
import kotlinx.android.synthetic.main.activity_main.*

class Chapter1Activity : AppCompatActivity() {
    val TAG="Chapter1Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextView.setOnClickListener {
            Log.e(MyTextView.TAG, "MyTextView  OnClick")
        }
        myRelativeLy.setOnClickListener {
            Log.e(MyTextView.TAG, "myRelativeLy  OnClick")
        }
        mTextView.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> Log.e(MyTextView.TAG, "MyTextView onTouch ACTION_DOWN")
                MotionEvent.ACTION_MOVE -> Log.e(MyTextView.TAG, "MyTextView onTouch ACTION_MOVE")
                MotionEvent.ACTION_UP -> Log.e(MyTextView.TAG, "MyTextView onTouch ACTION_UP")
                MotionEvent.ACTION_CANCEL -> Log.e(MyTextView.TAG, "MyTextView onTouch ACTION_CANCEL")
            }
           super.onTouchEvent(event)
        }

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> Log.e(MyTextView.TAG, "onTouchEvent ACTION_DOWN")
            MotionEvent.ACTION_MOVE -> Log.e(MyTextView.TAG, "onTouchEvent ACTION_MOVE")
            MotionEvent.ACTION_UP -> Log.e(MyTextView.TAG, "onTouchEvent ACTION_UP")
            MotionEvent.ACTION_CANCEL -> Log.e(MyTextView.TAG, "onTouchEvent ACTION_CANCEL")
        }
        return super.onTouchEvent(event)
    }

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
}


