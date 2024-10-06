package com.task.fragmentsandnavigationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.task.fragmentsandnavigationapp.R

class FragmentThree : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_three, container, false)
        val threeButton = root.findViewById<Button>(R.id.three_button)
        threeButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentThree_to_fragmentOne)
        }
        return root
    }
}