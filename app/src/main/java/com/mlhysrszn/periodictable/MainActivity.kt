package com.mlhysrszn.periodictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mlhysrszn.periodictable.databinding.ActivityMainBinding
import com.mlhysrszn.periodictable.model.Element

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val element = Element(6, "C", "Carbon", 12.011f, "[He] 2s2 2p2", R.color.black, "Img")
//        val emptyElement = Element()
    }
}