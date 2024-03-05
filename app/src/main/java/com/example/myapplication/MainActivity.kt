package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  lateinit var edittextemail:EditText
    private lateinit var edittextpassword:EditText

//var emailpasswordmap :HashMap<String, String>= HashMap<String,String>()

    //listOf<String>("new@gmail.com")
    var passwordlist= listOf<String>("123")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var signinbutton=findViewById<Button>(R.id.buttonsignin)
        signinbutton.setOnClickListener{
if(edittextemail.text.toString().isNullOrBlank()){
    Toast.makeText(this,"EMAIL SHOULD NOT BE EMPTY",Toast.LENGTH_LONG ).show()
}
//            else{
//                for (i in emaillist){
//                    if (i==edittextemail.text.toString()){
//
//                    }
//                }
//            }
        }
    }

}