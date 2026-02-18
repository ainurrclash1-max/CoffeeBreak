package com.example.coffee.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
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
import com.example.coffee.ui.theme.IHateThis
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.YouSerious
import com.example.coffee.ui.theme.poppinsFamily
import com.example.coffee.ui.theme.robotoFamily

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
@Preview
fun ProfileScreen(){
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()
        .background(color = White)
        .padding()){
        Row(modifier = Modifier.padding(start = 24.dp, top = 50.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { context.startActivity(Intent(context, Menu::class.java)) }) {
                Icon(painterResource(R.drawable.arrowback),
                    contentDescription = "")
            }
            Spacer(modifier = Modifier.padding(end = 107.dp))
            Text(text = "Профиль",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.padding(bottom = 34.dp))
        Row(modifier = Modifier.fillMaxWidth()
            .padding(start = 33.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Card(modifier = Modifier.size(42.dp)
                .clip(shape = RoundedCornerShape(100)),
                colors = CardDefaults.cardColors(
                    containerColor = YouSerious
                )) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        painterResource(R.drawable.profile),
                        contentDescription = "",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(end = 16.dp))
            Column {
                Text(text = "Имя",
                    fontFamily = poppinsFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = IHateThis
                )
                Text(text = "Алексей",
                    fontSize = 14.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .padding(end = 35.dp),
                horizontalArrangement = Arrangement.End) {
                IconButton(onClick = {}) {
                    Icon(painterResource(R.drawable.pencil),
                        contentDescription = "")
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 26.dp))
        Row(modifier = Modifier.fillMaxWidth()
            .padding(start = 33.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Card(modifier = Modifier.size(42.dp)
                .clip(shape = RoundedCornerShape(100)),
                colors = CardDefaults.cardColors(
                    containerColor = YouSerious
                )) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        painterResource(R.drawable.phone),
                        contentDescription = "",
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(end = 16.dp))
            Column {
                Text(text = "Номер телефона",
                    fontFamily = poppinsFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = IHateThis
                )
                Text(text = "+7 812 324 6345",
                    fontSize = 14.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .padding(end = 35.dp),
                horizontalArrangement = Arrangement.End) {
                IconButton(onClick = {}) {
                    Icon(painterResource(R.drawable.pencil),
                        contentDescription = "")
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 26.dp))
        Row(modifier = Modifier.fillMaxWidth()
            .padding(start = 33.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Card(modifier = Modifier.size(42.dp)
                .clip(shape = RoundedCornerShape(100)),
                colors = CardDefaults.cardColors(
                    containerColor = YouSerious
                )) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        painterResource(R.drawable.newemail),
                        contentDescription = "",
                        modifier = Modifier.size(19.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(end = 16.dp))
            Column {
                Text(text = "Почта",
                    fontFamily = poppinsFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = IHateThis
                )
                Text(text = "apolsdiapoui@gmail.com",
                    fontSize = 14.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .padding(end = 35.dp),
                horizontalArrangement = Arrangement.End) {
                IconButton(onClick = {}) {
                    Icon(painterResource(R.drawable.pencil),
                        contentDescription = "")
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 26.dp))
        Row(modifier = Modifier.fillMaxWidth()
            .padding(start = 33.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Card(modifier = Modifier.size(42.dp)
                .clip(shape = RoundedCornerShape(100)),
                colors = CardDefaults.cardColors(
                    containerColor = YouSerious
                )) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        painterResource(R.drawable.geomarker),
                        contentDescription = "",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(end = 16.dp))
            Column {
                Text(text = "Адрес кофейни Magic Coffee",
                    fontFamily = poppinsFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = IHateThis
                )
                Text(text = "г. Оренбург, ул. Чкалова 32",
                    fontSize = 14.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .padding(end = 35.dp),
                horizontalArrangement = Arrangement.End) {
                IconButton(onClick = {}) {
                    Icon(painterResource(R.drawable.pencil),
                        contentDescription = "")
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 26.dp))
        Row(modifier = Modifier.fillMaxWidth()
            .padding(start = 33.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Card(modifier = Modifier.size(42.dp)
                .clip(shape = RoundedCornerShape(100)),
                colors = CardDefaults.cardColors(
                    containerColor = YouSerious
                )) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        painterResource(R.drawable.qrcode),
                        contentDescription = "",
                        modifier = Modifier.size(15.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(end = 16.dp))
            Column {
                Text(text = "QR-код",
                    fontFamily = poppinsFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = IHateThis
                )
                Spacer(modifier = Modifier.padding(bottom = 7.dp))
                Text(text = "Для получения заказа",
                    fontSize = 14.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .padding(end = 35.dp),
                horizontalArrangement = Arrangement.End) {
                IconButton(onClick = { context.startActivity(Intent(context, QrCode::class.java)) }) {
                    Icon(painterResource(R.drawable.castrarrow),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp))
                }
            }
        }
    }
}