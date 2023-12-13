package com.example.pizzaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AddMenuActivity : AppCompatActivity() {
    lateinit var image : ImageView
    companion object{
        val IMAGE_REQUEST_CODE =100
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_menu)

        //hide title bar
        getSupportActionBar()?.hide()

        //instance
        image = findViewById(R.id.imageMenu)
        val textId :EditText = findViewById(R.id.menuId)
        val textName :EditText=findViewById(R.id.menuName)
        val textPrice : EditText=findViewById(R.id.menuPrice)
        val btnAddImage : Button = findViewById(R.id.buttonAddImage)
        val btnSaveMenu: Button = findViewById(R.id.buttonSaveMenu)

        //event saat bitton add (+) di_klik
        btnAddImage.setOnClickListener{
            pickImageGalery()
        }
    }

    private fun pickImageGalery() {
        TODO("Not yet implemented")
    }


}