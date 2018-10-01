package com.ste.forcastyo.data

import android.util.Log
import java.net.URL

class ForecastRequest(private val url: String) {
	fun run() {
		val forcastJsonStr = URL(url).readText()
		Log.d(javaClass.simpleName, forcastJsonStr)
	}
}