package com.example.multiplescreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MultiplactoinTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplactoin_table)


        val bundle: Bundle? = intent.extras
        val tableString: String = bundle?.getString("tableNumber")


    }
}