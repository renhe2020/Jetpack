package com.example.jetpack.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.jetpack.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1、获取到NavigationController
        val navigationController =
            Navigation.findNavController(this, R.id.nav_host_fragment_container)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // 2、将Fragment与BottomNavigationView绑定
        NavigationUI.setupWithNavController(bottomNavigation, navigationController)
    }
}