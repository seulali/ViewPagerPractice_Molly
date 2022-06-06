package com.example.viewpagerpractice_molly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.viewpagerpractice_molly.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter
//        페이지가 많아질 때, 간단하게 부드럽도록 지원하는 기능
        mainViewPager.offscreenPageLimit = 5

//        탭 레이아웃을 뷰페이지와 연결
        myTabLayout.setupWithViewPager(mainViewPager)
    }
}