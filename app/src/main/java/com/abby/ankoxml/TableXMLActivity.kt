package com.abby.ankoxml

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_table_xml.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class TableXMLActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_xml)

        // Set listener on the switch. Note that the switch needs an id to be able to access it.
        xml_one_two_switch.setOnCheckedChangeListener {
            buttonView, isChecked ->
            if (isChecked) buttonView.context.toast("Selected ${left_text.text}.")
            else buttonView.context.toast("Selected ${right_text.text}.")
        }

        val items = arrayOf("one", "two", "three")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items)
        xml_from_spinner.adapter = adapter

        xml_from_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                toast("Selected $p2.")
            }
        }
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
