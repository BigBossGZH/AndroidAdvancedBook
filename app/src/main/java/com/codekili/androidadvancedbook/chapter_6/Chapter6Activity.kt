package com.codekili.androidadvancedbook.chapter_6

import android.app.Activity
import android.os.Bundle
import android.support.design.widget.Snackbar

import com.codekili.androidadvancedbook.R
import kotlinx.android.synthetic.main.activity_chapter6_main.*

/**
 * Created by Administrator on 2018/7/11 0011.
 */

class Chapter6Activity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter6_main)
        linearlayout.setOnClickListener {
            SnackbarUtil.show(it,"2018年7月11日14:40:41",Snackbar.LENGTH_SHORT)
        }
    }

}
