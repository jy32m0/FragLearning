package com.example.fraglearning.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fraglearning.Communicator
import com.example.fraglearning.R
import kotlinx.android.synthetic.main.fragment_frag_b.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragB.newInstance] factory method to
 * create an instance of this fragment.
 */

class FragB : Fragment() {
    private var displayMessage: String? = ""
    private lateinit var communicator: Communicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_b, container, false)
        communicator = activity as Communicator
        displayMessage = arguments?.getString("message")

        view.displayMessage.text = displayMessage
        view.sendBtnB.setOnClickListener {
            println(displayMessage)
            communicator.passDataComC(view.displayMessage.text.toString())
        }
        return  view
    }
}