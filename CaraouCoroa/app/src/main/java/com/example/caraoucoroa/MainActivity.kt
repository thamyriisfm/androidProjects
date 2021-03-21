package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caraoucoroa.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonPlay.setOnClickListener {
            var intent = Intent(applicationContext, ResultActivity::class.java)
            //Gerar numero aleatorio
            val numero = java.util.Random().nextInt(2)
            //Enviar numero
            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}