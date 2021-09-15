package com.mlhysrszn.periodictable.util

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter

@BindingAdapter("backgroundColor")
fun CardView.setBackground(color: Int?) {
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