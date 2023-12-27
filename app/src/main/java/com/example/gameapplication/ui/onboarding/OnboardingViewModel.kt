package com.example.gameapplication.ui.onboarding

import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.gameapplication.R
import com.example.gameapplication.ui.BaseViewModel


import timber.log.Timber

class OnboardingViewModel : BaseViewModel() {

    init {
        Timber.d("init ${this::class.java}")
    }

}