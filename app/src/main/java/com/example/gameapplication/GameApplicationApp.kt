package com.example.gameapplication

import android.app.Application;
import com.example.gameapplication.ui.di.applicationModule
import com.example.gameapplication.ui.di.domainModule
import org.koin.core.context.GlobalContext.startKoin
import timber.log.Timber

class GameApplicationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        // start Koin!
        startKoin {
            // declare modules
            modules(applicationModule(this@GameApplicationApp), domainModule())
        }
        Timber.d("com.example.gameapplication.GameApplicationApp")
    }
}
