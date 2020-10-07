package com.cesarvaliente.bottomnavigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.device.dualscreen.core.DisplayPosition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        move_to_start.setOnClickListener { nav_view.surfaceDuoDisplayPosition = DisplayPosition.START }
        move_to_end.setOnClickListener { nav_view.surfaceDuoDisplayPosition = DisplayPosition.END }
        spanned.setOnClickListener { nav_view.surfaceDuoDisplayPosition = DisplayPosition.DUAL }
    }
}