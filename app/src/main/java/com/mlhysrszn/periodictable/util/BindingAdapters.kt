package com.mlhysrszn.periodictable.util

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter
import com.mlhysrszn.periodictable.R

@BindingAdapter("backgroundColor")
fun View.setBackground(color: Int?) {
    if (color == null) {
        visibility = View.INVISIBLE
    } else {
        setBackgroundResource(color)
    }
}

@BindingAdapter("text")
fun setText(view: TextView, text: Int?) {
    if (text == null) {
        view.text = ""
    } else {
        view.text = text.toString()
    }
}

@BindingAdapter("textWeight")
fun TextView.setTextWeight(value: Float?) {
    val string = value.toString()
    text = resources.getString(R.string.atomic_weight, string)
}

@BindingAdapter("dialogBackground")
fun View.setBackgroundColor(color: Int?) {
    if (color != null) {
        setBackgroundResource(color)
    }
}