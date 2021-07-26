package com.rifqiananda.tokobuah.content

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.rifqiananda.tokobuah.R
import com.rifqiananda.tokobuah.bottomnavbar.Buah
import java.util.ArrayList

class ContentAdapter(var mContext: Context, private var data: ArrayList<InformasiBuah>): RecyclerView.Adapter<ContentAdapter.InformasiViewHolder>()
{

    private var image1 : ImageView? = null
    private var image2 : ImageView? = null
    private var txtName1 : TextView? = null
    private var txtName2 : TextView? = null
    private var txtDetail1 : TextView? = null
    private var txtDetail2 : TextView? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentAdapter.InformasiViewHolder {
        return InformasiViewHolder(LayoutInflater.from(mContext).inflate(R.layout.recycler_view_template_2, parent, false))
    }

    override fun onBindViewHolder(holder: ContentAdapter.InformasiViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class InformasiViewHolder(item: View): RecyclerView.ViewHolder(item)
    {

        private val cardContainer1 : RelativeLayout = itemView.findViewById(R.id.menu_color_card1)
        private val cardContainer2 : RelativeLayout = itemView.findViewById(R.id.menu_color_card2)

        private fun setBackgroundDrawableColor1(colorId: Int){
            val drawable : Drawable = cardContainer1.background
            // idk why, but from my perspective, it should be a ShapeDrawable.
            // but android detects it as GradientDrawable
            if(drawable is GradientDrawable){
                drawable.setColor(colorId)
            }
        }

        private fun setBackgroundDrawableInColor2(colorId: Int){
            val drawable = cardContainer2.background
            if(drawable is GradientDrawable){
                drawable.setColor(colorId)
            }
        }

        fun bind(data: InformasiBuah)
        {

            setBackgroundDrawableColor1(ContextCompat.getColor(mContext, data.color1))
            setBackgroundDrawableInColor2(ContextCompat.getColor(mContext, data.color2))

           image1 = itemView.findViewById(R.id.iv_satu)
            image2 = itemView.findViewById(R.id.iv_dua)
            txtName1 = itemView.findViewById(R.id.tv_satu)
            txtName2 = itemView.findViewById(R.id.tv_dua)
            txtDetail1 = itemView.findViewById(R.id.tv_desc_satu)
            txtDetail2 = itemView.findViewById(R.id.tv_desc_dua)

            image1?.setImageResource(data.imgView1)
            image2?.setImageResource(data.imgView2)
            txtName1?.text = data.txtName1
            txtName2?.text = data.txtName2
            txtDetail1?.text = data.txtDesc1
            txtDetail2?.text = data.txtDesc2
        }
    }

}

