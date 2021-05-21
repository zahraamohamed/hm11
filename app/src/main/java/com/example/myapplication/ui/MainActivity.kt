package com.example.myapplication.ui

import android.content.Intent.ACTION_SEND
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.util.Constant



import android.content.Intent
import android.view.LayoutInflater


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun setup() {
    }


    override fun addCallbacks() {
        binding?.apply {
            btnSend.setOnClickListener {
                val intent = Intent(ACTION_SEND)
                intent.putExtra(Constant.userName, userNameTxt.text.toString())
                startActivity(intent)
            }
        }
    }
}

