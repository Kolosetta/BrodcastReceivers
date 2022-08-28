package com.example.brodcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when(intent?.action){
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(context, "Battery low", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = intent.getBooleanExtra("state", false)
                Toast.makeText(context, "Airplane mod chagned $turnedOn", Toast.LENGTH_LONG).show()
            }
            ACTION_CLICKED -> {
                Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object{
        const val ACTION_CLICKED = "clicked"
    }

}