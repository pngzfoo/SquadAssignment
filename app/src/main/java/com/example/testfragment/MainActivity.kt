package com.example.testfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testfragment.model.FragmentModel
import com.example.testfragment.ui.main.main.main.FragmentInterface
import com.example.testfragment.ui.main.main.main.FragmentPresenter
import com.example.testfragment.ui.main.main.main.IntroPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        setView()
//
//
//    }
//
//    private fun setView() {
//
//        val homeList: List<FragmentModel> = listOf(
//            FragmentModel("Mobile List", MobileListFragment.newInstance()),
//            FragmentModel("Favorite List", FavoriteListFragment.newInstance())
//            )
//        // viewPager คือตัวที่ hold หน้าสองหน้า fragment tab รับ adaptor เข้ามา ต้องการ viewpager
//        val sectionsPagerAdapter =
//            SectionsPagerAdapter(homeList, supportFragmentManager)
//        view_pager.adapter = sectionsPagerAdapter
//        tabs.setupWithViewPager(view_pager)
//    }
//}

class MainActivity : AppCompatActivity(), FragmentInterface {

    companion object {
        const val LIST_MOBILE_TAB_NAME = "Mobile List"
        const val FAVORITE_LIST_TAB_NAME = "Favorite List"
    }

    private val presenter = FragmentPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.getFragment()
    }

    // viewPager คือตัวที่ hold หน้าสองหน้า fragment tab รับ adaptor เข้ามา ต้องการ viewpager
    override fun setFragment(fragmentList: List<FragmentModel>) {
        val sectionsPagerAdapter = IntroPagerAdapter(fragmentList, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
    }

}