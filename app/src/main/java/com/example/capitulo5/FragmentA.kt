package com.example.capitulo5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.capitulo5.databinding.FragmentABinding

class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {

        val bundle = Bundle().apply {
            putString("name", "Estevão Agostini")
        }

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA2_to_fragmentB, bundle)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}