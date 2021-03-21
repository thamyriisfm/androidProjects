package com.example.passardados

import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passardados.databinding.ActivityMainBinding
import com.example.passardados.databinding.ActivitySegundaTelaBinding

class SegundaTelaActivity : AppCompatActivity() {

    lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dados: Bundle? = intent.extras
        val nome = dados?.getString("nome")
        val idade = dados?.getInt("idade")


        binding.textViewName.text = nome
        binding.textViewAge.text = idade.toString()

    }
}