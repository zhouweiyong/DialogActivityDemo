package com.nze.dialogactivitydemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1_main.setOnClickListener {
            startActivity(Intent(this@MainActivity, PopupActivityActivity::class.java))
        }

        btn2_main.setOnClickListener {
            startActivity(Intent(this@MainActivity, CommonActivity::class.java))

        }
    }
}
