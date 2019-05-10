package com.example.fragment


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    var java = 0
    var network = 0
    var database = 0

    var total = 0
    var ave = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttonTotal.setOnClickListener {
            java = editTextJava.text.toString().toInt()
            network = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            total = java + network + database
            textViewTotal.text = total.toString()
        }
        buttonAvarage.setOnClickListener {
            java = editTextJava.text.toString().toInt()
            network = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            ave = total/3
            textViewAve.text = ave.toString()


        go_back_btn.setOnClickListener {
            finish()
        }
    }
}
