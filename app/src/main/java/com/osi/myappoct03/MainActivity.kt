package com.osi.myappoct03

/*
* Created by Amit on Oct 07, 2022
* */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Main Activity
class MainActivity : AppCompatActivity(), FirstFragmentListener, SecondFragmentListener {

    private val frag1 = BlankFragment1()
    private val frag2 = BlankFragment2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.frag1, frag1)
            .add(R.id.frag2, frag2)
            .commit()

        frag1.initializeListener(this)
        frag2.initializeListener(this)
    }

    override fun msgFromFirst(msg: String) {
        frag2.setMessage(msg)
    }

    override fun msgFromSecond(msg: String) {
        frag1.setMessage(msg)
    }
}
