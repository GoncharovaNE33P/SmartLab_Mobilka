package com.example.myproekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myproekt.api.RepositoryImpl
import com.example.myproekt.api.RetrofitInstance
import com.example.myproekt.viewmodel.ViewModelMain
import com.example.myproekt.Navigation.Navigation
import com.example.myproekt.ui.theme.MyProektTheme

@Suppress("UNCHECKED_CAST")
class MainActivity : ComponentActivity()
{
    private val viewModelSmart by viewModels<ViewModelMain>(factoryProducer = {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return ViewModelMain(RepositoryImpl(RetrofitInstance.apiSmartLab))
                        as T
            }
        }
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProektTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Navigation(viewModelSmart)
                }

            }
        }
    }
}
