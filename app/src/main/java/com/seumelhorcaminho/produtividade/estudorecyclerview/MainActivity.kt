package com.seumelhorcaminho.produtividade.estudorecyclerview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.seumelhorcaminho.produtividade.estudorecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var listAdapter: ListAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSearch.setOnClickListener(this)
        binding.btnEdit.setOnClickListener(this)
        binding.btnDelete.setOnClickListener(this)
        binding.btnShare.setOnClickListener(this)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        listAdapter = ListAdapter(itemList)
        recyclerView.adapter = listAdapter
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnSearch -> toast("Pesquisar")
            R.id.btnEdit -> toast("Editar")
            R.id.btnDelete -> toast("Excluir")
            R.id.btnShare -> toast("Compartilhar")
        }
    }

    inline fun Context.toast(message:String){
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show()
    }


}

