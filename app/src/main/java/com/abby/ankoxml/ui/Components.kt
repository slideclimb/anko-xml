package com.abby.ankoxml.ui

import android.view.Gravity
import android.view.View
import android.view.ViewManager
import org.jetbrains.anko.*

/**
 * Binary switch that has text on the left and on the right. Toasts the left
 * text when swiping left, and the right text when swiping right.
 *
 * @param leftText Left text of the switch.
 * @param rightText Right text of the switch.
 */
fun ViewManager.binarySwitch(leftText: String, rightText: String) {
    tableRow {
        textView {
            hint = leftText
            textAlignment = View.TEXT_ALIGNMENT_CENTER
        }.lparams(height = wrapContent, width = 0, initWeight = 1f)

        linearLayout{
            gravity = Gravity.CENTER
            switch {
                setOnCheckedChangeListener { buttonView, isChecked ->
                    if (isChecked) buttonView.context.toast("Selected ${rightText}.")
                    else buttonView.context.toast("Selected ${leftText}.")
                }
            }
        }.lparams(height = wrapContent, width = 0, initWeight = 1f)

        textView {
            hint = rightText
            textAlignment = View.TEXT_ALIGNMENT_CENTER
        }.lparams(height = wrapContent, width = 0, initWeight = 1f)
    }
}

/**
 * Table row with a number of text cells.
 *
 * @param texts The tetxs to be displayed in the table row.
 * @param alignment The alignment of the texts in their table cell. Centered by default.
 */
fun ViewManager.textRow(vararg texts: String, alignment: Int = View.TEXT_ALIGNMENT_CENTER) {
    tableRow {
        texts.map {
            textView {
                hint = it
                textAlignment = alignment
            }.lparams(height = wrapContent, width = 0, initWeight = 1f)
        }
    }
}