package com.codekili.androidadvancedbook.chapter_10.one1

/**
 * Created by Administrator on 2018/7/16 0016.
 */
class ConcreteBuilderB: Builder {
    private lateinit var product: Product
    override fun buildPartOne() {
    }

    override fun buildPartTwo() {
    }

    override fun getProduct(): Product {
        return product
    }

}