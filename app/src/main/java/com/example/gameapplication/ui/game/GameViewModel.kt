package com.example.gameapplication.ui.game

import com.example.gameapplication.ui.BaseViewModel

import timber.log.Timber

class GameViewModel : BaseViewModel() {


    init {
        Timber.d("init ${this::class.java}")
    }

    fun test() {
        Timber.d("test")
    }

}