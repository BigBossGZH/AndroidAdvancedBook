package com.codekili.androidadvancedbook.chapter_14;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2018/8/2 0002.
 */

public class BookItem implements Parcelable {
    public String mName;
    public long mLastTime;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mName);
        dest.writeLong(this.mLastTime);
    }

    public BookItem() {
    }

    protected BookItem(Parcel in) {
        this.mName = in.readString();
        this.mLastTime = in.readLong();
    }

    public static final Parcelable.Creator<BookItem> CREATOR = new Parcelable.Creator<BookItem>() {
        @Override
        public BookItem createFromParcel(Parcel source) {
            return new BookItem(source);
        }

        @Override
        public BookItem[] newArray(int size) {
            return new BookItem[size];
        }
    };
}
