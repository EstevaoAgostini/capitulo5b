package com.example.capitulo5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.capitulo5.databinding.FragmentBBinding

class FragmentB : Fragment() {

    //_binding representa a tela do FragmentB
    private var _binding: FragmentBBinding? = null
    // !! permite acessar o valor de binding e nunca será nulo - garante não nulidade
    private val binding get() = _binding!!

    //varialvel que envia parametros de uma tela para outra e recebe parameros
    private val args: FragmentBArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Instanciando a varialvel do fragment
        _binding = FragmentBBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        getExtra()
    }

    //método que recebe o parâmetro
    private fun getExtra() {
        Toast.makeText(requireContext(), args.name, Toast.LENGTH_SHORT).show()
    }

    private fun initListeners() {
        binding.button2.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}