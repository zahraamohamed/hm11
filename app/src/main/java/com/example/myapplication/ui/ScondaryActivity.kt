package com.example.myapplication.ui

import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityScondaryBinding
import com.example.myapplication.util.Constant

class ScondaryActivity() :BaseActivity<ActivityScondaryBinding>(){
    override val LOG_TAG: String="secondary"
    override val bindingInflater: (LayoutInflater) -> ActivityScondaryBinding= ActivityScondaryBinding::inflate


    override fun setup() {
     var   getTxt = intent.getStringExtra(Constant.userName).toString()
        binding?.apply {
            txtData.text = getTxt
        }
    }


    override fun addCallbacks() {
    }
}