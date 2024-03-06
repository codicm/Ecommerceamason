package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

    }
    fun petclick(v:View){
        Toast.makeText(this, "Pet supplies category selected", Toast.LENGTH_LONG).show()
    }
    fun toyclick(v:View){
        Toast.makeText(this, "Toys and games category selected", Toast.LENGTH_LONG).show()
    }
    fun homeclick(v:View){
        Toast.makeText(this, "Home and Kitchen category selected", Toast.LENGTH_LONG).show()
    }
    fun beautyclick(v:View){
        Toast.makeText(this, "Beauty and personal care category selected", Toast.LENGTH_LONG).show()
    }
}