package dev.androidblog.extension

import android.content.Context
import android.content.Intent

fun Context.startActivity(c: Class<*>) {
    this.startActivity(Intent(this, c))
}
