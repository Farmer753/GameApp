package com.example.gameapplication

import android.app.Application;
import com.example.gameapplication.ui.di.applicationModule
import org.koin.core.context.GlobalContext
import timber.log.Timber

class GameApplicationApp :Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        // start Koin!
        GlobalContext.startKoin {
            // declare modules
            modules(applicationModule(this@GameApplicationApp))

        }
        Timber.d("com.example.gameapplication.GameApplicationApp")
    }
}
