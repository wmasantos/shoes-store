package br.com.wmasantos.shoesstore.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import br.com.wmasantos.shoesstore.MainActivity
import br.com.wmasantos.shoesstore.R
import br.com.wmasantos.shoesstore.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding
    private lateinit var btnStart: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupComponents()

        btnStart.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        })
    }

    private fun setupComponents() {
        btnStart = binding.btnStart
    }
}