package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alcoolougasolina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button.setOnClickListener {
            Calc()
        }
    }

    fun Calc (){
        val vAlcool = binding.editPrecoAlcool.text.toString().toDoubleOrNull()
        val vGasolina = binding.editPrecoGasolina.text.toString().toDoubleOrNull()
        if (vAlcool != null && vGasolina != null) {
            if (vGasolina / vAlcool <= 0.7) {
                binding.tvResult.setText("Gasolina ta top")
            } else {
                binding.tvResult.setText("Alcool ta top")
            }
        }
        else {
            binding.tvResult.setText("Tem campo vazio vey")
        }
    }
}