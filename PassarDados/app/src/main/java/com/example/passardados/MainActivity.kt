package com.example.passardados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passardados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonPassarDados.setOnClickListener {
            val intent = Intent(applicationContext, SegundaTelaActivity::class.java)
            //PASSAR DADOS
            intent.putExtra("nome", "Um numero foi passado de uma tela para a outra, e esse número foi :")
            intent.putExtra("idade", 30)
            // não era pra fazer sentido
            //só pra treino e aprendizado mesmo :>
            startActivity(intent)
        }
    }
}