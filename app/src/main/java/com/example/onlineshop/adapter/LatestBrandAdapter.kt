package com.example.onlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.R
import com.example.onlineshop.model.LatestBrand
import kotlinx.android.synthetic.main.item_arrival.view.*

class LatestBrandViewHolder (itemView : View) :RecyclerView.ViewHolder(itemView){
    var latestImage = itemView.findViewById<ImageView>(R.id.img_arrival)
    var latestBrandName = itemView.findViewById<TextView>(R.id.txt_l_brand_name)
    var latestBrandType = itemView.findViewById<TextView>(R.id.txt_l_product_id)
    var oldPrice = itemView.findViewById<TextView>(R.id.txt_lold_price)
    var latestBrandPrice = itemView.findViewById<TextView>(R.id.txt_l_price)
    var latestOldPrice = itemView.findViewById<TextView>(R.id.txt_lold_price)
}

class LatestBrandAdapter(var latestBrandList : ArrayList<LatestBrand>):
        RecyclerView.Adapter<LatestBrandViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestBrandViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_arrival,parent,false)
        return LatestBrandViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestBrandList.size
    }

    override fun onBindViewHolder(holder: LatestBrandViewHolder, position: Int) {
        holder.latestBrandName.text = latestBrandList[position].latestBrandName
        holder.latestBrandType.text = latestBrandList[position].latestBrandType
        holder.latestImage.setImageResource(latestBrandList[position].latestBrandImage)

        if (latestBrandList[position].oldPrice>0){
            holder.latestOldPrice.text = latestBrandList[position].oldPrice.toString()
//        } else {
//            holder.latestOldPrice =""
        }
        holder.latestBrandPrice.text = latestBrandList[position].latestPrice.toString()
    }

}