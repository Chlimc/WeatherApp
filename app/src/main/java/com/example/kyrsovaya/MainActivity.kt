package com.example.kyrsovaya

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.kyrsovaya.databinding.ActivityMainBinding
import com.example.kyrsovaya.fragments.MainFragment
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager // открытие фрагмента в mainActivity
            .beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }


}