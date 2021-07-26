package com.rifqiananda.tokobuah.content.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.rifqiananda.tokobuah.MainActivity
import com.rifqiananda.tokobuah.R
import com.rifqiananda.tokobuah.bottomnavbar.MenuAdapter
import com.rifqiananda.tokobuah.content.InformasiBuah
import com.rifqiananda.tokobuah.content.ContentAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_manfaat.*

class FragmentManfaat : Fragment() {

    lateinit var adapterInfo : ContentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manfaat, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(itemView, savedInstanceState)
        recycler_view2.apply{

            val list = ArrayList<InformasiBuah>()

            list.add(InformasiBuah
                    (R.drawable.apple_cover,
                     R.drawable.avocado_cover,
                    "Apel",
                    "Alpukat",
                    "Apel kaya dengan antioksidan quercetin dan polifenol. Maka dari itu, apel bermanfaat untuk mencegah kerusakan sel akibat radikal bebas.",
                    "Alpukat kaya akan kalium. Mineral ini bermanfaat untuk mengontrol tekanan darah dan mencegah tekanan darah tinggi (hipertensi)",
                    color1 = R.color.red_apple,
                    color2 = R.color.green_avocado)
            )

            list.add(InformasiBuah
                    (R.drawable.dragon_fruit_cover,
                     R.drawable.banana_cover,
                    "Pitaya",
                    "Pisang",
                    "Buah naga mengandung beberapa jenis antioksidan yang ampuh melawan radikal bebas, seperti vitamin C, betalains, dan karotenoid.",
                    "Kalium yang terkandung dalam buah pisang dapat membantu mengatur keseimbangan cairan dan elektrolit sehingga tekanan darah tetap stabil",
                     color1 = R.color.red_dragon,
                     color2 = R.color.yellow_banana)
            )

            list.add(InformasiBuah
                    (R.drawable.watermelons_cover,
                     R.drawable.star_fruit_cover,
                    "Semangka",
                    "Belimbing",
                    "Kandungan antioksidan dalam semangka membantu memerangi stres oksidatif akibat ketidakseimbangan produksi radikal bebas dalam tubuh",
                    "Belimbing memiliki kandungan antioksidan yang dapat menangkal radikal bebas serta mengurangi risiko peradangan pada kulit.",
                     color1 = R.color.green_wm,
                     color2 = R.color.yellow_star)
            )

            list.add(InformasiBuah
                    (R.drawable.blueberry_cover,
                     R.drawable.orange_cover,
                    "Bluberi",
                    "Jeruk",
                    "Vitamin C pada blueberry juga dapat berfungsi sebagai antioksidan yang bermanfaat untuk mempercepat proses penyembuhan luka",
                    "Buah yang kaya vitamin C ini mengandung beta-karoten, antioksidan yang bisa melindungi sel-sel kulit dari kerusakan.",
                     color1 = R.color.blue_blueberry,
                     color2 = R.color.orange_orange)
            )

            list.add(InformasiBuah
                    (R.drawable.grape_cover,
                     R.drawable.pineapple_cover,
                    "Anggur",
                    "Nanas",
                    "Buah anggur mengandung lutein dan zeaxanthin, dua karotenoid dengan sifat antioksidan yang penting bagi kesehatan mata.",
                    "Nanas mengandung enzim pencernaan yang disebut bromelain. Bromelain berfungsi untuk melancarkan pencernaan.",
                     color1 = R.color.pruple_grape,
                     color2 = R.color.orange_pinapple)
            )

            adapterInfo = ContentAdapter(context, list)
            recycler_view2.layoutManager = LinearLayoutManager(context)
            recycler_view2.adapter = adapterInfo
        }

        btn_back_read.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)

        }
    }

}