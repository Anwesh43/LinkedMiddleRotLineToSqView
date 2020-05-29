package com.anwesh.uiprojects.middlerotlinetosqview

/**
 * Created by anweshmishra on 29/05/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val nodes : Int = 5
val lines : Int = 2
val parts : Int = 2
val scGap : Float = 0.02f / (parts * lines)
val sizeFactor : Float = 2.9f
val strokeFactor : Float = 90f
val colors : Array<String> = arrayOf("#4CAF50", "#673AB7", "#009688", "#2196F3", "#F44336")
val backColor : Int = Color.parseColor("#BDBDBD")

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
