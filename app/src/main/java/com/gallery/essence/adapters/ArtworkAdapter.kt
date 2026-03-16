package com.gallery.essence.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gallery.essence.R
import com.gallery.essence.models.Artwork

class ArtworkAdapter(
    private val artworks: List<Artwork>,
    private val onItemClick: (Artwork) -> Unit
) : RecyclerView.Adapter<ArtworkAdapter.ArtworkViewHolder>() {

    class ArtworkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val artworkImage: ImageView = view.findViewById(R.id.artworkImage)
        val artworkTitle: TextView = view.findViewById(R.id.artworkTitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtworkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_artwork, parent, false)
        return ArtworkViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtworkViewHolder, position: Int) {
        val artwork = artworks[position]

        holder.artworkTitle.text = artwork.title
        // REMOVE: holder.artworkCategory.text = artwork.category

        Glide.with(holder.itemView.context)
            .load(artwork.imageUrl)
            .placeholder(R.color.primary_color)
            .into(holder.artworkImage)

        holder.itemView.setOnClickListener {
            onItemClick(artwork)
        }
    }

        // Click listener


    override fun getItemCount() = artworks.size
}