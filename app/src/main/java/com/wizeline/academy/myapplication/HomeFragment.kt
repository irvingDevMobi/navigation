package com.wizeline.academy.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            // TODO: 4 Navigate to Black User with destination
            // import androidx.navigation.fragment.findNavController
            //findNavController().navigate(R.id.blackUserFragment)

            // TODO: 6b Navigate to Black User with destination and send userName argument
            val bundle = bundleOf("userName" to "Irving Lop")
            findNavController().navigate(R.id.blackUserFragment, bundle)
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            // TODO: 5 Navigate to Black User with action
            //findNavController().navigate(R.id.action_homeFragment_to_blackUserFragment)

            // TODO: 7d Navigate to Black User with action and send courseName
            val action = HomeFragmentDirections.actionHomeFragmentToBlackUserFragment()
            action.courseName = "Android Course"
            findNavController().navigate(action)
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PrimaryUserFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
