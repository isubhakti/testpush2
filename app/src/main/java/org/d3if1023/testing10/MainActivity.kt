package org.d3if1023.testing10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import org.d3if1023.testing10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingUtil: ActivityMainBinding
    private lateinit var  navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
