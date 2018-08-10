package com.codekili.androidadvancedbook.chapter_14

import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream

/**
 * Created by Administrator on 2018/8/2 0002.
 */
class Chapter14Activity : AppCompatActivity() {
    companion object {
        var TYPE_BANNNER = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun writeCache(type: Int, obj: Object) {
        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return
        }
        var file: File? = null
        when (type) {
            TYPE_BANNNER -> {
                if (file == null) {
                    file = File(Environment.getDownloadCacheDirectory().toString() + "/banner");
                }
            }

        }
        file?.let {
            var fos = FileOutputStream(file)
            var oos = ObjectOutputStream(fos)
            oos?.let {
                oos.writeObject(obj)
                oos.flush()
            }
            fos!!.close()
            oos!!.close()
        }

    }
    fun readCache(type:Int):Object{
        var banner = WenkuBanner()

        return banner as Object;
    }
}