package com.example.pizzaapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.ColorSpace.Model
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaapp.model.MenuModel


class MenuAdapter(private val list: ArrayList<MenuModel>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {

        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.cardview_menu, parent, false)

        return MenuViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        holder.bind(list[position])

    }

    inner class MenuViewHolder(v:View):RecyclerView.ViewHolder(v) {


        val textId : TextView
        val textNama: TextView
        val textHarga : TextView
        val imageMenu : ImageView
        val buttonShop : Button
        val context = v.context

        init {
            textId = v.findViewById(R.id.textIdMenu)
            textNama = v.findViewById(R.id.textNamaMenu)
            textHarga = v.findViewById(R.id.textHargaMenu)
            imageMenu = v.findViewById(R.id.imageMenu)
            buttonShop = v.findViewById(R.id.buttonTambah)

        }

        fun bind(data: MenuModel){
            val id:Int = data.id
            val nama:String = data.name
            val harga:Int = data.price
            val gambar: Bitmap = data.image

            textId.text = id.toString()
            textNama.text = nama
            textHarga.text = harga.toString()
            imageMenu.setImageBitmap(gambar)
        }
    }
}
