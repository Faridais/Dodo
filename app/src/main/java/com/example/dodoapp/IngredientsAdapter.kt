package com.example.dodoapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IngredientsAdapter(): RecyclerView.Adapter<IngredientsAdapter.IngredientsViewHolder>() {
    private var listIngredients:List<Food> = emptyList()
    var onItemClick:((Int, Int)->Unit)?=null

    fun submitList(newList: List<Food>){
        listIngredients=newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        return IngredientsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_ingredients_design,parent,false))
    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        holder.image.setImageResource(listIngredients[position].imageId)
        holder.name.text=listIngredients[position].name
        holder.ingredients.text= listIngredients[position].consistOf
        holder.description.text=listIngredients[position].description

    }

    override fun getItemCount(): Int {
        return listIngredients.size
    }


    inner class IngredientsViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val image:ImageView=view.findViewById(R.id.image_food_ingredients)
        val name: TextView=view.findViewById(R.id.name_food)
        val ingredients:TextView=view.findViewById(R.id.ingredients)
        val description:TextView=view.findViewById(R.id.description_food)

        init{
            view.setOnClickListener{
                onItemClick?.invoke(listIngredients[adapterPosition].category, adapterPosition)
            }
        }
    }
}