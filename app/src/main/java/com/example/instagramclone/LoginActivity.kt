package com.example.instagramclone

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
	private val TAG = "LoginActivity"

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_login)
		Log.d(TAG, "onCreate")
	}
}