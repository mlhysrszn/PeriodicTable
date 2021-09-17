package com.mlhysrszn.periodictable.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mlhysrszn.periodictable.databinding.ElementItemBinding
import com.mlhysrszn.periodictable.databinding.NumberItemBinding
import com.mlhysrszn.periodictable.model.Element
import com.mlhysrszn.periodictable.model.Number

abstract class BaseViewHolder<T>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T, elementOnClick: ElementAdapter.ElementOnClickListener)
}

class NumberViewHolder(private val binding: NumberItemBinding) :
    BaseViewHolder<Number>(binding.root) {
    override fun bind(item: Number, elementOnClick: ElementAdapter.ElementOnClickListener) {
        binding.number = item.number.toString()
    }
}

class ElementViewHolder(private val binding: ElementItemBinding) :
    BaseViewHolder<Element>(binding.root) {
    override fun bind(item: Element, elementOnClick: ElementAdapter.ElementOnClickListener) {
        binding.element = item

        binding.root.setOnClickListener {
            elementOnClick.onClick(item)
        }
    }
}