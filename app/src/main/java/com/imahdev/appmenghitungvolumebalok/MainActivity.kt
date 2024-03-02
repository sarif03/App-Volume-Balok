package com.imahdev.appmenghitungvolumebalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // mendefinisikan variable yg akan dipakai
    private lateinit var edtPanjang: EditText
    private lateinit var edtLebar: EditText
    private lateinit var edtTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi komponen View agar terhubung dgn variable yg telah dibuat
        edtPanjang = findViewById(R.id.edt_panjang)
        edtLebar = findViewById(R.id.edt_lebar)
        edtTinggi = findViewById(R.id.edt_tinggi)
        tvHasil = findViewById(R.id.tv_hasil)
        btnHitung = findViewById(R.id.btn_hitung)

        // membuat action klik pada button
        btnHitung.setOnClickListener {

            //mengubah typeData dari type Komponen ke String()
            val inputPanjang = edtPanjang.text.toString().trim()
            val inputLebar = edtLebar.text.toString().trim()
            val inputTinggi = edtTinggi.text.toString().trim()
            var isEmptyFields = false

            //validasi field
            if (inputPanjang.isEmpty()) {
                isEmptyFields = true
                edtPanjang.error = "Field ini tidak boleh kosong"
            }
            if (inputLebar.isEmpty()) {
                isEmptyFields = true
                edtLebar.error = "Field ini tidak boleh kosong"
            }

            if (inputTinggi.isEmpty()) {
                isEmptyFields =true
                edtTinggi.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                // konversi dari type Data
                val volume = inputPanjang.toDouble() * inputLebar.toDouble() * inputTinggi.toDouble()
                tvHasil.text= volume.toString()
            }
        }
    }
}