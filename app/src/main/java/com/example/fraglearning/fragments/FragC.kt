package com.example.fraglearning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fraglearning.Communicator
import com.example.fraglearning.R
import kotlinx.android.synthetic.main.fragment_frag_b.view.*
import kotlinx.android.synthetic.main.fragment_frag_c.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragC.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragC : Fragment() {
    private var displayMessageC: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate((R.layout.fragment_frag_c), container, false)
        displayMessageC = arguments?.getString("message")

        view.displayMessageC.text = displayMessageC

        return view
    }
}