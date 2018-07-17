package com.codekili.androidadvancedbook.chapter_10.one2;

/**
 * Created by Administrator on 2018/7/17 0017.
 */

public class  UserBuilderJava {
    private final String mFirstName;
    private final String mLastName;
    private  String mAge;
    private  String mGender;
    private  String mPhoneNo;

    public UserBuilderJava(String mFirstName, String mLastName) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public UserBuilderJava setmAge(String mAge) {
        this.mAge = mAge;
        return this;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public void setmPhoneNo(String mPhoneNo) {
        this.mPhoneNo = mPhoneNo;
    }
}
