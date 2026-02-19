package com.example.coffee.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.AnotherOne
import com.example.coffee.ui.theme.GreenLight
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.robotoFamily

class TwoFactor : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OtpVer()
        }
    }
}

@Composable
@Preview
fun OtpVer() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.arrowback), contentDescription = ""
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp, start = 41.dp)
        ) {
            Text(
                text = "Проверка\n",
                fontSize = 22.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                color = GreenLight
            )

            Text(
                text = "Введите код, который мы вам отправили",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.padding(bottom = 57.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                state = rememberTextFieldState(),
                modifier = Modifier
                    .size(height = 61.dp, width = 48.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = AnotherOne,
                    unfocusedIndicatorColor = AnotherOne,
                    focusedContainerColor = AnotherOne,
                    unfocusedContainerColor = AnotherOne
                )
            )
            Spacer(modifier = Modifier.padding(end = 22.dp))
            TextField(
                state = rememberTextFieldState(),
                modifier = Modifier
                    .size(height = 61.dp, width = 48.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = AnotherOne,
                    unfocusedIndicatorColor = AnotherOne,
                    focusedContainerColor = AnotherOne,
                    unfocusedContainerColor = AnotherOne
                )
            )
            Spacer(modifier = Modifier.padding(end = 22.dp))
            TextField(
                state = rememberTextFieldState(),
                modifier = Modifier
                    .size(height = 61.dp, width = 48.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = AnotherOne,
                    unfocusedIndicatorColor = AnotherOne,
                    focusedContainerColor = AnotherOne,
                    unfocusedContainerColor = AnotherOne
                )
            )
            Spacer(modifier = Modifier.padding(end = 22.dp))
            TextField(
                state = rememberTextFieldState(),
                modifier = Modifier
                    .size(height = 61.dp, width = 48.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = AnotherOne,
                    unfocusedIndicatorColor = AnotherOne,
                    focusedContainerColor = AnotherOne,
                    unfocusedContainerColor = AnotherOne
                )
            )
        }
        Spacer(modifier = Modifier.padding(bottom = 46.dp))
        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Выслать заново через 00:30",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer(modifier = Modifier.padding(bottom = 62.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 47.dp),
            horizontalAlignment = Alignment.End
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .size(64.dp)
                    .background(color = GreenLight)
                    .clickable(enabled = true, onClick = {
                        context.startActivity(
                            Intent(
                                context, Menu::class.java
                            )
                        )
                    })
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(R.drawable.arrownext),
                        contentDescription = "",
                        tint = White
                    )
                }
            }
        }
    }
}