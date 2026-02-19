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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.Black
import com.example.coffee.ui.theme.FearOfTheDark
import com.example.coffee.ui.theme.GreyLighter
import com.example.coffee.ui.theme.NoName
import com.example.coffee.ui.theme.NoNameFade
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.poppinsFamily
import com.example.coffee.ui.theme.robotoFamily

class MyOrderCurrent : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewScreen()
        }
    }
}

@Preview
@Composable
fun NewScreen() {
    val context = LocalContext.current

    Column(
        Modifier
            .fillMaxSize()
            .background(color = White)
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Текущий заказ N002",
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        )
        Spacer(Modifier.padding(bottom = 40.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )
        ) {}
        Card(
            modifier = Modifier
                .size(327.dp, 96.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(containerColor = White)
        ) {
            Row(
                Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painterResource(R.drawable.americanskiy),
                        contentDescription = "",
                        modifier = Modifier.size(48.dp, 44.dp)
                    )
                    Spacer(Modifier.padding(end = 18.dp))
                    Column(
                        Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row {
                            Text(
                                text = "Американо",
                                fontFamily = robotoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                color = NoName
                            )
                            Spacer(Modifier.padding(end = 4.dp))
                            Text(
                                text = "x1",
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 10.sp,
                                color = NoNameFade
                            )
                        }
                        Spacer(Modifier.padding(bottom = 7.dp))
                        Text(
                            text = "24 июня | 12:30 | к 18:10 ",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 10.sp,
                            color = NoName,
                            modifier = Modifier.alpha(0.22F)
                        )
                    }
                }
                Spacer(Modifier.padding(end = 16.dp))
                Text(
                    text = "100 ₽",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
            }
        }
        Spacer(Modifier.padding(bottom = 10.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )
        ) {}

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Card(
                modifier = Modifier
//                    .shadow(10.dp, RoundedCornerShape(20.dp))
                    .dropShadow(shape = RoundedCornerShape(20.dp),
                        shadow = Shadow(
                            radius = 20.dp,
                            color = NoName,
                            alpha = 0.12F,
                            offset = DpOffset(0.dp, 4.dp)
                        )
                    )
                    .size(324.dp, 64.dp)
                    .clip(RoundedCornerShape(20.dp)
                    ),
                colors = CardDefaults.cardColors(containerColor = White)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { context.startActivity(Intent(context, Menu::class.java)) }) {
                        Icon(
                            painterResource(R.drawable.main),
                            contentDescription = "",
                            tint = Black
                        )
                    }
                    IconButton(onClick = { context.startActivity(Intent(context, Reward::class.java)) }) {
                        Icon(
                            painterResource(R.drawable.gift),
                            contentDescription = "",
                            tint = GreyLighter
                        )
                    }
                    IconButton(onClick = { context.startActivity(Intent(context, OrderHistory::class.java)) }) {
                        Icon(
                            painterResource(R.drawable.newcheck),
                            contentDescription = "",
                            tint = GreyLighter
                        )
                    }
                }
            }
        }
    }
}