package com.wizeline.academy.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass.
 * Use the [BlackUserFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlackUserFragment : Fragment() {

    private var textView1: TextView? = null
    private var textView2: TextView? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_black_user, container, false)
        textView1 = view.findViewById(R.id.black_text_view_1)
        textView2 = view.findViewById(R.id.black_text_view_2)
        button = view.findViewById(R.id.black_button)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: 6c set userName from arguments
        arguments?.let {
            val user = it.getString("userName")
            textView1?.text = user
        }

        // TODO: 7e set courseName from safeArgs
        val safeArgs by navArgs<BlackUserFragmentArgs>()
        textView2?.text = safeArgs.courseName


        button?.setOnClickListener {
            // TODO: 8a Challenge Go to Golden Screen and then Golden Screen to Home
            findNavController().navigate(R.id.goldenUserFragment)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment LevelAFragment.
         */
        @JvmStatic
        fun newInstance() = BlackUserFragment().apply {
            arguments = Bundle().apply {

            }
        }
    }
}
