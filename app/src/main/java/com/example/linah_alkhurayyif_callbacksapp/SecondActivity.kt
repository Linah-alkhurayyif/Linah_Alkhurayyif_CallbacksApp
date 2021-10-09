package com.example.linah_alkhurayyif_callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this,"onCreate the Second Activity", Toast.LENGTH_SHORT).show()
        Log.d("SecondActivity", "SecondActivity onCreate")
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart the Second Activity", Toast.LENGTH_SHORT).show()

        Log.d("SecondActivity", "SecondActivity onStart")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume the Second Activity", Toast.LENGTH_SHORT).show()

        Log.d("SecondActivity", "SecondActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause the Second Activity", Toast.LENGTH_SHORT).show()

        Log.d("SecondActivity", "SecondActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop the Second Activity", Toast.LENGTH_SHORT).show()

        Log.d("SecondActivity", "SecondActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"onDestroy the Second Activity", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onDestroy")
    }

}