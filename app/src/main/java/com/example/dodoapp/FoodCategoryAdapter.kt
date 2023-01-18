package com.example.dodoapp

import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView

class FoodCategoryAdapter():RecyclerView.Adapter<FoodCategoryAdapter.FoodCategoryViewHolder>() {
    private var listCategory:List<FoodCategory> = emptyList()
    var onItemClick:((Int)->Unit)?=null

    fun submitList(newList: List<FoodCategory>){
        listCategory=newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodCategoryViewHolder {
        return FoodCategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item_category,parent,false))
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: FoodCategoryViewHolder, position: Int) {
        holder.button.text=listCategory[position].category

        if (listCategory[position].isSelected){
            holder.button.setBackgroundResource(R.drawable.button_click_active_design)
            holder.button.setTextColor(holder.itemView.resources.getColor(R.color.color_text_categoryfilter_selected,null))
        }else {
            holder.button.setBackgroundResource(R.drawable.button_click_unactive)
            holder.button.setTextColor(holder.itemView.resources.getColor(R.color.color_text_categoryfilter_non,null))
        }

    }

    override fun getItemCount(): Int {
        return listCategory.size
    }


    inner class FoodCategoryViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val button:TextView=view.findViewById(R.id.rvButton)

        init{
            view.setOnClickListener{
                onItemClick?.invoke(listCategory[adapterPosition].id)
            }
        }

    }

}