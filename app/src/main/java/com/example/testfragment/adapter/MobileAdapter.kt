package com.example.testfragment.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.model.MobileModel

class MobileAdapter(
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