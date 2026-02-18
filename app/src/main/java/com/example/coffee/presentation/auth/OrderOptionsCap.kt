package com.example.coffee.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.coffee.ui.theme.Black
import com.example.coffee.ui.theme.FearOfTheDark
import com.example.coffee.ui.theme.GreenDark
import com.example.coffee.ui.theme.GreyLighter
import com.example.coffee.ui.theme.NoName
import com.example.coffee.ui.theme.PaleGreyLighter
import com.example.coffee.ui.theme.Pupupu
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.YouSerious
import com.example.coffee.ui.theme.dmsansFamily
import com.example.coffee.ui.theme.montserratFamily
import com.example.coffee.ui.theme.robotoFamily

class OrderOptionsCap : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cappuccino()
        }
    }
}

@Preview
@Composable
fun Cappuccino() {
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
                onClick = { context.startActivity(Intent(context, Menu::class.java)) },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.arrowback), contentDescription = ""
                )
            }
            Text(
                text = "Заказ",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
            IconButton(
                onClick = {}, modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.cart), contentDescription = ""
                )
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 19.dp))
        Card(
            modifier = Modifier
                .size(325.dp, 146.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(containerColor = YouSerious)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painterResource(R.drawable.capuchino),
                    contentDescription = "",
                    modifier = Modifier.size(152.dp, 121.dp)
                )
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 13.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Капучино",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Card(
                onClick = {},
                modifier = Modifier
                    .border(
                        width = 1.2.dp, color = PaleGreyLighter, shape = RoundedCornerShape(50.dp)
                    )
                    .size(73.dp, 29.dp)
                    .clip(shape = RoundedCornerShape(50.dp)),
                colors = CardDefaults.cardColors(
                    containerColor = White,

                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "-",
                        fontWeight = FontWeight.Medium,
                        fontFamily = dmsansFamily,
                        fontSize = 14.sp,
                        color = Black
                    )
                    Text(
                        text = "1",
                        fontWeight = FontWeight.Medium,
                        fontFamily = dmsansFamily,
                        fontSize = 14.sp,
                        color = Black
                    )
                    Text(
                        text = "+",
                        fontWeight = FontWeight.Medium,
                        fontFamily = dmsansFamily,
                        fontSize = 14.sp,
                        color = Black
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )
        ) {}
        Spacer(modifier = Modifier.padding(bottom = 13.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Ристретто",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Row {
                Card(
                    onClick = { },
                    modifier = Modifier
                        .border(
                            width = 1.2.dp, color = Black, shape = RoundedCornerShape(50.dp)
                        )
                        .size(73.dp, 29.dp)
                        .clip(shape = RoundedCornerShape(50.dp)),
                    colors = CardDefaults.cardColors(
                        containerColor = White,
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Один",
                            fontWeight = FontWeight.Normal,
                            fontFamily = dmsansFamily,
                            fontSize = 12.sp,
                            color = Black
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(end = 8.dp))
                Card(
                    onClick = { },
                    modifier = Modifier
                        .border(
                            width = 1.2.dp,
                            color = PaleGreyLighter,
                            shape = RoundedCornerShape(50.dp)
                        )
                        .size(73.dp, 29.dp)
                        .clip(shape = RoundedCornerShape(50.dp)),
                    colors = CardDefaults.cardColors(
                        containerColor = White,
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Два",
                            fontWeight = FontWeight.Normal,
                            fontFamily = dmsansFamily,
                            fontSize = 12.sp,
                            color = Black
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 11.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )
        ) {}
        Spacer(modifier = Modifier.padding(bottom = 13.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "На месте / навынос",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Row {
                IconButton(onClick = { }) {
                    Icon(
                        painterResource(R.drawable.nameste),
                        contentDescription = "",
                        tint = GreyLighter
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        painterResource(R.drawable.navinos),
                        contentDescription = "",
                        tint = Black
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 12.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )
        ) {}
        Spacer(modifier = Modifier.padding(bottom = 11.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Объем, мл",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Row(verticalAlignment = Alignment.Bottom) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { }) {
                        Icon(
                            painterResource(R.drawable.volume),
                            contentDescription = "",
                            tint = GreyLighter,
                            modifier = Modifier.size(17.dp, 22.dp)
                        )
                    }
                    Text(
                        text = "250",
                        fontWeight = FontWeight.Medium,
                        fontFamily = dmsansFamily,
                        fontSize = 14.sp,
                        color = GreyLighter
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { }) {
                        Icon(
                            painterResource(R.drawable.volume),
                            contentDescription = "",
                            tint = Black
                        )
                    }
                    Text(
                        text = "350",
                        fontWeight = FontWeight.Medium,
                        fontFamily = dmsansFamily,
                        fontSize = 14.sp,
                        color = Black
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { }) {
                        Icon(
                            painterResource(R.drawable.volume),
                            contentDescription = "",
                            tint = GreyLighter,
                            modifier = Modifier.size(29.dp, 38.dp)
                        )
                    }
                    Text(
                        text = "450",
                        fontWeight = FontWeight.Medium,
                        fontFamily = dmsansFamily,
                        fontSize = 14.sp,
                        color = GreyLighter
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 18.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )
        ) {}
        Spacer(modifier = Modifier.padding(bottom = 12.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 31.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Приготовить к\nопределенному времени\nсегодня?",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Column(horizontalAlignment = Alignment.End) {
                Image(
                    painterResource(R.drawable.slider),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.padding(bottom = 16.dp))
                Card(
                    modifier = Modifier
                        .size(86.dp, 36.dp)
                        .clip(RoundedCornerShape(6.dp)),
                    colors = CardDefaults.cardColors(containerColor = Pupupu)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 15.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "18",
                            fontWeight = FontWeight.Normal,
                            fontFamily = dmsansFamily,
                            fontSize = 22.sp
                        )
                        Text(
                            text = ":",
                            fontWeight = FontWeight.Normal,
                            fontFamily = dmsansFamily,
                            fontSize = 22.sp
                        )
                        Text(
                            text = "10",
                            fontWeight = FontWeight.Normal,
                            fontFamily = dmsansFamily,
                            fontSize = 22.sp
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Card(
            onClick = { context.startActivity(Intent(context, Designer::class.java)) },
            modifier = Modifier
                .fillMaxWidth()
                .size(50.dp)
                .padding(start = 32.dp, end = 28.dp)
                .clip(RoundedCornerShape(16.dp)),
            colors = CardDefaults.cardColors(containerColor = GreenDark)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(R.drawable.ithurts),
                    contentDescription = "",
                    tint = White
                )
                Spacer(Modifier.padding(end = 10.dp))
                Text(
                    text = "Конструктор кофемана",
                    fontWeight = FontWeight.Normal,
                    fontFamily = robotoFamily,
                    fontSize = 14.sp,
                    color = White
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .size(16.dp)
                    ) {
                        Icon(
                            painterResource(R.drawable.catraarrow2),
                            contentDescription = "",
                            tint = White
                        )
                    }
                }
            }
        }
        Spacer(Modifier.padding(28.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 29.dp, end = 35.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Итоговая сумма",
                fontWeight = FontWeight.Medium,
                fontFamily = robotoFamily,
                fontSize = 16.sp
            )
            Text(
                text = "250₽",
                fontWeight = FontWeight.SemiBold,
                fontFamily = montserratFamily,
                fontSize = 16.sp
            )
        }
        Spacer(Modifier.padding(bottom = 15.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .size(46.dp)
                .padding(horizontal = 29.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = NoName
            )
        ) {
            Text(
                text = "Далее",
                fontWeight = FontWeight.SemiBold,
                fontFamily = robotoFamily,
                fontSize = 14.sp
            )
        }
    }
}