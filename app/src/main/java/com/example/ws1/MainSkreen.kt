package com.example.ws1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ws1.databinding.ActivityMainSkreenBinding

class MainSkreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainSkreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainSkreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, main()).commit()

    }
}