package com.maeun.sopt_5th_basic

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(Build.VERSION.SDK_INT>=26){

        }
        else{
            //setContentView(R.layout.activity_main_25)
        }
    }
}
