package com.example.rndgenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class CoinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_coin, null)
        val images = arrayOf(R.drawable.head,R.drawable.tail)
        var image:ImageView = v.findViewById(R.id.imageView)
        val coinButton:Button = v.findViewById(R.id.buttonCoin)
        coinButton.setOnClickListener() { view: View ->
            var coinflip = (0..1).random()
            image.setImageResource(images[coinflip])
        }
        return v
    }

}