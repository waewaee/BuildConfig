package com.waewaee.rider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar("This is rider app!")

        sendNotification(this, "Your rider is nearby", "Rider Noti")
    }
}