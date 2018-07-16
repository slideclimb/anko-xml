package com.abby.ankoxml

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.abby.ankoxml.ui.TableAnkoUI
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class TableAnkoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TableAnkoUI().setContentView(this)
    }

    /**
     * Create the menu from xml (does not exist an Anko DSL for this yet :/)
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.table_anko_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**
     * Set click listener for the menu.
     */
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.switch_to_table_xml -> {
                startActivity<TableXMLActivity>()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}