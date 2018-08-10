package com.codekili.androidadvancedbook.chapter_14

import java.io.Serializable

/**
 * Created by Administrator on 2018/8/2 0002.
 */
class  WenkuBanner :Serializable{
    companion object {
        private const val serialVersionUID = 5952361145235240971L
    }
    constructor(){
        mAsscessTime=0;
        mContentList= ArrayList<Image>();
    }
    var mAsscessTime=0
    var mContentList:ArrayList<Image>?=null

    class Image : Serializable {
        companion object {
            private const val serialVersionUID = 5952361145235240973L
        }
        var Type=0
        var mIconUrl:String?=null
        var mValue:String?=null
    }
}