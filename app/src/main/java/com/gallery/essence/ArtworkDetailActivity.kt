package com.gallery.essence



import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.gallery.essence.models.Artwork

class ArtworkDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artwork_detail)

        // Get artwork from intent
        val artwork = intent.getParcelableExtra<Artwork>("artwork")

        if (artwork != null) {
            // Find views
            val imageView = findViewById<ImageView>(R.id.detailImage)
            val titleText = findViewById<TextView>(R.id.detailTitle)
            val categoryText = findViewById<TextView>(R.id.detailCategory)
            val descriptionText = findViewById<TextView>(R.id.detailDescription)
            val artistText = findViewById<TextView>(R.id.detailArtist)

            // Set data
            titleText.text = artwork.title
            categoryText.text = artwork.category
            descriptionText.text = artwork.description
            artistText.text = "By ${artwork.artist}"

            // Load image
            Glide.with(this)
                .load(artwork.imageUrl)
                .placeholder(R.color.primary_color)
                .into(imageView)
        }
    }
}