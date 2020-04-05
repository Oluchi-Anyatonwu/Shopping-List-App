package com.example.shoppinglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_list_item.view.*

class ShoppingViewHolder(itemView: View): RecyclerView.ViewHolder (itemView) {
    fun bind(item: ShoppingItem){
        itemView.textView.text = item.Key
        itemView.textView.text = item.Value

    }
}