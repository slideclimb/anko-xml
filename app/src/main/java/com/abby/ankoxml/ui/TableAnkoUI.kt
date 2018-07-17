package com.abby.ankoxml.ui

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.abby.ankoxml.R
import com.abby.ankoxml.TableAnkoActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onItemSelectedListener

class TableAnkoUI : AnkoComponent<TableAnkoActivity> {
    override fun createView(ui: AnkoContext<TableAnkoActivity>) = with(ui) {
        tableLayout {

            padding = 16

            textRow("From", "To", alignment = View.TEXT_ALIGNMENT_VIEW_START)

            binarySwitch("Single", "Plural")
            binarySwitch("Dutch", "English")
            binarySwitch("Words", "Numbers")

            val spinnerItems = arrayOf("one", "two", "three")
            val spinnerItemSelected: (Int) -> Unit = {position ->
                context.toast("${spinnerItems[position]} selected.")
            }
            spinnerWithListener(items = spinnerItems, onItemSelected = spinnerItemSelected)

        }
    }

}