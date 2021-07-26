package com.rifqiananda.tokobuah.content

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.rifqiananda.tokobuah.bottomnavbar.Buah
import com.rifqiananda.tokobuah.R
import com.rifqiananda.tokobuah.bottomnavbar.fragments.HomeFragment
import com.rifqiananda.tokobuah.content.fragment.FragmentManfaat

class ManfaatBuah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manfaat_buah)

        val manfaatFragment = FragmentManfaat()

        makeCurrentFragment(manfaatFragment)

    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, fragment)
            commit()
        }
}