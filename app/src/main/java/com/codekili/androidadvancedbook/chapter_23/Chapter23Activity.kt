package com.codekili.androidadvancedbook.chapter_23

import android.app.Activity
import android.os.Bundle
import java.net.InetSocketAddress
import java.net.Socket

/**
 * Created by Administrator on 2018/8/9 0009.
 */

class Chapter23Activity :Activity(){
    val TCP_URL=""
    val TCP_PORT=0
    val SOCKET_CONNECT_TIMEOUT=10000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    fun connect(){
        var mSocket = Socket();
        mSocket.connect(InetSocketAddress(TCP_URL,TCP_PORT),SOCKET_CONNECT_TIMEOUT)
        mSocket.keepAlive=true
    }
}
