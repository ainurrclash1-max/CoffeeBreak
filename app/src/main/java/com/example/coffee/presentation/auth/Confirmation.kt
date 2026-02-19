package com.example.coffee.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.GreyA
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.robotoFamily

class Confirmation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConfirmationScreen()
        }
    }
}

@Preview
@Composable
fun ConfirmationScreen(){
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White)
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(start = 26.dp, top = 50.dp, end = 30.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(
                onClick = { context.startActivity(Intent(context, Menu::class.java)) },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.arrowback), contentDescription = ""
                )
            }
        }
        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(R.drawable.cofeehand),
                contentDescription = "")
            Spacer(Modifier.padding(bottom = 32.dp))
            Text(text = "Заказано",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp)
            Spacer(Modifier.padding(bottom = 22.dp))
            Text(text = "Алексей, Ваш заказ N 002 успешно размещен.",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = GreyA
            )
            Spacer(Modifier.padding(bottom = 22.dp))
            Text(text = "Заказ будет готов сегодня\n" +
                    "к 18:10 по адресу \n" +
                    "г. Оренбург, ул. Чкалова 32",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.padding(bottom = 22.dp))
            Text(text = "Предъявите Ваш персональный QR-код\n" +
                    "в кофейне для получения заказа.",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = GreyA,
                textAlign = TextAlign.Center
            )
        }
    }
}