package com.mlhysrszn.periodictable

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mlhysrszn.periodictable.adapter.ElementAdapter
import com.mlhysrszn.periodictable.databinding.ActivityMainBinding
import com.mlhysrszn.periodictable.databinding.DialogElementBinding
import com.mlhysrszn.periodictable.model.Element
import com.mlhysrszn.periodictable.util.Utils

class MainActivity : AppCompatActivity(), ElementAdapter.ElementOnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val elementAdapter = ElementAdapter(Utils.getDummyData(), this)
        val rv = binding.rvPeriodicTable
        rv.adapter = elementAdapter
        rv.recycledViewPool.setMaxRecycledViews(1, 0) // RecyclerView gorunumlerin kaybolmamasi icin
    }

    override fun onClick(element: Element) {
        val binding: DialogElementBinding = DialogElementBinding.inflate(LayoutInflater.from(applicationContext))
        val alertDialogBuilder = AlertDialog.Builder(this)
        binding.element = element
        alertDialogBuilder.setView(binding.root)
        alertDialogBuilder.show()
    }
}