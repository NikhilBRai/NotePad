package com.sxbot.myapplication

import android.app.Application

class ExampleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        ObjectBox.init(this)
    }
}
