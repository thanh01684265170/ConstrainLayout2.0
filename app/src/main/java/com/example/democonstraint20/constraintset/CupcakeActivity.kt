package com.example.democonstraint20.constraintset

import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.appcompat.app.AppCompatActivity
import android.transition.TransitionManager
import android.widget.Button
import com.example.democonstraint20.R


class CupcakeActivity : AppCompatActivity() {

    private var isLargeLayout = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val constraintSet1 = ConstraintSet()
        val constraintSet2 = ConstraintSet()

        constraintSet2.clone(this, R.layout.animation_example_2_transition)
        setContentView(R.layout.animation_example_2)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        constraintSet1.clone(constraintLayout)

        val bakeButton = findViewById<Button>(R.id.button_bake)

        bakeButton.setOnClickListener {

            TransitionManager.beginDelayedTransition(constraintLayout)
            if (isLargeLayout) {
                constraintSet1.applyTo(constraintLayout)
            } else {
                constraintSet2.applyTo(constraintLayout)
            }
            isLargeLayout = !isLargeLayout
        }

    }
}