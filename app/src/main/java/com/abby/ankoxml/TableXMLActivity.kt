package com.abby.ankoxml

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import org.jetbrains.anko.startActivity

class TableXMLActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_xml)
    }

    /**
     * Create a custom menu from xml.
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.table_xml_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**
     * Set click listener for the menu.
     */
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.switch_to_table_anko -> {
                startActivity<TableAnkoActivity>()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}
