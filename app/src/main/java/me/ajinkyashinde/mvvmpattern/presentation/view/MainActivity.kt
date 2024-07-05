package me.ajinkyashinde.mvvmpattern.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import me.ajinkyashinde.mvvmpattern.R
import me.ajinkyashinde.mvvmpattern.presentation.viewmodel.UserViewModel
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        userViewModel.loadUser("1")

        Log.d("MainActivity", "User Data: ${userViewModel.user.value}")

    }
}