package com.example.test2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.test2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null;
    private val binding get() = mBinding!!;
    private var binding: ActivityMainBinding? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);



        binding.test.setText("게시판");
        binding.btnLogin.setOnClickListener {
            binding.test.setText("");
            binding.btnFind.setOnClickListener {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dhwnsxor.netlify.app/"))
                startActivity(intent)
            }
            binding.btnNew.setOnClickListener{


                startActivity(intent);

            }


        }
        }
    }