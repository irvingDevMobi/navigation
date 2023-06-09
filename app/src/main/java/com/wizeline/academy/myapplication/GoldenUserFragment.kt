package com.wizeline.academy.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [GoldenUserFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GoldenUserFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_golden_user, container, false)
        view.findViewById<Button>(R.id.goldenButton)?.setOnClickListener {
            findNavController().navigate(R.id.action_goldenUserFragment_to_homeFragment)
        }
        view.findViewById<Button>(R.id.goldenButton2)?.setOnClickListener {
            findNavController().navigate(R.id.action_goldenUserFragment_to_blackFragment)
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment GoldenUserFragment.
         */
        @JvmStatic
        fun newInstance() =
            GoldenUserFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
