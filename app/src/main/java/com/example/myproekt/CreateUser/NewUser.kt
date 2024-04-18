@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myproekt.CreateUser


import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.navigation.NavHostController


/*@Preview*/
@ExperimentalMaterial3Api
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateUser(navHost: NavHostController)
{
    val context = LocalContext.current
    val sex = arrayOf("Женский", "Мужской")
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf("Пол") }
    var flag1 = remember { mutableStateOf(false) }
    var flag2 = remember { mutableStateOf(false) }
    var flag3 = remember { mutableStateOf(false) }
    var flag4 = remember { mutableStateOf(false) }
    var flag5 = remember { mutableStateOf(false) }
    var userName: String by rememberSaveable { mutableStateOf("") }
    var userSurname: String by rememberSaveable { mutableStateOf("") }
    var userPatronymic: String by rememberSaveable { mutableStateOf("") }
    var userDate: String by rememberSaveable { mutableStateOf("") }
    var mTextFieldSize by remember { mutableStateOf(Size.Zero)}

    Column(modifier = Modifier
        .fillMaxSize(1f)
        .background(Color.White)
    )
    {
       Row(modifier = Modifier
           .fillMaxWidth(1f)
           .padding(top = 24.dp, start = 24.dp, end = 24.dp))
       {
           Box()
           {
               Text(
                   text = "Создание карты ",
                   fontSize = 26.sp,
                   fontWeight = FontWeight.Bold,
                   textAlign = TextAlign.Left,
                   color = Color.Black
               )
               Text(
                   modifier = Modifier
                       .padding(top = 32.dp),
                   text = "пациента",
                   fontSize = 26.sp,
                   fontWeight = FontWeight.Bold,
                   textAlign = TextAlign.Left,
                   color = Color.Black
               )
           }
           Box(modifier = Modifier
               .padding(start = 45.dp, end = 24.dp, top = 12.dp))
           {
               Text(
                   text = "Пропустить",
                   fontSize = 15.sp,
                   textAlign = TextAlign.Center,
                   color = Color(0xFF1A6FEE)
               )
           }
       }
        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .padding(top = 24.dp, start = 24.dp, end = 24.dp))
        {
            Box()
            {
                Text(
                    text = "Без карты пациента вы не сможете заказать анализы.",
                    fontSize = 14.sp,
                    color = Color(0xFF7E7E9A)
                )
                Text(
                    text = "В картах пациентов будут храниться результаты анализов вас и ваших близких.",
                    fontSize = 14.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 30.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(end = 24.dp, start = 24.dp, top = 32.dp)
        )
        {
            Column(modifier = Modifier.fillMaxSize(1f))
            {
                Box(
                    modifier = Modifier.fillMaxWidth(1f)
                        .height(55.dp)
                )
                {
                    CustomName(search = userName, onValueChange = { it ->
                        userName = it
                    })
                }
                Box(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth(1f)
                        .height(55.dp)
                )
                {
                    CustomPatronymic(search = userPatronymic, onValueChange = { it ->
                        userPatronymic = it
                    })
                }
                Box(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth(1f)
                        .height(55.dp)
                )
                {
                    CustomSurname(search = userSurname, onValueChange = { it ->
                        userSurname = it
                    })
                }
                Box(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth(1f)
                        .height(55.dp)
                )
                {
                    CustomDate(search = userDate, onValueChange = { it ->
                        userDate = it
                    })
                }
                Box(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth(1f)
                        .clip(RoundedCornerShape(10.dp))
                )
                {
                    ExposedDropdownMenuBox(
                        expanded = expanded,
                        onExpandedChange = {expanded = !expanded }
                    )
                    {
                        TextField(
                            value = selectedText,
                            onValueChange = {},
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color(0XFFF5F5F9),
                                focusedIndicatorColor = Color.Transparent,
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color(0xFF939396),
                                disabledIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            readOnly = true,
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                            modifier = Modifier
                                .menuAnchor()
                                .fillMaxWidth()
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFEBEBEB),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .onGloballyPositioned
                                { coordinates ->
                                    mTextFieldSize = coordinates.size.toSize()
                                }
                                .height(55.dp)
                        )
                        ExposedDropdownMenu(
                            expanded = expanded,
                            onDismissRequest = { expanded = false }
                        ) {
                            sex.forEach { item ->
                                DropdownMenuItem(
                                    text = { Text(text = item) },
                                    onClick = {
                                        selectedText = item
                                        expanded = false
                                        Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                                    }
                                )
                            }
                        }
                    }
                }
                Row(modifier = Modifier
                    .padding(top = 25.dp))
                {
                    flag1.value=userName.isNotEmpty()
                    flag2.value=userSurname.isNotEmpty()
                    flag3.value=userPatronymic.isNotEmpty()
                    flag4.value=userDate.isNotEmpty()
                    val color = if(flag1.value and flag2.value and flag3.value and flag4.value) ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF1A6FEE),
                        contentColor = Color.White
                    )
                    else ButtonDefaults.buttonColors(
                        containerColor = Color(0XFFC9D4FB),
                        contentColor = Color.White
                    )
                    Button(
                        shape = RoundedCornerShape(10.dp),
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .size(64.dp),
                        colors = color
                    )
                    {
                        Text("Создать", fontSize = 23.sp)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomName(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(10.dp))

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black,
            ),
            modifier = Modifier
                .background(Color(0XFFF5F5F9))
                .fillMaxWidth(1f)
                .border(
                    width = 1.dp,
                    color = Color(0xFFEBEBEB),
                    shape = RoundedCornerShape(10.dp)
                )
                .size(64.dp),
            placeholder = {
                Text(
                    text = "Имя",
                    color = Color(0xFF939396)
                )
            }
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSurname(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(10.dp))

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black,
            ),
            modifier = Modifier
                .background(Color(0XFFF5F5F9))
                .fillMaxWidth(1f)
                .border(
                    width = 1.dp,
                    color = Color(0xFFEBEBEB),
                    shape = RoundedCornerShape(10.dp)
                )
                .size(64.dp),
            placeholder = {
                Text(
                    text = "Фамилия",
                    color = Color(0xFF939396)
                )
            }
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomPatronymic(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(10.dp))

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            modifier = Modifier
                .background(Color(0XFFF5F5F9))
                .fillMaxWidth(1f)
                .border(
                    width = 1.dp,
                    color = Color(0xFFEBEBEB),
                    shape = RoundedCornerShape(10.dp)
                )
                .size(64.dp),
            placeholder = {
                Text(
                    text = "Отчество",
                    color = Color(0xFF939396)
                )
            }
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDate(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
)
{
    Box(
        modifier = modifier
            .fillMaxWidth(1f)
            .clip(RoundedCornerShape(10.dp))

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Black,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .background(Color(0XFFF5F5F9))
                .fillMaxWidth(1f)
                .border(
                    width = 1.dp,
                    color = Color(0xFFEBEBEB),
                    shape = RoundedCornerShape(10.dp)
                )
                .size(64.dp),
            placeholder = {
                Text(
                    text = "Дата рождения",
                    color = Color(0xFF939396)
                )
            }
        )
    }
}

