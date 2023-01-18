package com.example.dodoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComboAdapter(): RecyclerView.Adapter<ComboAdapter.ComboViewHolder>() {
    private var listCombo:List<Food> = emptyList()

    var onItemClick:((Int)->Unit)?=null

    var onViewChange:((Int)->Unit)?=null

    fun submitList(newList: List<Food>){
        listCombo=newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComboViewHolder {
        return ComboViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_combo_choice,parent,false))
    }

    override fun onBindViewHolder(holder: ComboViewHolder, position: Int) {
        holder.imageView.setImageResource(listCombo[position].imageId)
        holder.name.text=listCombo[position].name
        holder.size.text=listCombo[position].consistOf
        holder.description.text=listCombo[position].description
        onViewChange?.invoke(position+1)
    }

    override fun getItemCount(): Int {
        return listCombo.size
    }

    inner class ComboViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageView:ImageView=view.findViewById(R.id.pizza_image)
        val name: TextView=view.findViewById(R.id.name_pizza)
        val description: TextView= view.findViewById(R.id.description)
        val size: TextView= view.findViewById(R.id.size)
        val button:TextView=view.findViewById(R.id.button_choose_combo)

        init {
            button.setOnClickListener {
                onItemClick?.invoke(adapterPosition) }
            }


        }
    }
