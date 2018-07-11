package com.codekili.androidadvancedbook.chapter_6

import android.opengl.Visibility
import android.support.design.widget.BaseTransientBottomBar
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button
import com.codekili.androidadvancedbook.R
import java.time.Duration

/**
 * Created by Administrator on 2018/7/11 0011.
 */
class SnackbarUtil{
    companion object {

        fun show(view: View,text:String,duration: Int=Snackbar.LENGTH_LONG ){
            var snackbar  =Snackbar.make(view,text,duration)
           var button= snackbar.view.findViewById<Button>(R.id.snackbar_action)
            button.visibility =View.VISIBLE
            button.text="确定"
            snackbar.show()
        }
    }
}