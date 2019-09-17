package com.example.testfragment.adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.model.FragmentModel
import com.example.testfragment.model.MobileModel

//class SectionsPagerAdapter(private val fmList: List<FragmentModel>, fm: FragmentManager) : FragmentPagerAdapter(fm) {
//
//    override fun getItem(position: Int): Fragment {
//        return fmList[position].fragment
//    }
//
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return fmList[position].tabName
//    }
//
//    // size ขนาดเท่าไหร่
//    override fun getCount(): Int {
//        return fmList.count()
//    }
//
//
//}

class SectionsPagerAdapter(
    private val mobileList: List<MobileModel>
//    ,private val listener: MobileItemClickListener
) : RecyclerView.Adapter<MobileListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobileListHolder {
        return MobileListHolder(parent)
    }

    override fun getItemCount(): Int = mobileList.count()

    override fun onBindViewHolder(holder: MobileListHolder, position: Int) {
          holder.bind(mobileList[position])
//        holder.bind(mobileList[position], listener)
    }

}