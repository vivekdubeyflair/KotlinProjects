package com.flair.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.flair.R
import com.flair.base.RVItemClickListener
import kotlinx.android.synthetic.main.custom_item_view.view.*
import kotlinx.android.synthetic.main.vertical_item_view.view.*

/**
 * Created by Vijesh Jat on 07-01-2019.
 */

class VerticalListAdapter(val locations: List<String>, val context: Context, val listener: RVItemClickListener) : RecyclerView.Adapter<VerticalListAdapter.MyHolder>() {


    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return locations.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(context).inflate(R.layout.vertical_item_view, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder?.tvAnimalType?.text = locations.get(position)

        holder.itemView.setOnClickListener(View.OnClickListener {

            listener?.onItemClick(position,it)

        })
    }


    class MyHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.textLocationName
    }


}




