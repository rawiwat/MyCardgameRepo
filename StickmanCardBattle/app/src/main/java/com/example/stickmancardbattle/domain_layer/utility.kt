package com.example.stickmancardbattle.domain_layer

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

enum class FieldZoneForEntity {
    FRONT_LEFT,
    FRONT_RIGHT,
    BACK_LEFT,
    BACK_CENTER,
    BACK_RIGHT
}

fun Context.getDrawableAsImageBitmap(drawableId: Int): ImageBitmap {
    val drawable = resources.getDrawable(drawableId, theme)
    val bitmap = BitmapFactory.decodeResource(resources, drawableId)
    return bitmap.asImageBitmap()
}