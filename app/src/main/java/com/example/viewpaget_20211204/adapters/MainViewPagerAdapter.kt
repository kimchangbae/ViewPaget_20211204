package com.example.viewpaget_20211204.adapters

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpaget_20211204.fragments.AddressFragment
import com.example.viewpaget_20211204.fragments.AgeFragment
import com.example.viewpaget_20211204.fragments.NameFragment

class MainViewPagerAdapter( fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "이름"
            1 -> "거주지"
            else -> "나이"
        }

/*
        if(position == 0) {
            return "이름"
        } else if(position == 1) {
            return "주소"
        } else {
            return "나이"
        }
 */
    }
/*
    override fun getCount(): Int {
        return 3
    }
 */

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
/*
        when(position) {
            0 -> {
                Log.d("MainViewPagerAdapter", "이름 탭 클릭");
                return NameFragment()
            }

            1 -> {
                Log.d("MainViewPagerAdapter", "주소 탭 클릭");
                return AddressFragment()
            }

            else -> {
                Log.d("MainViewPagerAdapter", "나이 탭 클릭");
                return AgeFragment()
            }
        }
 */

        return when(position) {
            0 -> NameFragment()
            1 -> AddressFragment()
            else -> AgeFragment()
        }

/*
        if (position == 0) {
            Log.d("MainViewPagerAdapter", "이름 탭 클릭");
            return NameFragment()
        } else if(position == 1) {
            Log.d("MainViewPagerAdapter", "주소 탭 클릭");
            return AddressFragment()
        } else {
            Log.d("MainViewPagerAdapter", "나이 탭 클릭");
            return AgeFragment()
        }
 */
    }

}