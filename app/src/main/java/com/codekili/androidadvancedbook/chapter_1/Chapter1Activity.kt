package com.codekili.androidadvancedbook.chapter_1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.codekili.androidadvancedbook.R
import kotlinx.android.synthetic.main.activity_main.*

class Chapter1Activity : AppCompatActivity() {
    val TAG="Chapter1Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextView.setOnClickListener {
            Log.e(TAG, "MyTextView  OnClick")
        }
        myRelativeLy.setOnClickListener {
            Log.e(TAG, "myRelativeLy  OnClick")
        }
        mTextView.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> Log.e(TAG, "MyTextView onTouch ACTION_DOWN")
                MotionEvent.ACTION_MOVE -> Log.e(TAG, "MyTextView onTouch ACTION_MOVE")
                MotionEvent.ACTION_UP -> Log.e(TAG, "MyTextView onTouch ACTION_UP")
                MotionEvent.ACTION_CANCEL -> Log.e(TAG, "MyTextView onTouch ACTION_CANCEL")
            }
           super.onTouchEvent(event)
        }
        MeasureSpec();
    }

    fun MeasureSpec() {
        var MODE_SHIFT = 30;
        var a0 = 0 shr MODE_SHIFT
        var a1 = 0 shl MODE_SHIFT
        var b0 = 1 shr MODE_SHIFT
        var b1 = 1 shl MODE_SHIFT
        var c0 = 2 shr MODE_SHIFT
        var c1 = 2 shl 31
        val MODE_MASK = 0x3 shl MODE_SHIFT

        Log.e(" MeasureSpec ", " a0 = $a0 \n a1 = $a1 \n b0 = $b0 \n b1 = $b1  \n c0 = $c0 \n c1 = $c1 ")
        Log.e(" MeasureSpec ", "MeasureSpec.UNSPECIFIED = ${View.MeasureSpec.UNSPECIFIED} \n" +
                "MeasureSpec.EXACTLY = ${View.MeasureSpec.EXACTLY}  \n" +
                "MeasureSpec.AT_MOST = ${View.MeasureSpec.AT_MOST} ")
        Log.e(" MeasureSpec ", "0x3 = ${0x3} \n" +
                "MeasureSpec.EXACTLY = $MODE_MASK  \n"
               )
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


