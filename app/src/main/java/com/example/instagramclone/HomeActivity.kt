package com.example.instagramclone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.google.firebase.auth.FirebaseAuth


class HomeActivity : BaseActivity(0) {
	private val TAG = "HomeActivity"
	private lateinit var mAuth : FirebaseAuth

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_home)
		initBottomNavMenu()
		Log.d(TAG, "onCreate")

		mAuth = FirebaseAuth.getInstance()
		mAuth.signOut()
		/*auth.signInWithEmailAndPassword("nickita.mager@yandex.ru", "148841")
			.addOnCompleteListener {
				if (it.isSuccessful) {
					Log.d(TAG, "signIn: success")
				} else {
					Log.e(TAG, "signIn: failure", it.exception)
				}
			}*/

	}

	override fun onStart() {
		super.onStart()
		if (mAuth.currentUser == null) {
			startActivity(Intent(this, LoginActivity::class.java))
			finish()
		}
	}
}