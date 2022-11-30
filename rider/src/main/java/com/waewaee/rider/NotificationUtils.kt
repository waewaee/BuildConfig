package com.waewaee.rider

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

fun sendNotification(context: Context, body: String, title: String) {

    val notificationManager =
        context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    val NOTIFICATION_CHANNEL_ID = BuildConfig.APPLICATION_ID + ".channel"

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val name = context.getString(R.string.app_name)
        val channel = NotificationChannel(
            NOTIFICATION_CHANNEL_ID,
            name,
            NotificationManager.IMPORTANCE_DEFAULT
        )
        notificationManager.createNotificationChannel(channel)
    }

    val notification = buildNotification(context, NOTIFICATION_CHANNEL_ID, title, body)

    notificationManager.notify(getUniqueId(), notification)
}

fun getUniqueId() = ((System.currentTimeMillis() % 10000).toInt())

fun buildNotification(
    context: Context,
    channelId: String,
    title: String,
    content: String
): Notification {

    // Message in BigText Style
    val bigTextStyle = NotificationCompat.BigTextStyle()

    bigTextStyle.bigText(content)

    return NotificationCompat.Builder(context, channelId)
        .setSmallIcon(R.mipmap.ic_launcher)
        .setContentTitle(title)
        .setContentText(content)
        .setAutoCancel(true)
        .setStyle(bigTextStyle)
        .build()

}
