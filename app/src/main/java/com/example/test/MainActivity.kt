package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Если плох как математик,\n" +
                "Это в общем не беда,")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Ведь хороший может физик\n" +
                "Получиться из тебя!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Если физик получился,\n" +
                "Скажем прямо, неказист,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Позже может получиться\n" +
                "Очень классный программист!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Программист не очень вышел,\n" +
                "Но остался шанс один,")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Что в конце концов отличный\n" +
                "Из вас выйдет сисадмин!")
    }


}