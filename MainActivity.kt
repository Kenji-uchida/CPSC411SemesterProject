package com.example.imageeditor

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var bannerIv: ImageView
    private lateinit var bitmapOriginal: Bitmap
    private lateinit var bitmapConverted: Bitmap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bannerIv = findViewById<ImageView>(R.id.bannerIv)

        val bitmapDrawable = bannerIv?.drawable as BitmapDrawable
        bitmapOriginal = bitmapDrawable.bitmap
    }

    fun resetClicked(view: View?) {
        bannerIv!!.setImageBitmap(bitmapOriginal)
    }

    fun grayClicked(view: View?) {
        bitmapConverted = Bitmap.createBitmap(bitmapOriginal.width, bitmapOriginal.height, bitmapOriginal.config)
        val red = 0.33
        val green = 0.59
        val blue = 0.11
        for (i in 0 until bitmapOriginal.width) {
            for (j in 0 until bitmapOriginal.height) {
                val p = bitmapOriginal.getPixel(i, j)
                var r = Color.red(p)
                var g = Color.green(p)
                var b = Color.blue(p)
                r = red.toInt() * r
                g = green.toInt() * g
                b = blue.toInt() * b
                bitmapConverted.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b))
            }
        }
        bannerIv!!.setImageBitmap(bitmapConverted)
    }

    fun brightClicked(view: View?) {
        bitmapConverted = Bitmap.createBitmap(bitmapOriginal.width, bitmapOriginal.height, bitmapOriginal.config)
        for (i in 0 until bitmapOriginal.width) {
            for (j in 0 until bitmapOriginal.height) {
                val p = bitmapOriginal.getPixel(i, j)
                var r = Color.red(p)
                var g = Color.green(p)
                var b = Color.blue(p)
                var alpha = Color.alpha(p)
                r = 100 + r
                g = 100 + g
                b = 100 + b
                alpha = 100 + alpha
                bitmapConverted.setPixel(i, j, Color.argb(alpha, r, g, b))
            }
        }
        bannerIv!!.setImageBitmap(bitmapConverted)
    }

    fun darkClicked(view: View?) {
        bitmapConverted = Bitmap.createBitmap(bitmapOriginal.width, bitmapOriginal.height, bitmapOriginal.config)
        for (i in 0 until bitmapOriginal.width) {
            for (j in 0 until bitmapOriginal.height) {
                val p = bitmapOriginal.getPixel(i, j)
                var r = Color.red(p)
                var g = Color.green(p)
                var b = Color.blue(p)
                var alpha = Color.alpha(p)
                r = r - 50
                g = g - 50
                b = b - 50
                alpha = alpha - 50
                bitmapConverted.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b))
            }
        }
        bannerIv!!.setImageBitmap(bitmapConverted)
    }

    fun gamaClicked(view: View?) {
        bitmapConverted = Bitmap.createBitmap(bitmapOriginal.width, bitmapOriginal.height, bitmapOriginal.config)
        for (i in 0 until bitmapOriginal.width) {
            for (j in 0 until bitmapOriginal.height) {
                val p = bitmapOriginal.getPixel(i, j)
                var r = Color.red(p)
                var g = Color.green(p)
                var b = Color.blue(p)
                var alpha = Color.alpha(p)
                r = r + 150
                g = 0
                b = 0
                alpha = 0
                bitmapConverted.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b))
            }
        }
        bannerIv!!.setImageBitmap(bitmapConverted)
    }

    fun greenClicked(view: View?) {
        bitmapConverted = Bitmap.createBitmap(bitmapOriginal.width, bitmapOriginal.height, bitmapOriginal.config)
        for (i in 0 until bitmapOriginal.width) {
            for (j in 0 until bitmapOriginal.height) {
                val p = bitmapOriginal.getPixel(i, j)
                var r = Color.red(p)
                var g = Color.green(p)
                var b = Color.blue(p)
                var alpha = Color.alpha(p)
                r = 0
                g = g + 150
                b = 0
                alpha = 0
                bitmapConverted.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b))
            }
        }
        bannerIv!!.setImageBitmap(bitmapConverted)
    }

    fun blueClicked(view: View?) {
        bitmapConverted = Bitmap.createBitmap(bitmapOriginal.width, bitmapOriginal.height, bitmapOriginal.config)
        for (i in 0 until bitmapOriginal.width) {
            for (j in 0 until bitmapOriginal.height) {
                val p = bitmapOriginal.getPixel(i, j)
                var r = Color.red(p)
                var g = Color.green(p)
                var b = Color.blue(p)
                var alpha = Color.alpha(p)
                r = 0
                g = 0
                b = b + 150
                alpha = 0
                bitmapConverted.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b))
            }
        }
        bannerIv!!.setImageBitmap(bitmapConverted)
    }
}