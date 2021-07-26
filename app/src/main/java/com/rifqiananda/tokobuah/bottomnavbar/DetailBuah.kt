package com.rifqiananda.tokobuah.bottomnavbar

import android.content.Intent
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.content.ContextCompat
import com.rifqiananda.tokobuah.MainActivity
import com.rifqiananda.tokobuah.R
import kotlinx.android.synthetic.main.activity_detail_buah.*
import kotlinx.android.synthetic.main.activity_manfaat_buah.*

class DetailBuah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buah)

        val actionBar : ActionBar? = supportActionBar

        val intent = intent
        val aImage = intent.getIntExtra("iImageView", 0)
        val aName = intent.getStringExtra("iName")
        val aPrice = intent.getStringExtra("iPrice")
        val aColor = intent.getIntExtra("iColor", 0)
        val aDesc = intent.getStringExtra("iDesc")

        actionBar?.title = aName
        tv_name_detail.text = aName
        tv_price_detail.text = aPrice
        tv_desc_detail.text = aDesc
        layout_details.setBackgroundResource(aColor)
        iv_detail.setImageResource(aImage)

        val drawable : Drawable = btn_bottom_nav.background
        if (drawable is GradientDrawable)
        {
            drawable.setColor(ContextCompat.getColor(this, aColor))
        }

        btn_bottom_nav.setOnClickListener {
            val toast = Toast.makeText(this, "Berhasil dibeli", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            toast.show()
        }

        btn_back.setOnClickListener {
            val int = Intent(this, MainActivity::class.java)
            startActivity(int)
        }

        val drawable2 : Drawable = card_rating.background
        if (drawable2 is GradientDrawable)
        {
            drawable2.setColor(ContextCompat.getColor(this, aColor))
        }


        iv_rate1.setColorFilter(ContextCompat.getColor(this, aColor))
        iv_rate2.setColorFilter(ContextCompat.getColor(this, aColor))
        iv_rate3.setColorFilter(ContextCompat.getColor(this, aColor))
        iv_rate4.setColorFilter(ContextCompat.getColor(this, aColor))
        iv_rate5.setColorFilter(ContextCompat.getColor(this, aColor))
    }
}