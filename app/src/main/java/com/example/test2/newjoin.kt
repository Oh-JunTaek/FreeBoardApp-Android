package com.example.test2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test2.databinding.ActivityMainBinding
class newjoin : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null;
    private val binding get() = mBinding!!;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

    }
}
