package com.example.instagramclone

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfileActivity : AppCompatActivity() {
	private val TAG = "EditProfileActivity"

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_edit_profile)
		Log.d(TAG, "onCreate")
		close_image.setOnClickListener {
			finish()
		}
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d(TAG, "onDestroy")
	}
}