package com.mlhysrszn.periodictable.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mlhysrszn.periodictable.databinding.ElementItemBinding
import com.mlhysrszn.periodictable.databinding.NumberItemBinding
import com.mlhysrszn.periodictable.model.Element
import com.mlhysrszn.periodictable.model.Number

class ElementAdapter(
    private val itemList: List<Any>,
    private val elementOnClickListener: ElementOnClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    companion object {
        private const val TYPE_NUMBER = 0
        private const val TYPE_ELEMENT = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return when (viewType) {
            TYPE_NUMBER -> {
                val binding =
                    NumberItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                NumberViewHolder(binding)
            }
            TYPE_ELEMENT -> {
                val binding =
                    ElementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ElementViewHolder(binding)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        val item = itemList[position]

        when (holder) {
            is NumberViewHolder -> holder.bind(item as Number, elementOnClickListener)
            is ElementViewHolder -> holder.bind(item as Element, elementOnClickListener)
            else -> throw IllegalArgumentException("Invalid type of ViewHolder")
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemList[position]) {
            is Number -> TYPE_NUMBER
            is Element -> TYPE_ELEMENT
            else -> throw IllegalArgumentException("Invalid type of data $position")
        }
    }

    interface ElementOnClickListener {
        fun onClick(element: Element)
    }
}