package com.example.petproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.petproject.databinding.FragmentListBinding
import com.example.petproject.util.popBackStackAllInstances

class ListFragment : Fragment(R.layout.fragment_list) {

    var counter: Int = 0

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = binding.stepBtn
        val tv = binding.counterTv
        tv.text = counter.toString()
        btn.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }

    }

}