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
import androidx.compose.material3.CardElevation
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
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.YouSerious
import com.example.coffee.ui.theme.robotoFamily

class Barista : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BaristaCheck()
        }
    }
}

@Preview
@Composable
fun BaristaCheck() {
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
                .padding(start = 24.dp, top = 50.dp, end = 30.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { context.startActivity(Intent(context, Designer::class.java)) },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.arrowback), contentDescription = ""
                )
            }
            Text(
                text = "Конструктор заказа",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
            IconButton(
                onClick = { }, modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.cart), contentDescription = ""
                )
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 33.dp))

        Row(Modifier.fillMaxWidth()
            .padding(start = 29.dp), horizontalArrangement = Arrangement.Start) {
            Text(
                text = "Выберите бариста",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
            )
        }
        Card(
            modifier = Modifier
                .size(335.dp, 81.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(containerColor = White)
        ){
        }
    }
}