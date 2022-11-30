package com.waewaee.rider.activities

import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.rider.R
import com.waewaee.rider.sendNotification
import com.waewaee.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        showSnackBar("This is rider app!")

        sendNotification(
            context = this,
            body = "Your rider is nearby",
            title = "Rider Noti",
            pendingIntent = PendingIntent.getActivity(
                this,
                0,
                RestaurantDetailsActivity.newIntent(this),
                PendingIntent.FLAG_IMMUTABLE
            ))
    }
}