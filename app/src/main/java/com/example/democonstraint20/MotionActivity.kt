package com.example.democonstraint20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_motion_2.*

class MotionActivity : AppCompatActivity() {
    private val items = (1..15).map { "item $it" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_2)

        recyclerview.apply {
            adapter = MotionAdapter(items)
            layoutManager = LinearLayoutManager(this@MotionActivity, RecyclerView.VERTICAL, false)
        }

//        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
