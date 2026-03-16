package com.gallery.essence.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artwork(
    val id: Int,
    val title: String,
    val category: String,  // Keep this field but we'll use "Portrait" for all
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
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/2c2c2c/ffffff?text=Kobe+Bryant",
                description = "A striking charcoal portrait capturing the intensity and determination in Kobe Bryant's eyes. Every stroke represents his legendary Mamba Mentality and unwavering focus."
            ),
            Artwork(
                id = 2,
                title = "Nelson Mandela",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/333333/ffffff?text=Nelson+Mandela",
                description = "Wisdom etched in charcoal. This portrait honors the father of South Africa, capturing the strength, resilience, and hope that defined his incredible journey."
            ),
            Artwork(
                id = 3,
                title = "Frida Kahlo",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/2a2a2a/ffffff?text=Frida+Kahlo",
                description = "Bold strokes bring Frida Kahlo's iconic gaze to life. Her strength, pain, and artistic genius captured in monochromatic beauty."
            ),
            Artwork(
                id = 4,
                title = "Muhammad Ali",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/1a1a1a/ffffff?text=Muhammad+Ali",
                description = "The Greatest. Charcoal captures the fire in his eyes and the confidence in his stance. A champion both in and out of the ring."
            ),
            Artwork(
                id = 5,
                title = "Bob Marley",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/2e2e2e/ffffff?text=Bob+Marley",
                description = "One Love, captured in charcoal. Bob Marley's spirit and musical legacy shine through in this deeply expressive portrait."
            ),
            Artwork(
                id = 6,
                title = "Tupac Shakur",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/252525/ffffff?text=Tupac+Shakur",
                description = "A poetic soul immortalized in graphite. This portrait reflects Tupac's complexity - artist, activist, and icon of a generation."
            ),
            Artwork(
                id = 7,
                title = "Maya Angelou",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/303030/ffffff?text=Maya+Angelou",
                description = "Grace and wisdom flow through every charcoal line. Maya Angelou's powerful presence captured in monochrome elegance."
            ),
            Artwork(
                id = 8,
                title = "Martin Luther King Jr.",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/1f1f1f/ffffff?text=MLK+Jr",
                description = "I Have a Dream. This charcoal portrait honors a man whose vision and courage changed the world. Every shadow tells a story of hope."
            ),
            Artwork(
                id = 9,
                title = "Albert Einstein",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/2b2b2b/ffffff?text=Albert+Einstein",
                description = "Genius captured in charcoal. Einstein's contemplative gaze and wild hair brought to life through masterful shading and detail."
            ),
            Artwork(
                id = 10,
                title = "Beyoncé",
                category = "Charcoal Portrait",
                imageUrl = "https://via.placeholder.com/400x600/282828/ffffff?text=Beyonce",
                description = "Queen Bey immortalized in charcoal. Strength, beauty, and artistry captured in every carefully placed stroke."
            )
        )
    }
}