package com.codekili.androidadvancedbook.chapter_10.one1

import com.codekili.androidadvancedbook.chapter_10.one2.User

/**
 * Created by Administrator on 2018/7/16 0016.
 */
class Product{
    var partOne:String?=null
    var partTwo:String?=null
    fun getUser(): User {
        return User.UserBuilder("Jack", "Wilson")
                .Age(30)
                .Gender("male")
                .PhoneNo("13500000000")
                .build()
    }
}
