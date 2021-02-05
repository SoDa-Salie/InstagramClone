package com.example.instagramclone

import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth


class HomeActivity : BaseActivity(0) {
	private val TAG = "HomeActivity"

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_home)
		initBottomNavMenu()
		Log.d(TAG, "onCreate")

		val auth = FirebaseAuth.getInstance()
		auth.signInWithEmailAndPassword("nickita.mager@yandex.ru", "148841")
			.addOnCompleteListener {
				if (it.isSuccessful) {
					Log.d(TAG, "signIn: success")
				} else {
					Log.e(TAG, "signIn: failure", it.exception)
				}
			}
	}
}