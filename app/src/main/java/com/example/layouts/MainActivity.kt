package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        val firstName = findViewById<EditText>(R.id.f_name)
        val lastName = findViewById<EditText>(R.id.l_name)
        val dob = findViewById<EditText>(R.id.dob)
        val pincode = findViewById<EditText>(R.id.pincode)

        btn.setOnClickListener{
            if(TextUtils.isEmpty(firstName.getText())){
                firstName.setError("Please enter first name!")
            }
           else if(TextUtils.isEmpty(lastName.getText())){
                lastName.setError("Please enter last name!")
            }
            else if(TextUtils.isEmpty(dob.getText())){
                dob.setError("Please enter dob!")
            }
            else if(TextUtils.isEmpty(pincode.getText())){
                pincode.setError("Please enter pincode!")
            }
            else {
                Toast.makeText(this, "Details saved successfully!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}