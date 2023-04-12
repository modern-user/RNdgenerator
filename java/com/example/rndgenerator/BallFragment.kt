package com.example.rndgenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class BallFragment : Fragment() {
    private val BallVariant = arrayOf(
        R.string.ball1,
        R.string.ball2,
        R.string.ball3,
        R.string.ball4,
        R.string.ball5,
        R.string.ball6,
        R.string.ball7,
        R.string.ball8,
        R.string.ball9,
        R.string.ball10,
        R.string.ball11,
        R.string.ball12,
        R.string.ball13,
        R.string.ball14,
        R.string.ball15,
        R.string.ball16,
        R.string.ball17,
        R.string.ball18,
        R.string.ball19,
        R.string.ball20
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val v = inflater.inflate(R.layout.fragment_ball, null)
        var textField: TextView = v.findViewById(R.id.ballTextView)
        val ballButton:Button = v.findViewById(R.id.buttonBall)
        ballButton.setOnClickListener(){view:View->
            var option = (0..19).random()
            textField.setText(BallVariant[option])
        }
        // Inflate the layout for this fragment
        return v
    }


}