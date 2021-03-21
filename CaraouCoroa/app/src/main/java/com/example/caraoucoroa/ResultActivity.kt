package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caraoucoroa.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if(numero==0){
            binding.imageResult.setImageResource(R.drawable.moeda_cara)
        }
        else{
            binding.imageResult.setImageResource(R.drawable.moeda_coroa)
        }

        binding.buttonBack.setOnClickListener {
            finish()
        }

    }
}