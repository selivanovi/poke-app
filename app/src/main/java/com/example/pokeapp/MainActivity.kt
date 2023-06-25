package com.example.pokeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _mainActivityBinding: ActivityMainBinding? = null
    private val mainActivityBinding: ActivityMainBinding
        get() = _mainActivityBinding ?: throw NullPointerException()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
    }
}