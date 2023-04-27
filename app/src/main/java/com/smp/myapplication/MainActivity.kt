package com.smp.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.smp.soundtouchandroid.SoundTouch


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val soundTouch =
            SoundTouch(0, 2, 44100, 2, 1.0f, 2.0f)

    }
}