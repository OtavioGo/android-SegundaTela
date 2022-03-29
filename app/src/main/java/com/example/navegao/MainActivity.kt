package com.example.navegao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSegundaTela.setOnClickListener {
            IrParaSegundaTela()
        }
    }
    private fun IrParaSegundaTela(){
        val segundaTela = Intent(this,SegundaTela::class.java)
        startActivity(segundaTela)
    }
}