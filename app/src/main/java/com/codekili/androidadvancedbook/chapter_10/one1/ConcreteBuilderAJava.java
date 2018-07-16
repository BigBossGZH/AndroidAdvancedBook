package com.codekili.androidadvancedbook.chapter_10.one1;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Administrator on 2018/7/16 0016.
 */

public class ConcreteBuilderAJava implements Builder{
    private Product product;
    @Override
    public void buildPartOne() {

    }

    @Override
    public void buildPartTwo() {

    }

    @NotNull
    @Override
    public Product getProduct() {
        return product;
    }
}
