package com.codekili.androidadvancedbook.chapter_10.one1

/**
 * Created by Administrator on 2018/7/16 0016.
 */
class Director constructor(val builder: Builder) {
    fun buildProduct() {
        builder.buildPartOne()
        builder.buildPartTwo()
    }

    fun getProduct(): Product {
        return builder.getProduct()
    }

}