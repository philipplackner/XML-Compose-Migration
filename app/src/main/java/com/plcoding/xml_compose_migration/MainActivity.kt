package com.plcoding.xml_compose_migration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plcoding.xml_compose_migration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}