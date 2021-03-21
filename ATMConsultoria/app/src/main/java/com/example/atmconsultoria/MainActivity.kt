package com.example.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import com.example.atmconsultoria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_LONG).show()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonClientes.setOnClickListener {
            Toast.makeText(applicationContext, "Teste do Toast", LENGTH_LONG).show()
            val intent = Intent(this, DetalheCliente::class.java)
            startActivity(intent)
        }
        binding.buttonEmpresa.setOnClickListener {
            val intent = Intent(this, DetalheEmpresa::class.java)
            startActivity(intent)
        }
        binding.buttonServicos.setOnClickListener {
            val intent = Intent(this, DetalheServicos::class.java)
            startActivity(intent)
        }
        binding.buttonContato.setOnClickListener {
            val intent = Intent(this, DetalheContato::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_LONG).show()
    }
}