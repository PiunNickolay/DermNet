package ru.netology.diplom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.diplom.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val diagnosis = intent.getStringExtra("diagnosis")


        binding.tvResult.text = diagnosis ?: "Нет результата"
    }
}
