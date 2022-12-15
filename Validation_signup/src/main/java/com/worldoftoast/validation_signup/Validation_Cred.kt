package com.worldoftoast.validation_signup

import android.text.TextUtils
import android.util.Patterns


class Validation_Cred {

    fun emailValidator(email:String?):Boolean{
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}