@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myproekt.CreatePassword

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material3.TextFieldDefaults


@OptIn(ExperimentalMaterial3Api::class)
/*@Preview*/
@Composable
fun CreatePassword(navHost: NavHostController)
{
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var num3 by remember { mutableStateOf("") }
    var num4 by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(1f)
        .background(Color.White))
    {
        var flag = remember {
            mutableStateOf(false)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize(1F)
                .padding(bottom = 50.dp)
        ) {
            Column(horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .padding(top = 24.dp, end = 10.dp)) {
                Button(
                    onClick = { navHost.navigate("NewUser")},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.White
                    )
                )
                {
                    Text(
                        text = "Пропустить",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF1A6FEE)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .padding(top = 24.dp),
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = "Создайте пароль",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                Text(
                    text = "Для защиты ваших персональных данных",
                    fontSize = 15.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 80.dp),
                    textAlign = TextAlign.Center
                )
            }
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
                            color = Color(0xFF1A6FEE),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(16.dp)
                        .width(16.dp),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    enabled = false
                )
                Spacer(modifier = Modifier.width(20.dp))
                OutlinedTextField(value = num2,
                    onValueChange = {num2 = it.take(1)},
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFF1A6FEE),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(16.dp)
                        .width(16.dp),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    enabled = false
                )
                Spacer(modifier = Modifier.width(20.dp))
                OutlinedTextField(value = num3,
                    onValueChange = {num3 = it.take(1)},
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFF1A6FEE),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(16.dp)
                        .width(16.dp),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    enabled = false
                )
                Spacer(modifier = Modifier.width(20.dp))
                OutlinedTextField(value = num4,
                    onValueChange = {num4 = it.take(1)},
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFF1A6FEE),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .height(16.dp)
                        .width(16.dp),
                    textStyle = TextStyle(textAlign = TextAlign.Center),
                    enabled = false
                )
            }
            Column(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .fillMaxHeight(1f),
                verticalArrangement = Arrangement.SpaceEvenly
            )
            {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("1", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("2", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("3", fontSize = 32.sp)
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("4", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("5", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("6", fontSize = 32.sp)
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("7", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("8", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("9", fontSize = 32.sp)
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )
                {
                    Button(
                        onClick = {},
                        modifier = Modifier.size(107.dp),
                        enabled = false
                    ){}
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFF5F5F9),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(90.dp)
                    )
                    {
                        Text("0", fontSize = 32.sp)
                    }
                    Button(
                        shape = RoundedCornerShape(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.size(107.dp)
                    )
                    {
                        Icon(
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp),
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "ArrowBack Icon"
                        )
                    }
                }
            }
        }
    }
}
