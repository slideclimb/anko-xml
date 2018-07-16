package com.abby.ankoxml.ui

import android.view.View
import com.abby.ankoxml.TableAnkoActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.padding
import org.jetbrains.anko.tableLayout


class TableAnkoUI : AnkoComponent<TableAnkoActivity> {
    override fun createView(ui: AnkoContext<TableAnkoActivity>) = with(ui) {
        tableLayout {

            padding = 16

            textRow("one", "two", alignment = View.TEXT_ALIGNMENT_VIEW_START)
            textRow("one", "two")
            textRow("one", "two", "three")
            textRow("one", "two", "three", "four")

            binarySwitch("one", "two")
        }
    }

}