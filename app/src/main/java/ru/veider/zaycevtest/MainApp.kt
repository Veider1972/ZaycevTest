package ru.veider.zaycevtest

import android.app.Application

class MainApp : Application() {
    var runCounter = 0
    val PREFERENCES = "run_counter"
    val COUNTER = "counter"

    override fun onCreate() {
        val sharedPreferences = this.getSharedPreferences(PREFERENCES, MODE_PRIVATE)
        runCounter = sharedPreferences.getInt(COUNTER, 0) + 1
        val editor = sharedPreferences.edit()
        editor.putInt(COUNTER, runCounter).apply()
        super.onCreate()
    }
}