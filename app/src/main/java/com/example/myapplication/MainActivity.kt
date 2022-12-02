package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import java.util.EmptyStackException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_main = findViewById<Button>(R.id.btn_main)
        val table = findViewById<EditText>(R.id.TableInput)

        btn_main.setOnClickListener {
            if (table.length()>=1){
                startActivity(Intent(this, MainActivity2::class.java))
                val intent = Intent(this,MainActivity2::class.java)
                val bundle = Bundle()
                intent.putExtra(bundle)

            }
            else{
                Toast.makeText(this,"請輸入桌號",Toast.LENGTH_SHORT).show()
            }
        }



    }
}