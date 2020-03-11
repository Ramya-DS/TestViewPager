package com.example.testviewpager


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import android.widget.TableRow


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager=findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter=ViewPagerAdapter(supportFragmentManager)

        val tabLayout: TabLayout= findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}
