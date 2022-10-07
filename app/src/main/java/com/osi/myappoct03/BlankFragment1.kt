package com.osi.myappoct03

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import java.lang.ClassCastException

class BlankFragment1: Fragment(){

    lateinit var btn: Button
    lateinit var editText: EditText
    private var firstFragmentListener: FirstFragmentListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_blank1, container, false)

        btn = view.findViewById(R.id.btnSubmitFrag1)
        editText = view.findViewById(R.id.etUserMessageFrag1)
        btn.setOnClickListener {
            val msg: String = editText.text.toString()
            firstFragmentListener?.msgFromFirst(msg)
        }
        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            firstFragmentListener = context as FirstFragmentListener
        }catch (e: ClassCastException){
            throw ClassCastException(context.toString()+ " FirstFragmentListener implement failed.")
        }
    }

    override fun onDetach() {
        super.onDetach()
        firstFragmentListener = null
    }
}
