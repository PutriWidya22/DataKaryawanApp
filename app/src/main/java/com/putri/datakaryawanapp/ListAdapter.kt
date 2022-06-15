package com.putri.datakaryawanapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// membuat class ListAdapter
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    // deklarasi variabael listener
    private lateinit var listener: (name: String) -> Unit

    // deklarasi variabel contacList dengan sistem array dan memuat nama-nama karyawan.
    val contactList = listOf(
        "Hendra Kurnia",
        "Rahardian",
        "Reza Pamungkas",
        "Rian Arlando",
        "Bambang Setyawan",
        "Priyanto",
        "Wahyu Attalya",
        "Gilang Hermawan",
        "Farhan Fatya As-sidiq",
    )

    // memuat layout karyawan_list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.karyawan_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameText.text = contactList[position]
        holder.itemView.setOnClickListener {
            listener(contactList[position])
        }
    }

    // mengambil data contacList
    override fun getItemCount(): Int = contactList.size

    // memuat recyclerView yang akan digunakan untuk menampilkan data image dan nama textnya
    // dengan menyisipkan id image dan nameText.
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image)
        var nameText: TextView = itemView.findViewById(R.id.nameText)
    }

    // membuat function setClickListener
    fun setClickListener(function: (name: String) -> Unit) {
        this.listener = function
    }
}
