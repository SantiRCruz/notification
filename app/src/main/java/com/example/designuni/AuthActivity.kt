package com.example.designuni

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        this.supportActionBar?.hide()
    }
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Exit")
            .setMessage("Are you  sure you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes"){_,_ ->
                finish()
            }
            .setNegativeButton("No",null)
            .show()
    }
}