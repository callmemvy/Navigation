package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.goToThirdButton.setOnClickListener {
            binding.root.findNavController()
                .navigate(FirstFragmentDirections.actionFirstFragmentToThirdFragment())
        }

        return binding.root
    }
}