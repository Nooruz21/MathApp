package com.example.testmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testmath.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            val firstNum = firstEd.text.toString()
            val secondNum = secondEd.text.toString()
            val math = Math()
            okBtn.setOnClickListener {
                resultTv.text = math.add(firstNum,secondNum)
            }
            btnDivide.setOnClickListener {
                resultTv.text = math.divide(firstNum,secondNum)
            }
        }
    }
}