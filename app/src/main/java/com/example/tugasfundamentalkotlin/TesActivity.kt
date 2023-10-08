package com.example.tugasfundamentalkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tes)

        val fragmentManager = supportFragmentManager
        val fragmentHome = FragmentHome()
        val fragment = fragmentManager.findFragmentByTag(FragmentHome::class.java.simpleName)

        if (fragment !is FragmentHome){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, fragmentHome, FragmentHome::class.java.simpleName)
                .commit()

        }
    }
}