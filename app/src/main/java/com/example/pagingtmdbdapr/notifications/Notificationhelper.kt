package com.example.pagingtmdbdapr.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationManagerCompat


import android.app.Notification
import android.app.PendingIntent
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.TaskStackBuilder
import com.example.pagingtmdbdapr.R


class Notificationhelper : AppCompatActivity() {
/*
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }



        fun createNotificationChannel(
            context: Context,
            importance: Int,
            showBadge: Boolean,
            name: String,
            description: String
        ) {
            // 1
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                // 2
                val channelId = "${context.packageName}-$name"
                val channel = NotificationChannel(channelId, name, importance)
                channel.description = description
                channel.setShowBadge(showBadge)

                // 3
                val notificationManager = context.getSystemService(NotificationManager::class.java)
                notificationManager.createNotificationChannel(channel)
            }
        }

    fun bb()
    {
        NotificationHelper.createNotificationChannel(
            this,
            NotificationManagerCompat.IMPORTANCE_DEFAULT, false,
            getString(R.string.app_name), "App notification channel."
        )
    }


    fun cc()
    {
        val channelId = "${context.packageName}-${context.getString(R.string.app_name)}"
// 2
        val notificationBuilder = NotificationCompat.Builder(context, channelId).apply {
            setSmallIcon(R.drawable.ic_stat_medicine) // 3
            setContentTitle(title) // 4
            setContentText(message) // 5
            setStyle(NotificationCompat.BigTextStyle().bigText(bigText)) // 6
            priority = NotificationCompat.PRIORITY_DEFAULT // 7
            setAutoCancel(autoCancel) // 8
        }
    }



    fun three()
    {
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
// 2
        val pendingIntent = PendingIntent.getActivity(context, 0, intent, 0)
// 3
        setContentIntent(pendingIntent)

        val notificationManager = NotificationManagerCompat.from(context)
// 2
        notificationManager.notify(1001, notificationBuilder.build())
    }
    }

 */
}