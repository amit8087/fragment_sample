package com.osi.myappoct03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

// Fragment 2
class BlankFragment2 : Fragment() {

    lateinit var textView: TextView
    lateinit var btn: Button
    lateinit var editText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        textView = view.findViewById(R.id.tvShowTextFrag2)

        btn = view.findViewById(R.id.btnSubmitFrag2)
        btn.setOnClickListener {
            editText = view.findViewById(R.id.etUserMessageFrag2)
            (activity as MainActivity).passDataFromFrag2ToFrag1(editText.text.toString())
        }
        return view
    }

    fun setData(str: String) {
        textView.text = str
    }
}
