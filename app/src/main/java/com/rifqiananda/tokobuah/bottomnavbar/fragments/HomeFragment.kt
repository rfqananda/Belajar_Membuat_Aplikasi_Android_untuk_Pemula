package com.rifqiananda.tokobuah.bottomnavbar.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.rifqiananda.tokobuah.bottomnavbar.MenuAdapter
import com.rifqiananda.tokobuah.bottomnavbar.Buah
import com.rifqiananda.tokobuah.R
import com.rifqiananda.tokobuah.content.ManfaatBuah
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    lateinit var adapterBuah : MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(itemView, savedInstanceState)
        recycler_view.apply{

            var data = ArrayList<Buah>()

            data.add(
                Buah(
                R.drawable.dragon_fruit_cover,
                txtName = "Pitaya",
                txtPrice = "Rp12.000,00",
                color = R.color.red_dragon,
                txtDesc = "Buah naga (Inggris: Pitaya) adalah buah dari beberapa jenis kaktus dari marga Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti Taiwan, Vietnam, Filipina, Indonesia dan Malaysia. "
                        + "Buah ini juga dapat ditemui di Okinawa, Israel, Australia utara dan Tiongkok selatan. Kami menyediakan buah Naga (Pitaya) berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )

            data.add(
                Buah(
                R.drawable.apple_cover,
                txtName = "Apel",
                txtPrice = "Rp10.000,00",
                color = R.color.red_apple,
                txtDesc = "Apel adalah jenis buah-buahan yang satu family dengan keluarga mawar (rosaceae). Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan). " +
                        "Kami menyediakan buah Apel berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )

            data.add(
                Buah(
                R.drawable.pineapple_cover,
                txtName = "Nanas",
                txtPrice = "Rp15.000,00",
                color = R.color.orange_pinapple,
                txtDesc = "Nanas (Ananas comosus) adalah buah tropis yang sangat lezat dan sehat. Buah nanas dapat memiliki berat hingga delapan kilogram dan memiliki rasa yang manis dan asam, serta mengandung pektin seperti serat yang memberikan tekstur kenyal pada buah. " +
                        "Kami menyediakan buah Nanas berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )
            data.add(Buah(
                R.drawable.orange_cover,
                txtName = "Jeruk",
                txtPrice = "Rp7.000,00",
                color = R.color.orange_orange,
                txtDesc = "Jeruk (Citrus sinensis) adalah salah satu buah berwarna yang cukup populer berkat rasa manis alaminya. Buah ini juga memiliki berbagai jenis dengan manfaat yang berbeda-beda. " +
                        "Kami menyediakan buah Jeruk berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi."))
            data.add(
                Buah(
                R.drawable.banana_cover,
                txtName = "Pisang",
                txtPrice = "Rp9.000,00",
                color = R.color.yellow_banana,
                txtDesc = "Pisang adalah buah yang dikenal luas di Indonesia. Buah pisang bisa dinikmati dengan berbagai cara: dimakan langsung, digoreng, dikukus, atau diolah bersama bahan lain. Tapi pisang tidak hanya enak, manfaatnya banyak. " +
                        "Kami menyediakan buah Pisang berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )
            data.add(
                Buah(
                R.drawable.star_fruit_cover,
                txtName = "Belimbing",
                txtPrice = "Rp9.500,00",
                color = R.color.yellow_star,
                txtDesc = "Belimbing atau Averrhoa carambola adalah buah yang populer di negara beriklim tropis. Belimbing dikenal dengan rasa asam manisnya yang khas dan menyegarkan. " +
                        "Kami menyediakan buah Belimbing berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )
            data.add(Buah(
                R.drawable.avocado_cover,
                txtName = "Alpukat",
                txtPrice = "Rp13.000,00",
                color = R.color.green_avocado,
                txtDesc = "Alpukat (Avocado) merupakan jenis buah yang memiliki kandungan lemak tinggi, sekitar 20 kali lebih tinggi dibanding buah-buahan lain. Nama latin tanaman alpukat adalah Persea americana, diyakini berasal dari Amerika Tengah. " +
                        "Kami menyediakan buah Alpukat berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi."))
            data.add(
                Buah(
                R.drawable.watermelons_cover,
                txtName = "Semangka",
                txtPrice = "Rp15.000,00",
                color = R.color.green_wm,
                txtDesc = "Semangka (Citrullus lanatus) adalah buah yang berasal dari Afrika Selatan dan kini sudah bisa dijumpai di seluruh dunia. Buah dengan kulit berwarna hijau ini memiliki bagian dalam yang berwarna merah atau merah jambu dengan biji yang banyak. " +
                        "Kami menyediakan buah Semangka berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )
            data.add(Buah(
                R.drawable.blueberry_cover,
                txtName = "Bluberi",
                txtPrice = "Rp2.000,00",
                color = R.color.blue_blueberry,
                txtDesc = "Bluberi atau blueberry merupakan tanaman buah yang berasal dari Amerika Utara. Saat ini, blueberry bisa didapatkan di mana saja, termasuk Indonesia. Sesuai dengan namanya, blueberry berwarna biru, dan bentuknya bulat dengan ukuran yang kecil. " +
                        "Kami menyediakan buah Bluberi berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi.")
            )

            data.add(Buah(
                R.drawable.grape_cover,
                txtName = "Anggur",
                txtPrice = "Rp1.000,00",
                color = R.color.pruple_grape,
                txtDesc = "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae. Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung. " +
                        "Kami menyediakan buah Bluberi berkualitas tinggi kepada konsumen agar manfaatnya bisa langsung terasa saat dikonsumsi."))

            adapterBuah = MenuAdapter(context, data)
            recycler_view.layoutManager = LinearLayoutManager(context)
            recycler_view.adapter = adapterBuah


        }

        btn_read.setOnClickListener {
            val intent = Intent (context, ManfaatBuah::class.java)
            startActivity(intent)
        }

    }

}