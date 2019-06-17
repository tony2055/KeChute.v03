package br.com.antoniorm80282.kechute

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //val myStrings = arrayOf("Mago", "Bárbaro", "Guerreiro")
      //  mySpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, myStrings)
       // mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
       //     override fun onNothingSelected(p0: AdapterView<*>?) {
       //         TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
       //     }

        //    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, myStrings[p2], LENGTH_LONG).show()
         //   }

        //}
    }
}
