package com.putri.datakaryawanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// membuat class InformasiPerusahaan memuat bundle untuk format semua source kode pada aplikasi.
class InformasiPerusahaan : AppCompatActivity() {

    // memuat layout activity_informasi_perusahaan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_perusahaan)

        // Judul Halaman
        title = "Informasi Perusahaan"
    }
}