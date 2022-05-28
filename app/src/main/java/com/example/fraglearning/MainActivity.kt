package com.example.fraglearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fraglearning.fragments.FragA
import com.example.fraglearning.fragments.FragB
import com.example.fraglearning.fragments.FragC

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val fragmentB = FragB()
        //supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentB).commit()

        val fragmentA = FragA()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentA).commit()

    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = FragB()
        fragmentB.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentB)
        transaction.commit()
    }

    override fun passDataComC(editTextInputC: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInputC)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentC = FragC()
        fragmentC.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentC)
        transaction.commit()
    }
}