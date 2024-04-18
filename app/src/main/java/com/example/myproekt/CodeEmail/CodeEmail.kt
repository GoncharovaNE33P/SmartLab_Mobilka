package com.example.myproekt.CodeEmail

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.graphics.Color


@OptIn(ExperimentalMaterial3Api::class)
/*@Preview*/
@Composable
fun EmailCode(navHost: NavHostController) {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var num3 by remember { mutableStateOf("") }
    var num4 by remember { mutableStateOf("") }

    val code = remember { mutableStateOf("") }
    LaunchedEffect(code.value)
    {
        if (code.value.length == 4)
        {
            navHost.navigate("PasswordSreen")
        }
    }
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
                contentDescription = "ArrowBack Icon",
                tint = Color.Black
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
            modifier = Modifier.padding(top = 240.dp), color = Color.Black
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedTextField(value = num1,
                onValueChange = {num1 = it.take(1)},
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFFEBEBEB),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .height(54.dp)
                    .width(54.dp),singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF5F5F9),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black),
                textStyle = TextStyle(textAlign = TextAlign.Center),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number,imeAction = ImeAction.Done)
            )
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedTextField(value = num2,
                onValueChange = {num2 = it.take(1)},
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFFEBEBEB),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .height(54.dp)
                    .width(54.dp),singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF5F5F9),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black),
                textStyle = TextStyle(textAlign = TextAlign.Center),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number,imeAction = ImeAction.Done)
            )

            Spacer(modifier = Modifier.width(20.dp))
            OutlinedTextField(value = num3,
                onValueChange = {num3 = it.take(1)},
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFFEBEBEB),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .height(54.dp)
                    .width(54.dp),singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF5F5F9),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black),
                textStyle = TextStyle(textAlign = TextAlign.Center),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number,imeAction = ImeAction.Done)
            )

            Spacer(modifier = Modifier.width(20.dp))
            OutlinedTextField(value = num4,
                onValueChange = {num4 = it.take(1)},
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFFEBEBEB),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .height(54.dp)
                    .width(54.dp),singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF5F5F9),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                textStyle = TextStyle(textAlign = TextAlign.Center),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number,imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions { code.value = "$num1$num2$num3$num4" }
            )
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
