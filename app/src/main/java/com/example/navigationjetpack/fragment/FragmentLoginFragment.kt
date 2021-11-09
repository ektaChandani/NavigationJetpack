package com.example.navigationjetpack.fragment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationjetpack.MainActivity
import com.example.navigationjetpack.R
import kotlinx.android.synthetic.main.fragment_login.*


class FragmentLoginFragment : Fragment() {

    lateinit var sharedPreferences:SharedPreferences
    var isRemembered = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

        sharedPreferences = this.requireContext().getSharedPreferences("Pref" , Context.MODE_PRIVATE)
        isRemembered = sharedPreferences.getBoolean("CHECKBOX" , false)

//        if (isRemembered){
//            val intent = Intent(this.context , FragmentHomeFragment::class.java)
//            startActivity(intent)
//            finish()
//        }
//        bt_login.setOnClickListener {
//
//        }

    }

}