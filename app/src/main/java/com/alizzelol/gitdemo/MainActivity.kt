package com.alizzelol.gitdemo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d("Tag", "Esto es una prueba")
        Log.d("Tag", "Esto es una prueba")
        Log.d("Tag", "Esto es una prueba")
        Log.d("Tag", "Esto es una prueba")
        Log.d("Tag", "Esto es una prueba")
        Log.d("Tag", "Esto es una prueba")
        Log.d("Tag", "Esto es una prueba")




    }
}