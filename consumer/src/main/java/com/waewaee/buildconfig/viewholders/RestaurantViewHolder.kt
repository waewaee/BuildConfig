package com.waewaee.buildconfig.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.waewaee.shared.data.vos.RestaurantVO
import kotlinx.android.synthetic.main.view_holder_restaurant.view.*

class RestaurantViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bindData(data: RestaurantVO) {
        Glide.with(itemView.context)
            .load(data.imageUrl)
            .into(itemView.ivRestaurantImage)

        itemView.tvRestaurantName.text = data.name
        itemView.tvCategory.text = data.category
        itemView.tvDeliveryFees.text = "${data.deliveryPrice.toString()} MMK"
        itemView.tvRating.text = data.rating.toString()
    }
}