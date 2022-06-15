package com.putri.datakaryawanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// membuat class DataKaryawan memuat bundle untuk format semua source kode pada aplikasi.
class DataKaryawan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_karyawan)

        // Judul Halaman
        title = "Data Karyawan"

        // deklarasi myRecyclerView
        val myRecyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        myRecyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        // deklarasi adapter, yang akan menampilkan data nama-nama dari listAdapter
        var adapter = ListAdapter()
        adapter.setClickListener{ name->
                Toast.makeText(this, "$name Clicked", Toast.LENGTH_SHORT).show()
        }
        myRecyclerView.adapter = adapter

    }

}