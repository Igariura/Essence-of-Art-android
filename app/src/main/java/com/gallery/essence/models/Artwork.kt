package com.gallery.essence.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artwork(
    val id: Int,
    val title: String,
    val category: String,
    val imageUrl: String,
    val description: String,
    val artist: String = "Essence of Art"
) : Parcelable

object ArtworkData {
    fun getArtworks(): List<Artwork> {
        return listOf(
            Artwork(
                id = 1,
                title = "Kobe Bryant",
                category = "Portraits",
                imageUrl = "https://via.placeholder.com/400x300/667eea/ffffff?text=Kobe+Bryant",
                description = "A stunning portrait capturing the legendary Kobe Bryant's intense focus and determination on the court. This piece embodies the spirit of greatness and perseverance."
            ),
            Artwork(
                id = 2,
                title = "Sunset Over Mountains",
                category = "Landscapes",
                imageUrl = "https://via.placeholder.com/400x300/e74c3c/ffffff?text=Sunset",
                description = "Beautiful sunset painting with vibrant colors cascading over majestic mountain peaks. The warm hues create a peaceful and contemplative atmosphere."
            ),
            Artwork(
                id = 3,
                title = "Abstract Dreams",
                category = "Abstract",
                imageUrl = "https://via.placeholder.com/400x300/f39c12/ffffff?text=Abstract",
                description = "Modern abstract piece with bold colors and dynamic shapes that evoke emotion and invite personal interpretation. A celebration of creative freedom."
            ),
            Artwork(
                id = 4,
                title = "City Lights",
                category = "Urban",
                imageUrl = "https://via.placeholder.com/400x300/764ba2/ffffff?text=City",
                description = "Captivating urban nightscape showcasing the vibrant energy of city life. The interplay of light and shadow brings the metropolitan pulse to life."
            ),
            Artwork(
                id = 5,
                title = "Ocean Waves",
                category = "Nature",
                imageUrl = "https://via.placeholder.com/400x300/2c3e50/ffffff?text=Ocean",
                description = "Serene ocean scene with powerful waves crashing against the shore. The rhythmic motion captures nature's raw beauty and timeless power."
            ),
            Artwork(
                id = 6,
                title = "Forest Path",
                category = "Nature",
                imageUrl = "https://via.placeholder.com/400x300/27ae60/ffffff?text=Forest",
                description = "Peaceful forest trail leading through lush greenery and towering trees. An invitation to explore the quiet beauty of the natural world."
            )
        )
    }
}