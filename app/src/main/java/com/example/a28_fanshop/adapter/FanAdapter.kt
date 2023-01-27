package com.example.a28_fanshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.a28_fanshop.R
import com.example.a28_fanshop.data.model.Fan
import com.example.a28_fanshop.ui.HomeFragmentDirections
import com.google.android.material.card.MaterialCardView

// der Adapter braucht den Context um auf String Resourcen zuzugreifen
// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
class FanAdapter(
    private val dataset: List<Fan>
) : RecyclerView.Adapter<FanAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val fanImage = view.findViewById<ImageView>(R.id.fan_image)
        val fanName = view.findViewById<TextView>(R.id.fan_name_text)
        val fanPrice = view.findViewById<TextView>(R.id.fan_price_text)
        val fanCard = view.findViewById<MaterialCardView>(R.id.fan_card)
    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.fan_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fan = dataset[position]

        holder.fanImage.setImageResource(fan.imageResource)
        holder.fanName.text = fan.name
        holder.fanPrice.text = "${fan.price} Euro"

        holder.fanCard.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(fan))
        }
    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}
