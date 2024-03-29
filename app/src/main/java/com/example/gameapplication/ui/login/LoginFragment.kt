package com.example.gameapplication.ui.login


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gameapplication.R
import com.example.gameapplication.databinding.FragmentLoginBinding
import com.example.gameapplication.ui.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override val viewModel: LoginViewModel by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding =
        FragmentLoginBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
        binding.buttonToProfile.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_profile)
        }
    }
}