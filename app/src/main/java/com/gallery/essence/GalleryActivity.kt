package com.gallery.essence

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gallery.essence.adapters.ArtworkAdapter
import com.gallery.essence.models.ArtworkData
import android.content.Intent

class GalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        // Get artworks
        val artworks = ArtworkData.getArtworks()

        // Setup RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewGallery)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 columns

        // Setup adapter
        val adapter = ArtworkAdapter(artworks) { artwork ->
            // Open detail screen
            val intent = Intent(this, ArtworkDetailActivity::class.java)
            intent.putExtra("artwork", artwork)
            startActivity(intent)
        }


        recyclerView.adapter = adapter
    }
}