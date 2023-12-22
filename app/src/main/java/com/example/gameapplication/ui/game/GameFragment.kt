package com.example.gameapplication.ui.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gameapplication.databinding.FragmentGameBinding
import com.example.gameapplication.databinding.FragmentProfileBinding
import com.example.gameapplication.ui.BaseFragment
import com.example.gameapplication.ui.profile.GameViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class GameFragment : BaseFragment<FragmentGameBinding, GameViewModel>() {


    override val viewModel: GameViewModel by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentGameBinding =
        FragmentGameBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}