package com.rifqiananda.tokobuah.bottomnavbar

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.rifqiananda.tokobuah.R
import java.util.ArrayList

class MenuAdapter(private val context: Context, private val data: ArrayList<Buah>): RecyclerView.Adapter<MenuAdapter.BuahViewHolder>(){

    private var imgView : ImageView? = null
    private var txtName : TextView? = null
    private var txtPrice : TextView? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahViewHolder {
        return BuahViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_template, parent, false))
    }

    override fun onBindViewHolder(holder: BuahViewHolder, position: Int) {
        holder.bind(data[position])

    }

    override fun getItemCount(): Int {
        return data.size
    }



    inner class BuahViewHolder(item: View): RecyclerView.ViewHolder(item){

        private val btnDetail : ImageView = item.findViewById(R.id.btn_detail)

        private val cardContainer : RelativeLayout = itemView.findViewById(R.id.color_card1)
        private val cardPriceContainer : RelativeLayout = itemView.findViewById(R.id.color_card2)

        private fun setBackgroundDrawableColor(colorId: Int){
            val drawable : Drawable = cardContainer.background
            // idk why, but from my perspective, it should be a ShapeDrawable.
            // but android detects it as GradientDrawable
            if(drawable is GradientDrawable){
                drawable.setColor(colorId)
            }
        }

        private fun setBackgroundDrawableInPriceColor(colorId: Int){
            val drawable = cardPriceContainer.background
            if(drawable is GradientDrawable){
                drawable.setColor(colorId)
            }
        }

        fun bind(data: Buah)
        {

            setBackgroundDrawableInPriceColor(ContextCompat.getColor(context, data.color))
            setBackgroundDrawableColor(ContextCompat.getColor(context, data.color))

            imgView = itemView.findViewById(R.id.image_view)
            txtName = itemView.findViewById(R.id.txt_name)
            txtPrice = itemView.findViewById(R.id.txt_price)

            imgView?.setImageResource(data.imgView)
            txtName?.text = data.txtName
            txtPrice?.text = data.txtPrice

            btnDetail.setOnClickListener {
                val model = data
                val gName : String = model.txtName
                val gPrice : String = model.txtPrice
                val gDesc : String = model.txtDesc
                val gColor : Int = model.color
                val gImageView : Int = model.imgView

                val intent = Intent(context, DetailBuah::class.java)
                intent.putExtra("iImageView", gImageView)
                intent.putExtra("iName", gName)
                intent.putExtra("iPrice", gPrice)
                intent.putExtra("iDesc", gDesc)
                intent.putExtra("iColor", gColor)
                context.startActivity(intent)
            }
        }
    }
}