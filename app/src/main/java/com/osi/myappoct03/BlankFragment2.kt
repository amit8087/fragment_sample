package com.osi.myappoct03

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.lang.ClassCastException

class BlankFragment2 : Fragment() {

    private lateinit var btn: Button
    private lateinit var editText: EditText
    private var secondFragmentListener: SecondFragmentListener? = null
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)

        btn = view.findViewById(R.id.btnSubmitFrag2)
        editText = view.findViewById(R.id.etUserMessageFrag2)
        textView = view.findViewById(R.id.tvShowTextFrag2)
        btn.setOnClickListener {
            val msg: String = editText.text.toString()
            secondFragmentListener?.msgFromSecond(msg)
        }
        return view
    }

    fun setMessage(msg: String) {
        textView.text = msg
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            secondFragmentListener = context as SecondFragmentListener
        }catch (e: ClassCastException){
            throw ClassCastException(context.toString()+ " SecondFragmentListener implement failed.")
        }
    }

    override fun onDetach() {
        super.onDetach()
        secondFragmentListener = null
    }
}
