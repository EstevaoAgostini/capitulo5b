package com.example.capitulo5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.capitulo5.databinding.FragmentBBinding

class FragmentB : Fragment() {

    //_binding representa a tela do FragmentB
    private var _binding: FragmentBBinding? = null
    // !! permite acessar o valor de binding e nunca será nulo - garante não nulidade
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Instanciando a varialvel do fragment
        _binding = FragmentBBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}