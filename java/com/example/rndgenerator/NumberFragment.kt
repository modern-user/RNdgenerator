package com.example.rndgenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.rndgenerator.databinding.ActivityMainBinding



class NumberFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_number, null)

        var startField:EditText = v.findViewById(R.id.editTextNumber1)
        var endField:EditText = v.findViewById(R.id.editTextNumber2)
        var countField:EditText = v.findViewById(R.id.editTextNumber3)
        var textField:TextView = v.findViewById(R.id.numberTextView)
        // проверка полей на пустоту
        fun checkEmptyness() : Boolean
        {
            if (startField.text.isEmpty()||endField.text.isEmpty()||countField.text.isEmpty())
            return true
           return false
        }
        //создание рандомных чисел и их вывод
        fun putRandomNumbers()
        {
                val startNum =  startField.text.toString().toInt()
                val endNum = endField.text.toString().toInt()
                val countNum = countField.text.toString().toInt()

            var rndnumbers = IntArray(countNum)
            var output = String()


            if (startNum < endNum){
                for (i in 0..(countNum-1)){
                    rndnumbers[i] = (startNum..endNum).random()
                }
            }
                else{
                for (i in 0..(countNum-1)){
                    rndnumbers[i] =(endNum..startNum).random()
                }
                }
            for (i in 1..countNum){
                output = output.plus(rndnumbers[i-1].toString()).plus(" ")
            }
            textField.setText(output)
        }

        val  number_button:Button = v.findViewById(R.id.number_button)

        number_button.setOnClickListener { view:View ->
        if (checkEmptyness()){
            // уведомление пользователя , что есть пустые поля
            textField.setText(R.string.empty_alert)
        }
            else{

            putRandomNumbers()
            }
        }


        // Inflate the layout for this fragment
            return v
    }

}

