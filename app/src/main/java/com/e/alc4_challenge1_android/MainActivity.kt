package com.e.alc4_challenge1_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mToolbar = findViewById<Toolbar>(R.id.toolbar);
        setSupportActionBar(mToolbar)
        supportActionBar!!.title = getString(R.string.app_name)

        about.setOnClickListener {
            val aboutIntent = Intent(this,ActivityB::class.java)
            this.startActivity(aboutIntent)
        }

        myProfile.setOnClickListener {
            val profileIntent = Intent(this,ActivityC::class.java)
            this.startActivity(profileIntent)
        }
    }
}
