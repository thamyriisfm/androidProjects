package com.example.atmconsultoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class DetalheCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_cliente)
        throw Exception ()
    }
}