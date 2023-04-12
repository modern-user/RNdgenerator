package com.example.rndgenerator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ListFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_list, null)
        val buttonadd:Button = v.findViewById(R.id.buttonAdd)
        val buttoncreate:Button = v.findViewById(R.id.buttonCreateList)
        val textfield:EditText = v.findViewById(R.id.editTextList)
        val numfield:EditText = v.findViewById(R.id.editTextNumberList)
        val textview:TextView = v.findViewById(R.id.textViewList)
        var strings = mutableListOf<String>()
        buttonadd.setOnClickListener(){view:View->
        if(textfield.text.isNotEmpty()){
        strings.add(textfield.text.toString())
            textfield.text.clear()
        }
        }
        buttoncreate.setOnClickListener(){view:View->
            var output = String()
            if (numfield.text.isEmpty()){
                textview.setText(R.string.empty_alert)
            }
            else{
                for (i in 0..(numfield.text.toString().toInt()-1)){
                    var rnd = (0..(strings.size-1)).random()
                    output=output.plus(strings[rnd]).plus("\n")
                }
                textview.setText(output)
            }
        }

        return v
    }

}