package com.osi.myappoct03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osi.myappoct03.databinding.ActivityMainBinding

// Main Activity
class MainActivity : AppCompatActivity() {

    private val frag1 = BlankFragment1()
    private val frag2 = BlankFragment2()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Added the fragments on the main activity
        supportFragmentManager.beginTransaction().add(R.id.frag1, frag1).commit()
        supportFragmentManager.beginTransaction().add(R.id.frag2, frag2).commit()
    }

    // Function for passing data from frag1 to frag2
    fun passDataFromFrag1ToFrag2(msg: String) {
        frag2.setData(msg)
        frag1.setData(msg)
    }

    // Function for passing data from frag2 to frag1
    fun passDataFromFrag2ToFrag1(msg: String) {
        frag1.setData(msg)
        frag2.setData(msg)
    }
}