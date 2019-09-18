package com.example.testfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.MobileModel
import com.squareup.picasso.Picasso

class MobileListHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.mobile_list_card_holder, parent, false)
) {

    private val mobilePic: ImageView = itemView.findViewById(R.id.mobilePic)
    private val mobileName: TextView = itemView.findViewById(R.id.mobileName)
    private val mobileDescription: TextView = itemView.findViewById(R.id.mobileDescription)
    private val mobilePrice: TextView = itemView.findViewById(R.id.mobilePrice)
    private val mobileRating: TextView = itemView.findViewById(R.id.mobileRating)

    //fun bind(model: MobileModel, listener: BeerItemClickListener) {
    fun bind(model: MobileModel) {

//        itemView.setOnClickListener {
//            listener.onItemClick(model)
//        }

        Picasso.get()
            .load(model.thumbImageURL)
            //.placeholder(R.mipmap.ic_launcher)
            .into(mobilePic)
        mobileName.text = model.name
        mobileDescription.text = model.description
        mobilePrice.text = "Price: $${model.price}"
        mobileRating.text = "Rating: ${model.rating.toString()}"


    }

}