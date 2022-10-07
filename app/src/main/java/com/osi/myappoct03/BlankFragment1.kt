package com.osi.myappoct03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// Fragment 1
class BlankFragment1: Fragment() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var btn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank1, container, false)

        textView = view.findViewById(R.id.tvShowTextFrag1)
        btn = view.findViewById(R.id.btnSubmitFrag1)

        btn.setOnClickListener {
            editText = view.findViewById(R.id.etUserMessageFrag1)
            // Calling the function
            (activity as MainActivity).passDataFromFrag1ToFrag2(editText.text.toString())
        }
        return view
    }

    fun setData(str: String) {
        textView.text = str
    }
}
