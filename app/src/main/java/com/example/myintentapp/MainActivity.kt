package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // new code
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataAcivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataAcivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, moveAcivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveWithDataIntent  = Intent(this@MainActivity, activity_move_with_data::class.java)
                moveWithDataIntent .putExtra(activity_move_with_data.EXTRA_NAME, "DicodingAcademy Boy")
                moveWithDataIntent .putExtra(activity_move_with_data.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }
        }
    }
}