package com.ivandriancode.volumebalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var panjang: String
    private lateinit var lebar: String
    private lateinit var tinggi: String
    private lateinit var hasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClick(view: View) {
        panjang = findViewById<EditText>(R.id.teksPanjang).text.toString() // ambil nilai dalam String
        lebar = findViewById<EditText>(R.id.teksLebar).text.toString() // ambil nilai dalam String
        tinggi = findViewById<EditText>(R.id.teksTinggi).text.toString() // ambil nilai dalam String
        if (panjang.isNotEmpty() and lebar.isNotEmpty() and tinggi.isNotEmpty()) { // hitung kalo ada isinya aja
            val nilai = panjang.toInt() * lebar.toInt() * tinggi.toInt() // kalikan nilai dalam bentuk Int
            hasil = findViewById<TextView>(R.id.nilaiHasil) // simpan bagian teks view-nya dalam variabel
            hasil.setText("%d".format(nilai)) // tampilin deh hasilnya
//            hasil.setText("%d m\u00B3".format(nilai)) -> tampilin nilai m^3
        }
    }
}