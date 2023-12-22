package com.example.gameapplication.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gameapplication.databinding.FragmentSettingsBinding
import com.example.gameapplication.ui.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SettingsFragment : BaseFragment<FragmentSettingsBinding, TopViewModel>() {


    override val viewModel: TopViewModel by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSettingsBinding =
        FragmentSettingsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}