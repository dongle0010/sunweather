package com.dongle.sunweather.util

import android.widget.Toast
import com.dongle.sunweather.IApplication
import com.google.android.material.snackbar.Snackbar

class ToastUtils {
    fun String.showText(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(IApplication.context, this, duration).show()
    }

    fun Snackbar.showSnackbar(
        msg: String,
        actionText: String,
        duration: Int = Snackbar.LENGTH_SHORT
    ) {
        Snackbar.make(this.view, msg, duration).setAction(actionText) {
            "我挥挥衣袖，不带走一片云彩".showText()
        }
    }
}