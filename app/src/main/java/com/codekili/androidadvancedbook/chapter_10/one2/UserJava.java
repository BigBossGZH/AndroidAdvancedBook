package com.codekili.androidadvancedbook.chapter_10.one2;

/**
 * Created by Administrator on 2018/7/17 0017.
 */

public class UserJava {
//    private final String mFirstName;
//    private final String mLastName;
//    private final String mAge;
//    private final String mGender;
//    private final String mPhoneNo;

//    public UserJava(String mFirstName, String mLastName) {
//        this(mFirstName, mLastName, "");
//    }
//
//    public UserJava(String mFirstName, String mLastName, String mAge) {
//        this(mFirstName, mLastName, mAge, "");
//    }
//
//    public UserJava(String mFirstName, String mLastName, String mAge, String mGender) {
//        this(mFirstName, mLastName, mAge, mGender, "");
//    }
//
//    public UserJava(String mFirstName, String mLastName, String mGender, String mAge, String mPhoneNo) {
//        this.mFirstName = mFirstName;
//        this.mLastName = mLastName;
//        this.mGender = mGender;
//        this.mAge = mAge;
//        this.mPhoneNo = mPhoneNo;
//    }

    private final String mFirstName;
    private final String mLastName;
    private final String mAge;
    private final String mGender;
    private final String mPhoneNo;

    private UserJava(Builder builder) {
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mAge = builder.mAge;
        mGender = builder.mGender;
        mPhoneNo = builder.mPhoneNo;
    }

    public static final class Builder {
        private String mFirstName;
        private String mLastName;
        private String mAge;
        private String mGender;
        private String mPhoneNo;

        public Builder() {
        }

        public Builder mFirstName(String val) {
            mFirstName = val;
            return this;
        }

        public Builder mLastName(String val) {
            mLastName = val;
            return this;
        }

        public Builder mAge(String val) {
            mAge = val;
            return this;
        }

        public Builder mGender(String val) {
            mGender = val;
            return this;
        }

        public Builder mPhoneNo(String val) {
            mPhoneNo = val;
            return this;
        }

        public UserJava build() {
            return new UserJava(this);
        }
    }


//    public UserJava(UserBuilderJava builder) {
//        mFirstName = builder.mFirstName;
//        mLastName = builder.mLastName;
//        mAge = builder.mAge;
//        mGender = builder.mGender;
//        mPhoneNo = builder.mPhoneNo;
//
//    }
//    public static class  UserBuilderJava {
//        private final String mFirstName;
//        private final String mLastName;
//        private  String mAge;
//        private  String mGender;
//        private  String mPhoneNo;
//
//        public UserBuilderJava(String mFirstName, String mLastName) {
//            this.mFirstName = mFirstName;
//            this.mLastName = mLastName;
//        }
//
//        public UserBuilderJava setmAge(String mAge) {
//            this.mAge = mAge;
//            return this;
//        }
//
//        public void setmGender(String mGender) {
//            this.mGender = mGender;
//        }
//
//        public void setmPhoneNo(String mPhoneNo) {
//            this.mPhoneNo = mPhoneNo;
//        }
//    }
}
