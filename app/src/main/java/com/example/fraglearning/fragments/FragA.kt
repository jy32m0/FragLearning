package com.example.fraglearning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fraglearning.Communicator
import com.example.fraglearning.R
import kotlinx.android.synthetic.main.fragment_frag_a.*
import kotlinx.android.synthetic.main.fragment_frag_a.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragA.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragA : Fragment() {
    private lateinit var communicator: Communicator


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_a, container, false)
        communicator = activity as Communicator

        view.sendBtn.setOnClickListener {
            communicator.passDataCom(view.messageInput.text.toString())
        }
        return view
    }
}