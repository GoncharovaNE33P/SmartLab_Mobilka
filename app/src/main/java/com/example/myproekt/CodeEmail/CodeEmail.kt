package com.example.myproekt.CodeEmail

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
/*@Preview*/
@Composable
fun EmailCode(navHost: NavHostController) {
    val (num1) = remember { mutableListOf("") }
    val (num2) = remember { mutableListOf("") }
    val (num3) = remember { mutableListOf("") }
    val (num4) = remember { mutableListOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.White)
    )
    {
        Box(
            modifier = Modifier
                .padding(12.dp)
                .height(32.dp)
                .width(32.dp)
                .clip(RoundedCornerShape(7.dp))
                .background(Color(0xFFF5F5F9))
            .clickable { navHost.navigate("logInScreen") },
            contentAlignment = Alignment.Center
        )
        {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "ArrowBack Icon"
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    )
    {
        Text(
            text = "Введите код из E-mail", fontWeight = FontWeight.Bold, fontSize = 24.sp,
            modifier = Modifier.padding(top = 240.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Box(modifier = Modifier.padding(10.dp))
            {
                TextField(
                    value = num1,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape((10.dp)),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEBEBEB),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(48.dp)
                        .width(48.dp),

                    singleLine = true,
                    onValueChange = {}
                )
            }
            Box(modifier = Modifier.padding(10.dp))
            {
                TextField(
                    value = num2,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape((10.dp)),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEBEBEB),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(48.dp)
                        .width(48.dp),
                    singleLine = true,
                    onValueChange = {}
                )
            }
            Box(modifier = Modifier.padding(10.dp))
            {
                TextField(
                    value = num3,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape((10.dp)),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEBEBEB),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(48.dp)
                        .width(48.dp),
                    singleLine = true,
                    onValueChange = {}
                )
            }
            Box(modifier = Modifier.padding(10.dp))
            {
                TextField(
                    value = num4,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape((10.dp)),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEBEBEB),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(48.dp)
                        .width(48.dp),
                    singleLine = true,
                    onValueChange = {}
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(12.dp)
                .height(43.dp)
                .width(242.dp)
                .clip(RoundedCornerShape(7.dp)),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                text = "Отправить код повторно можно будет через 59 секунд",
                fontSize = 15.sp, color = Color(0XFF939396),
                textAlign = TextAlign.Center)
        }
    }
}
