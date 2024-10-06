package com.task.fragmentsandnavigationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.task.fragmentsandnavigationapp.R

class FragmentTwo : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_two, container, false)
        val twoButton = root.findViewById<Button>(R.id.two_button)
        twoButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTwo_to_fragmentThree)
        }
        return root
    }
}