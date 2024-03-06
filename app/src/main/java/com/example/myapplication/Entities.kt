package com.example.myapplication

import android.provider.ContactsContract.CommonDataKinds.Email
import java.io.Serializable

data class Entities (var email:String, var  password: String,var name:String): Serializable