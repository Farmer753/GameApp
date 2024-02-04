package com.example.gameapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.gameapplication.R
import com.yandex.mobile.ads.banner.BannerAdSize
import com.yandex.mobile.ads.banner.BannerAdView
import com.yandex.mobile.ads.common.AdRequest
import com.yandex.mobile.ads.common.AdSize

class MainActivity : AppCompatActivity() {
companion object{
    const val AD_ID = "R-M-5703407-1"
    const val AD_WIDTH = 320
    const val AD_HEIGHT = 500
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val banner = findViewById<BannerAdView>(R.id.bannerAd)
        banner.setAdUnitId(AD_ID)
        banner.setAdSize(BannerAdSize.fixedSize(this,AD_WIDTH, AD_HEIGHT))
        val adRequest =  AdRequest.Builder().build()
        banner.loadAd(adRequest)
    }
}