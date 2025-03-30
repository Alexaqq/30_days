package com.example.day_30

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipsAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val currentTip = tips[position]
        holder.dayIndicator.text = "День ${currentTip.day}"
        holder.tipTitle.text = currentTip.title
        holder.tipImage.setImageResource(currentTip.imageResource)
        holder.tipDescription.text = currentTip.description
    }

    override fun getItemCount(): Int = tips.size
}

class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val dayIndicator: TextView = itemView.findViewById(R.id.dayIndicator)
    val tipTitle: TextView = itemView.findViewById(R.id.tipTitle)
    val tipImage: ImageView = itemView.findViewById(R.id.tipImage)
    val tipDescription: TextView = itemView.findViewById(R.id.tipDescription)
}