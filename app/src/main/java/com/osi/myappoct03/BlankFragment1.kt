package com.osi.myappoct03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BlankFragment1: Fragment(){

    private lateinit var btn: Button
    private lateinit var editText: EditText
    private var firstFragmentListener: FirstFragmentListener? = null
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank1, container, false)

        btn = view.findViewById(R.id.btnSubmitFrag1)
        editText = view.findViewById(R.id.etUserMessageFrag1)
        textView = view.findViewById(R.id.tvShowTextFrag1)
        btn.setOnClickListener {
            val msg: String = editText.text.toString()
            firstFragmentListener?.msgFromFirst(msg)
        }
        return view
    }

    fun initializeListener(listener: FirstFragmentListener){
        this.firstFragmentListener = listener
    }

    fun setMessage(msg: String) {
        textView.text = msg
    }
}
