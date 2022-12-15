package com.worldoftoast.toastlog_library

import android.content.Context
import android.util.Log
import android.widget.Toast

class ToastLog {
    fun toast(context: Context, message:String){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
    fun log(message:String){
        Log.d("toasterlog:- ",message)
    }

    fun print(string:String){
        print(string)
    }

}