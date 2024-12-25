package com.woocommerce.android.util

import com.woocommerce.android.BuildConfig

@Suppress("SwallowedException")
inline fun <reified T> getBuildConfigValueOrNull(key: String): T? {
    return try {
        val field = BuildConfig::class.java.getField(key)
        field.get(null) as? T
    } catch (e: NoSuchFileException) {
        null
    }
}
