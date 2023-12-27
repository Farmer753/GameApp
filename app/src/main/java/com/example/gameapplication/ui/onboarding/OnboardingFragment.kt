package com.example.gameapplication.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gameapplication.databinding.FragmentOnboardingBinding
import com.example.gameapplication.ui.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import androidx.navigation.fragment.findNavController
import com.example.gameapplication.R

class OnboardingFragment : BaseFragment<FragmentOnboardingBinding, OnboardingViewModel>() {


    override val viewModel: OnboardingViewModel by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentOnboardingBinding =
        FragmentOnboardingBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGame.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding_to_game)
        }
        binding.buttonTop.setOnClickListener{
            findNavController().navigate(R.id.action_onboarding_to_top) }

        binding.buttonSettings.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding_to_settings)
        }
        binding.buttonLogin.setOnClickListener{
            findNavController().navigate(R.id.action_onboarding_to_login) }
    }

}