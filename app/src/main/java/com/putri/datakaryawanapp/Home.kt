package com.putri.datakaryawanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

// membuat class DataKaryawan memuat bundle untuk format semua source kode pada aplikasi.
class Home : AppCompatActivity(), View.OnClickListener {

    // deklarasi  variabel perusahaan, tambah, dan data yaitu sebagai button.
    private lateinit var perusahaan: Button
    private lateinit var tambah: Button
    private lateinit var data: Button

    // memuat layout activity_home
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Judul Halaman
        title = "Home"

        // variabel perusahaan memuat button dengan id "btnInfromasiPerusahaan" yang berada
        // di activity_home
        perusahaan = findViewById(R.id.btnInfromasiPerusahaan)
        perusahaan.setOnClickListener(this)


        // variabel perusahaan memuat button dengan id "bbtnTambahKaryawan" yang berada
        // di activity_home
        tambah = findViewById(R.id.btnTambahKaryawan)
        tambah.setOnClickListener(this)

        // variabel perusahaan memuat button dengan id "btnDataKaryawan" yang berada
        // di activity_home
        data = findViewById(R.id.btnDataKaryawan)
        data.setOnClickListener(this)
    }

    // membuat fungsi onClick dan intent yang nantinya jika di klik maka akan berpindah ke halaman
    // InformasiPerusahaan, lalu disusul dengan perintah startActivity yang artinya memulai activity
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnInfromasiPerusahaan -> {
                val intentPerusahaan = Intent(this@Home, InformasiPerusahaan::class.java)
                startActivity(intentPerusahaan)
            }
        }

        // ketika yang di klik adalah button "btnTambahKaryawan" maka akan beralih ke halaman
        // AddKaryawanCoba
        when (v.id) {
            R.id.btnTambahKaryawan -> {
                val intentTambah = Intent(this@Home, AddKaryawanCoba::class.java)
                startActivity(intentTambah)
            }
        }

        // ketika yang di klik adalah button "btnDataKaryawan" maka akan beralih ke halaman
        // DataKaryawan
        when (v.id) {
            R.id.btnDataKaryawan -> {
                val intentData = Intent(this@Home, DataKaryawan::class.java)
                startActivity(intentData)
            }
        }
    }
}