package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){
        var texto = findViewById(R.id.textoSorteio) as TextView
        var numeroSorteado = java.util.Random().nextInt(11)
        texto.setText("Numero sorteado é: $numeroSorteado")

    }
}