package com.example.democonstraint20.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.democonstraint20.R
import com.example.democonstraint20.circular.CircularConstraintActivity
import com.example.democonstraint20.constraintset.CupcakeActivity
import com.example.democonstraint20.constraintset.MovieActivity
import com.example.democonstraint20.contrainstate.ConstraintLayoutStatesExampleActivity
import com.example.democonstraint20.miagefilter.ImageFilterViewActivity
import com.example.democonstraint20.motionlayout.MotionActivity
import com.example.democonstraint20.motionlayout.MotionBasicActivity
import com.example.democonstraint20.motionlayout.MotionKeyFrameActivity
import com.example.democonstraint20.motionlayout.RecyclerViewSwipeMotionActivity
import com.example.democonstraint20.recyclerliner.LinearActivity
import com.example.democonstraint20.recyclerperconstrain.ConstrainActivity
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
        circularConstraintDemo.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    CircularConstraintActivity::class.java
                )
            )
        }

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

        buttonMotionCompare.setOnClickListener {
            startActivity(Intent(this, MotionActivity::class.java))
        }

        buttonKeyFrame.setOnClickListener {
            startActivity(Intent(this, MotionKeyFrameActivity::class.java))
        }

        buttonMotionBasic.setOnClickListener {
            startActivity(Intent(this, MotionBasicActivity::class.java))
        }

        button_recycler_linear.setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }

        button_recycler_constrain.setOnClickListener {
            startActivity(Intent(this, ConstrainActivity::class.java))
        }

    }
}

