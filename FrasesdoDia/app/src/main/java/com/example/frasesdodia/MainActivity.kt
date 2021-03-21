package com.example.frasesdodia

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.example.frasesdodia.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val frases = arrayOf(
            "Teste 1",
            "Teste 2",
            "Teste 3"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button.setOnClickListener {
            gerarFrase()
        }
    }

    fun gerarFrase() {
        // val totalItensArray = frases.size
        //val numeroAleatorio = Random().nextInt(frases.size)

        binding.textoFrase.setText(frases[Random().nextInt(frases.size)])
    }
}