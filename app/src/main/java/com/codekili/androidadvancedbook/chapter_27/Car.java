package com.codekili.androidadvancedbook.chapter_27;

/**
 * Created by Administrator on 2018/8/10 0010.
 */

public class Car implements ICarInject{
    private Engine engine;
    private Wheel mWheel;

    @Override
    public void bindEngine(Engine engine) {
        this.engine =engine;
    }

    @Override
    public void bindWheel(Wheel wheel) {
        this.mWheel =wheel;
    }
}
