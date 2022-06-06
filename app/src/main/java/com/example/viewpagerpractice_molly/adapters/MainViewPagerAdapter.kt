package com.example.viewpagerpractice_molly.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_molly.fragments.GreetingsFragment
import com.example.viewpagerpractice_molly.fragments.MyInfoFragment
import com.example.viewpagerpractice_molly.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0) {
            return NameFragment()
        }
        else if(position == 1){
            return MyInfoFragment()
        }
        else {
            return GreetingsFragment()
        }
    }
}