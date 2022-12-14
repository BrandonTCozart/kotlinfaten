package com.example.koylinfasten.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.koylinfasten.R
//import com.example.koylinfasten.activities.databinding.ActivityMain4Binding
import com.example.koylinfasten.databinding.ActivityMain4Binding
import com.example.koylinfasten.interfaces.IActivityTransaction

class MainActivity4 : AppCompatActivity(), IActivityTransaction {

    /* Task/operation Scheduler */

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main3)
        appBarConfiguration = AppBarConfiguration(navController.graph)


    }


    override fun toFirstActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}