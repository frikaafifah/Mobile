package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var inputPanjang: EditText
    private lateinit var inputLebar: EditText
    private lateinit var inputTinggi: EditText
    private lateinit var button: Button
    private lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputPanjang=findViewById(R.id.input_panjang)
        inputLebar=findViewById(R.id.input_lebar)
        inputTinggi=findViewById(R.id.input_tinggi)
        button=findViewById(R.id.btn)
        result=findViewById(R.id.result)

        button.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
        if(v?.id == R.id.btn){
            var panjang = inputPanjang.text.toString().trim()
            var lebar = inputLebar.text.toString().trim()
            var tinggi = inputTinggi.text.toString().trim()
            val volume = panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()
            result.text = volume.toString()

        }
    }


}