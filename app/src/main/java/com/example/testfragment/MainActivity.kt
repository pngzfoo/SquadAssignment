package com.example.testfragment

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.testfragment.model.FragmentModel
import com.example.testfragment.ui.main.PlaceholderFragment
import com.example.testfragment.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setView()


    }

    private fun setView() {

        val homeList: List<FragmentModel> = listOf(
            FragmentModel("Mobile List", PlaceholderFragment.newInstance()),
            FragmentModel("Favorite List", PlaceholderFragment.newInstance())
            )
        // viewPager คือตัวที่ hold หน้าสองหน้า fragment tab รับ adaptor เข้ามา ต้องการ viewpagger
        val sectionsPagerAdapter = SectionsPagerAdapter(homeList, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
    }
}