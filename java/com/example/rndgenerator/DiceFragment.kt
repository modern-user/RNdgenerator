package com.example.rndgenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_dice, null)
        val buttonDice:Button = v.findViewById(R.id.buttonDice)
        val textfield:EditText = v.findViewById(R.id.editTextNumberDice)
        val textview:TextView = v.findViewById(R.id.textViewDice)

        buttonDice.setOnClickListener(){ view:View->
            var output = String()
            var sum = 0
            var roll = 0
            if (textfield.text.isEmpty()){
                textview.setText(R.string.empty_alert)
            }
            else {
                val count = textfield.text.toString().toInt()
                for (i in 0..(count-1)){
                    roll =(1..6).random()
                    sum = sum + roll
                    output = output.plus(roll.toString().plus(" + "))
                }
                roll = (1..6).random()
                sum = sum + roll
                output = output.plus(roll.toString()).plus(" = ").plus(sum.toString())
                textview.setText(output)
            }
        }
        return v
    }

}