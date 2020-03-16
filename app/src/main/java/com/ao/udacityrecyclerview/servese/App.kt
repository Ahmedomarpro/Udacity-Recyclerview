package com.ao.udacityrecyclerview.servese

import android.app.Application
import android.content.IntentFilter
import android.os.Build

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        connectionReceiver()
    }
    private fun connectionReceiver(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val receiver = Receiver()
            val intentFilter = IntentFilter()
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE")
            registerReceiver(receiver, intentFilter)

         }
        
    }
}