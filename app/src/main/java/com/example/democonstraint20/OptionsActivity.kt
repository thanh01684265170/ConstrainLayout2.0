package com.example.democonstraint20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_options.*

class OptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
        val buttonMovie = findViewById<Button>(R.id.button_movie)
        buttonMovie.setOnClickListener { startActivity(Intent(this, MovieActivity::class.java)) }
        val cupcakeDemo = findViewById<Button>(R.id.button_cupcake)
        cupcakeDemo.setOnClickListener { startActivity(Intent(this, CupcakeActivity::class.java)) }

        val circularConstraintDemo = findViewById<Button>(R.id.button_circular_demo)
        circularConstraintDemo.setOnClickListener { startActivity(Intent(this, CircularConstraintActivity::class.java)) }

        val imageFilterDemo = findViewById<Button>(R.id.buttonImageFilterView)
        imageFilterDemo.setOnClickListener {
            startActivity(Intent(this, ImageFilterViewActivity::class.java))
        }

        buttonClStates.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutStatesExampleActivity::class.java))
        }

        buttonSwipeRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerViewSwipeMotionActivity::class.java))
        }
    }
}

