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
import com.example.coffee.ui.theme.AnotherGrey
import com.example.coffee.ui.theme.GreenLight
import com.example.coffee.ui.theme.Grey
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.robotoFamily

class Welcome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ForgotPassword()
        }
    }
}

@Preview
@Composable
fun ForgotPassword() {
    val context = LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = White)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.arrowback),
                    contentDescription = ""
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp, start = 41.dp)
        ) {
            Text(text = "Забыли пароль?\n",
                fontSize = 22.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                color = GreenLight
            )

            Text(text = "Введите адрес электронной почты",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.padding(bottom = 57.dp))
            TextField(state = rememberTextFieldState(""),
                leadingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.email),
                        contentDescription = ""
                    )
                },
                placeholder = {
                    Text(text = "Адрес электронной почты",
                        fontSize = 12.sp,
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Normal,
                        color = Grey
                    )
                },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = White,
                    focusedContainerColor = White,
                    errorContainerColor = White,
                    focusedIndicatorColor = AnotherGrey,
                    unfocusedIndicatorColor = AnotherGrey
                ),

            )
        }
        Spacer(modifier = Modifier.padding(bottom = 153.dp))
        Column(modifier = Modifier.fillMaxWidth().padding(end = 47.dp),
            horizontalAlignment = Alignment.End) {
            Box(modifier = Modifier.clip(RoundedCornerShape(100))
                .size(64.dp)
                .background(color = GreenLight)
                .clickable(enabled = true, onClick = { context.startActivity(Intent(context,
                    TwoFactor::class.java)) })) {
                Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
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