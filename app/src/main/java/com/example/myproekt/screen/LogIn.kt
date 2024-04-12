package com.example.myproekt.screen


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myproekt.viewmodel.ViewModelMain


/*@Preview*/
@Composable
fun LogIn(navHost: NavHostController, viewModelMain: ViewModelMain)
{
    var email: String by rememberSaveable { mutableStateOf("") }
    var flag =  rememberSaveable { mutableStateOf(false) }
    Column (modifier = Modifier
        .fillMaxSize(1f))
    {

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 20.dp, end = 15.dp, start = 15.dp),
            text = "✋ Добро пожаловать!",
            fontWeight = FontWeight.Bold, fontSize = 24.sp,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp, end = 15.dp, start = 15.dp),
            text = "Войдите, чтобы пользоваться функциями приложения", fontSize = 15.sp
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(start = 20.dp, top = 30.dp),
            text = "Вход по E-mail", fontSize = 14.sp, color = Color.Gray
        )
        Column(modifier = Modifier.fillMaxWidth(1f),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            CustomEmail(search = email, onValueChange = {it->email =it})
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 20.dp))
        {
            flag.value = email.isNotEmpty()
            val color = if (flag.value) ButtonDefaults.buttonColors(
                containerColor = Color(0XFF1A6FEE),
                contentColor = Color.White)
            else ButtonDefaults.buttonColors(
                containerColor = Color(0XFFC9D4FB),
                contentColor = Color.White)
            Button(
                onClick = {
                    viewModelMain.sendCodeToEmail(email)
                    navHost.navigate("EmailCodeSreen")},
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth(0.9f),
                colors = color,shape = RoundedCornerShape(10.dp)
            )
            {
                Text(text = "Далее", fontSize = 17.sp)
            }
        }
        Column( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(bottom = 50.dp)
        )
        {
            Text(text = "Или войдите с помощью", fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(bottom = 30.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth(0.9f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color(0XFFEBEBEB))
            )
            {
                Text(text = "Войти с Яндекс", fontSize = 17.sp, color = Color.Black)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEmail( search: String,
                 modifier: Modifier = Modifier,
                 onValueChange: (String) -> Unit)
{
    Box(
        modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0XFFE8EFFF))

    )
    {
        TextField(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .border(width = 1.dp, color = Color(0XFFEBEBEB), shape = RoundedCornerShape(10.dp)),
            shape = RoundedCornerShape(10.dp),
            singleLine = true,
            value = search, onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color(0XFF939396),
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black
            ), placeholder = { Text(text = "example@mail.com", color = Color(0XFF939396)) }
        )
    }
}

