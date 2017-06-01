package com.iot.login_java_kotlin

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by User on 2017-06-01.
 */


class Data(var PW : String) : Parcelable{

   fun Data(parcel: Parcel){
       PW = parcel.readString()
   }

    companion object{

        val CREATOR: Parcelable.Creator<Data> = object : Parcelable.Creator<Data>{
            override fun newArray(size: Int): Array<Data> {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            }

            override fun createFromParcel(source: Parcel): Data {

                return Data(source)
            }

        }

    }


    override fun writeToParcel(dest: Parcel, flags: Int) {

        dest.writeString(PW)
    }

    override fun describeContents(): Int {
        return 0
    }


}