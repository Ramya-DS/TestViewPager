package com.example.testviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(var fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> OneFragment()
            1 -> TwoFragment()
            2 -> ThreeFragment()
            else -> OneFragment()
        }

    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence? {
        val title = getItem(position).javaClass.name
        return title.subSequence(title.lastIndexOf(".") + 1, title.length)
    }
}