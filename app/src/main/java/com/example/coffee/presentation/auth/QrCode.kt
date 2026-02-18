package com.example.coffee.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.NoName
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.dmsansFamily
import com.example.coffee.ui.theme.robotoFamily

class QrCode : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QrCodeScreen()
        }
    }
}

@Preview
@Composable
fun QrCodeScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = White)
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(start = 24.dp, top = 50.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { context.startActivity(Intent(context, Profile::class.java)) }) {
                Icon(
                    painterResource(R.drawable.arrowback),
                    contentDescription = ""
                )
            }
            Spacer(modifier = Modifier.padding(end = 98.dp))
            Text(
                text = "Профиль",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.padding(bottom = 27.dp))
        Text(text = "Ваш персональный QR-код",
            fontWeight = FontWeight.Normal,
            fontFamily = dmsansFamily,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.padding(bottom = 40.dp))
        Image(painterResource(R.drawable.fatherofqr),
            contentDescription = "")
        Spacer(modifier = Modifier.padding(bottom = 20.dp))
        Text(text = "Покажите ваш QR-code\nдля получения заказа",
            fontSize = 18.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal,
            color = NoName
        )
    }
}