package com.osi.myappoct03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FirstFragmentListener {

    private val frag1 = BlankFragment1()
    private val frag2 = BlankFragment2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.frag1, frag1)
            .add(R.id.frag2, frag2)
            .commit()
    }

    override fun msgFromFirst(msg: String) {
        frag2?.setMessage(msg)
    }

}