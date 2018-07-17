package com.codekili.androidadvancedbook.chapter_10.one2

/**
 * Created by Administrator on 2018/7/17 0017.
 */
//class User(private val mFirstName: String,
//           private val mLastName: String,
//           private val mGender: String,
//           private val mAge: String,
//           private val mPhoneNo: String) {
//
//    @JvmOverloads constructor(mFirstName: String,
//                              mLastName: String,
//                              mGender: String="",
//                              mAge: String=""
//    ) : this(mFirstName, mLastName, mGender, mAge, "")
//
//
//}
class User constructor(private val builder: UserBuilder) {
    private val mFirstName: String = builder.mFirstName
    private val mLastName: String = builder.mLastName
    private val mAge: Int? = builder.mAge
    private val mGender: String? = builder.mGender
    private val mPhoneNo: String? = builder.mPhoneNo


         class UserBuilder constructor(val mFirstName: String, val mLastName: String) {
            var mAge: Int? = null
            var mGender: String? = null
            var mPhoneNo: String? = null
            fun Age(mAge: Int): UserBuilder {
                this.mAge = mAge
                return this
            }

            fun Gender(mGender: String): UserBuilder {
                this.mGender = mGender
                return this
            }

            fun PhoneNo(mPhoneNo: String): UserBuilder {
                this.mPhoneNo = mPhoneNo
                return this
            }

            fun build(): User {
                return User(this)
            }

        }
}