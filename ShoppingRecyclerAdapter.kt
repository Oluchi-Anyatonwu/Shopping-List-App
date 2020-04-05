package com.example.shoppinglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ShoppingRecyclerAdapter(private val items: List<ShoppingItem>): RecyclerView.Adapter<ShoppingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        return ShoppingViewHolder(LayoutInflater.from(parent:context).inflate(R.layout.shopping_list_item,parent,false))
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) = holder.bind(items[position]))
    }
}
}