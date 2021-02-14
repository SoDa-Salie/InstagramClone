package com.example.instagramclone

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity(4) {
	private val TAG = "ProfileActivity"
	private lateinit var nm: NotificationManager
	private val NOTIFICATION_ID: Int = 127


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_profile)
		initBottomNavMenu()
		Log.d(TAG, "onCreate")
		edit_profile_btn.setOnClickListener {
			val intent = Intent(this, EditProfileActivity::class.java)
			startActivity(intent)
		}

		nm = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
	}

	fun showNotification() {
		val builder = Notification.Builder(applicationContext)
		val intent = Intent(applicationContext, HomeActivity::class.java)
		val pendingIntent = PendingIntent
			.getActivity(applicationContext, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT)

		builder
			.setContentIntent(pendingIntent)
			.setSmallIcon(R.drawable.ic_check)
			.setLargeIcon(BitmapFactory.decodeResource(application.resources, R.drawable.ic_check))
			.setTicker("Опа, анон, а мать жива?")
			.setWhen(System.currentTimeMillis())
			.setAutoCancel(true)
			.setContentTitle("Уведомление, лол")
			.setContentText("Нажми, и узнаешб!")

		val notification = builder.build()

		nm.notify(NOTIFICATION_ID, notification)
	}
}