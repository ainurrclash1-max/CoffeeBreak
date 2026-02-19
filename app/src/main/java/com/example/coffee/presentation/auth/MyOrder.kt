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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.coffee.ui.theme.JustForCase
import com.example.coffee.ui.theme.NoName
import com.example.coffee.ui.theme.Valeriy
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.YouSerious
import com.example.coffee.ui.theme.montserratFamily
import com.example.coffee.ui.theme.poppinsFamily
import com.example.coffee.ui.theme.robotoFamily

class MyOrder : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyOrderScreen()
        }
    }
}


@Composable
@Preview
fun MyOrderScreen() {

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
        Spacer(Modifier.padding(bottom = 24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 29.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = "Мой заказ",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )
        }
        Spacer(Modifier.padding(bottom = 27.dp))

        Card(
            modifier = Modifier
                .size(327.dp, 96.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(containerColor = YouSerious)
        ) {
            Row(
                Modifier
                    .fillMaxSize()
                    .padding(start = 25.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(R.drawable.americanskiy),
                    contentDescription = "",
                    modifier = Modifier.size(52.dp, 48.dp)
                )
                Spacer(Modifier.padding(end = 25.dp))
                Column(
                    Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Американо",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp
                    )
                    Spacer(Modifier.padding(bottom = 7.dp))
                    Text(
                        text = "single | iced | medium | full ice",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = Valeriy
                    )
                    Spacer(Modifier.padding(bottom = 5.dp))
                    Text(
                        text = "x 1",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = JustForCase
                    )
                }
                Spacer(Modifier.padding(end = 16.dp))
                Text(
                    text = "100 ₽",
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(Modifier.padding(bottom = 21.dp))

        Card(
            modifier = Modifier
                .size(327.dp, 96.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(containerColor = YouSerious)
        ) {
            Row(
                Modifier
                    .fillMaxSize()
                    .padding(start = 3.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(R.drawable.capuchino),
                    contentDescription = "",
                    modifier = Modifier.size(93.dp, 68.dp)
                )
                Spacer(Modifier.padding(end = 6.dp))
                Column(
                    Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Капучино",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp
                    )
                    Spacer(Modifier.padding(bottom = 7.dp))
                    Text(
                        text = "single | iced | medium | full ice",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = Valeriy
                    )
                    Spacer(Modifier.padding(bottom = 5.dp))
                    Text(
                        text = "x 1",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = JustForCase
                    )
                }
                Spacer(Modifier.padding(end = 16.dp))
                Text(
                    text = "100 ₽",
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(Modifier.padding(bottom = 21.dp))

        Card(
            modifier = Modifier
                .size(327.dp, 96.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(containerColor = YouSerious)
        ) {
            Row(
                Modifier
                    .fillMaxSize()
                    .padding(start = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(R.drawable.whiterussiam),
                    contentDescription = "",
                    modifier = Modifier.size(72.dp, 57.dp)
                )
                Spacer(Modifier.padding(end = 14.dp))
                Column(
                    Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Флэт Уайт",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp
                    )
                    Spacer(Modifier.padding(bottom = 7.dp))
                    Text(
                        text = "single | iced | medium | full ice",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = Valeriy
                    )
                    Spacer(Modifier.padding(bottom = 5.dp))
                    Text(
                        text = "x 1",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = JustForCase
                    )
                }
                Spacer(Modifier.padding(end = 16.dp))
                Text(
                    text = "100 ₽",
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            }
        }

        Row(
            Modifier
                .fillMaxSize()
                .padding(start = 33.dp, end = 37.dp, bottom = 35.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Bottom
        ) {
            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = "Итоговая сумма",
                    fontWeight = FontWeight.Medium,
                    fontFamily = robotoFamily,
                    fontSize = 12.sp,
                    color = IHateThis
                )
                Text(
                    text = "300₽",
                    fontWeight = FontWeight.Medium,
                    fontFamily = poppinsFamily,
                    fontSize = 25.sp
                )
            }
            Spacer(Modifier.padding(end = 32.dp))
            Button(
                onClick = { context.startActivity(Intent(context, Confirmation::class.java)) },
                modifier = Modifier
                    .size(162.dp, 52.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = NoName
                )
            ) {
                Icon(painterResource(R.drawable.cart),
                    contentDescription = "",
                    tint = White)
                Spacer(Modifier.padding(end = 15.dp))
                Text(
                    text = "Далее",
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = robotoFamily,
                    fontSize = 14.sp
                )
            }
        }
    }
}