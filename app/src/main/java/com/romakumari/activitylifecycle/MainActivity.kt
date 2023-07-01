package com.romakumari.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {var btnbutton :Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnbutton= findViewById(R.id.btnbutton)
        btnbutton?.setOnClickListener {
            var intent = Intent(this,NewPage1::class.java)
            startActivity(intent)
        }
    }



    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"start",Toast.LENGTH_LONG).show()}
        override fun onResume(){
       super.onResume()
        Toast.makeText(this," resume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this," pause",Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this," stop",Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this," destroy",Toast.LENGTH_LONG).show()

    }


    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this," restart",Toast.LENGTH_SHORT).show()


    }
}