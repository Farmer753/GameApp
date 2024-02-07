package com.example.gameapplication.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gameapplication.R
import com.example.gameapplication.databinding.FragmentProfileBinding
import com.example.gameapplication.ui.BaseFragment
import com.example.gameapplication.ui.game.GameViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment : BaseFragment<FragmentProfileBinding, GameViewModel>() {


    override val viewModel: GameViewModel by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentProfileBinding =
        FragmentProfileBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
        binding.buttonSettings.setOnClickListener{
            findNavController().navigate(R.id.action_profile_to_settings) }
    }

}