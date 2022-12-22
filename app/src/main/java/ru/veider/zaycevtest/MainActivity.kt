package ru.veider.zaycevtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        if ((this.application as MainApp).runCounter == 3) {
            Toast.makeText(this, "Это 3-й запуск", Toast.LENGTH_LONG).show()
        }
    }
}