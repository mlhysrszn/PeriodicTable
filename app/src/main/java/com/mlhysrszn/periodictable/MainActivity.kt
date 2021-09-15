package com.mlhysrszn.periodictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mlhysrszn.periodictable.adapter.ElementAdapter
import com.mlhysrszn.periodictable.databinding.ActivityMainBinding
import com.mlhysrszn.periodictable.util.Utils

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val elementAdapter = ElementAdapter(Utils.list)
        val rv = binding.rvPeriodicTable
        rv.adapter = elementAdapter
        rv.recycledViewPool.setMaxRecycledViews(1, 0) // RecyclerView gorunumlerin kaybolmamasi icin
    }
}