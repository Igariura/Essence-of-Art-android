package com.gallery.essence.models

import android.content.res.Resources
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.gallery.essence.R

@Parcelize
data class Artwork(
    val id: Int,
    val title: String,
    val category: String,  // Keep this field but we'll use "Portrait" for all
    val imageResource:Int,
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
                imageResource = R.drawable.portrait_kobe,  // Make sure this matches your filename!
                description = "A striking charcoal portrait capturing the intensity and determination in Kobe Bryant's eyes. Every stroke represents his legendary Mamba Mentality."
            ),
            Artwork(
                id = 2,
                title = "Nelson Mandela",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_mandela,
                description = "Wisdom etched in charcoal. This portrait honors the father of South Africa, capturing strength, resilience, and hope."
            ),
            Artwork(
                id = 3,
                title = "Frida Kahlo",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_frida,
                description = "Bold strokes bring Frida Kahlo's iconic gaze to life. Her strength, pain, and artistic genius captured in monochromatic beauty."
            ),
            Artwork(
                id = 4,
                title = "Muhammad Ali",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_ali,
                description = "The Greatest. Charcoal captures the fire in his eyes and the confidence in his stance."
            ),
            Artwork(
                id = 5,
                title = "Bob Marley",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_marley,
                description = "One Love, captured in charcoal. Bob Marley's spirit and musical legacy shine through."
            ),
            Artwork(
                id = 6,
                title = "Tupac Shakur",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_tupac,
                description = "A poetic soul immortalized in graphite. Tupac's complexity as artist, activist, and icon."
            ),
            Artwork(
                id = 7,
                title = "Maya Angelou",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_maya,
                description = "Grace and wisdom flow through every charcoal line. Maya Angelou's powerful presence."
            ),
            Artwork(
                id = 8,
                title = "Martin Luther King Jr.",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_mlk,
                description = "I Have a Dream. This portrait honors a man whose vision changed the world."
            ),
            Artwork(
                id = 9,
                title = "Albert Einstein",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_einstein,
                description = "Genius captured in charcoal. Einstein's contemplative gaze and wild hair brought to life."
            ),
            Artwork(
                id = 10,
                title = "Beyoncé",
                category = "Charcoal Portrait",
                imageResource = R.drawable.portrait_beyonce,
                description = "Queen Bey immortalized in charcoal. Strength, beauty, and artistry in every stroke."
            )
        )
    }
}
