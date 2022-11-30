package com.waewaee.rider.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.waewaee.rider.R
import com.waewaee.shared.showSnackBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            Log.d("firebase_token", it.result)
        }
    }

    override fun onResume() {
        super.onResume()

        showSnackBar("This is rider app!")

    }
}