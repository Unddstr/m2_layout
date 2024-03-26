package ru.gb.layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gb.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Text1.text = "верхняя строчка, настроенная из кода"
        binding.Text2.text = "нижняя строчка, настроенная из кода"
    }
}