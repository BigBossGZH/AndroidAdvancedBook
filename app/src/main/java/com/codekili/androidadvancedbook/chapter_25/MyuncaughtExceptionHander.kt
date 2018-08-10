package com.codekili.androidadvancedbook.chapter_25

import android.provider.Settings
import java.io.PrintWriter
import java.io.StringWriter

/**
 * Created by Administrator on 2018/8/9 0009.
 */
class MyuncaughtExceptionHander:Thread.UncaughtExceptionHandler{
    override fun uncaughtException(t: Thread?, e: Throwable?) {
        val result =StringWriter()
        val printWriter = PrintWriter(result)
        var cause = e
        while (cause != null) {
            cause.printStackTrace(printWriter)
            cause=cause.cause
        }
        val stacktraceAsString = result.toString()
        printWriter.close()
//        Settings.System.

    }

}