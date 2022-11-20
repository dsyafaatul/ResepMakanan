package com.dsyafaatul.resepmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvResep: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvResep = findViewById(R.id.rv_resep)
        rvResep.setHasFixedSize(true)
        rvResep.layoutManager = LinearLayoutManager(this)
        val cardResepAdapter = CardResepAdapter(ResepData.listData)
        rvResep.adapter = cardResepAdapter

        cardResepAdapter.setOnItemClickCallback(object: CardResepAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Resep) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(resep: Resep){
        val intent = Intent(this@MainActivity, DetailResep::class.java)
        intent.putExtra("title", resep.title)
        intent.putExtra("thumb", resep.thumb)
        intent.putExtra("key", resep.key)
        intent.putExtra("times", resep.times)
        intent.putExtra("serving", resep.serving)
        intent.putExtra("difficulty", resep.difficulty)
        intent.putExtra("ingredient", resep.ingredient)
        intent.putExtra("step", resep.step)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_page -> {
                val intent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}