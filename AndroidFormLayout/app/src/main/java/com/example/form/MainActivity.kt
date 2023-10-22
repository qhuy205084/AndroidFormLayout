package com.example.form

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.form.databinding.ActivityMainBinding
import com.example.form.databinding.NonconstraintlayoutBinding

class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
    lateinit var binding : NonconstraintlayoutBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.registerBtn.setOnClickListener {
//            if (!CheckOK()) {
//                Toast.makeText(this, "You have not filled in enough information", Toast.LENGTH_SHORT).show()
//            }else Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NonconstraintlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.registerBtn.setOnClickListener {
            if (!CheckOK()) {
                Toast.makeText(this, "You have not filled in enough information", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
        }
    }

    fun CheckOK(): Boolean {
        val firstName = binding.firstNameEdit.text.isNotEmpty()
        val lastName = binding.lastNameEdit.text.isNotEmpty()
        val maleCheck = binding.maleOption.isChecked
        val femaleCheck = binding.femaleOption.isChecked
        val birthdayCheck = binding.birthdayEdit.text.isNotEmpty()
        val addressCheck = binding.addressEdit.text.isNotEmpty()
        val emailCheck = binding.emailEdit.text.isNotEmpty()
        val boxCheck = binding.checkbox.isChecked
        var generCheck = maleCheck || femaleCheck
        return firstName && lastName && generCheck && birthdayCheck && addressCheck && emailCheck && boxCheck


    }
}
