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
import com.example.coffee.ui.theme.Black
import com.example.coffee.ui.theme.BluePale
import com.example.coffee.ui.theme.DarkBlue
import com.example.coffee.ui.theme.Grey
import com.example.coffee.ui.theme.GreyLight
import com.example.coffee.ui.theme.GreyLighter
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.dmsansFamily
import com.example.coffee.ui.theme.poppinsFamily
import com.example.coffee.ui.theme.robotoFamily

class Menu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MenuScreen()
        }
    }
}

@Preview
@Composable
fun MenuScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 26.dp, end = 33.dp, top = 63.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Добро пожаловать!",
                    color = Grey,
                    fontSize = 14.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Алексей",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    color = BluePale
                )
            }
            Row {
                IconButton(onClick = { }, modifier = Modifier.padding(end = 0.dp)) {
                    Icon(
                        painterResource(R.drawable.cart),
                        contentDescription = "",
                    )
                }
                IconButton(onClick = {
                    context.startActivity(
                        Intent(
                            context,
                            Profile::class.java
                        )
                    )
                }) {
                    Icon(
                        painterResource(R.drawable.profile),
                        contentDescription = ""
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxSize()
                .clip(
                    RoundedCornerShape(
                        topStart = 25.dp,
                        topEnd = 25.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
                .background(color = DarkBlue),
            colors = CardDefaults.cardColors(containerColor = DarkBlue),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 25.dp, end = 25.dp, top = 16.dp)
            ) {
                Text(
                    text = "Выберите Ваш кофе",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = robotoFamily,
                    color = GreyLight
                )
                Spacer(modifier = Modifier.padding(bottom = 29.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column {
                        Card(
                            modifier = Modifier
                                .size(154.dp, 164.dp)
                                .clip(RoundedCornerShape(15.dp)),
                            colors = CardDefaults.cardColors(containerColor = White),
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.ammoretto),
                                    contentDescription = ""
                                )
                                Spacer(modifier = Modifier.padding(bottom = 10.dp))
                                Text(
                                    text = "Американо",
                                    fontFamily = dmsansFamily,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 7.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "100₽",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = poppinsFamily
                                )
                            }
                        }
                        Spacer(modifier = Modifier.padding(bottom = 17.dp))
                        Card(
                            modifier = Modifier
                                .size(154.dp, 164.dp)
                                .clip(RoundedCornerShape(15.dp)),
                            colors = CardDefaults.cardColors(containerColor = White),
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.latte),
                                    contentDescription = "",
                                    modifier = Modifier.size(104.dp, 82.dp)
                                )
                                Spacer(modifier = Modifier.padding(bottom = 10.dp))
                                Text(
                                    text = "Латте",
                                    fontFamily = dmsansFamily,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 7.dp, top = 11.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "100₽",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = poppinsFamily
                                )
                            }
                        }
                        Spacer(modifier = Modifier.padding(bottom = 17.dp))
                        Card(
                            modifier = Modifier
                                .size(154.dp, 164.dp)
                                .clip(RoundedCornerShape(15.dp)),
                            colors = CardDefaults.cardColors(containerColor = White),
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.raf),
                                    contentDescription = "",
                                    modifier = Modifier.size(82.dp)
                                )
                                Spacer(modifier = Modifier.padding(bottom = 10.dp))
                                Text(
                                    text = "Раф",
                                    fontFamily = dmsansFamily,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 7.dp, top = 12.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "100₽",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = poppinsFamily
                                )
                            }
                        }
                    }

                    Column {
                        Card(
                            modifier = Modifier
                                .size(154.dp, 164.dp)
                                .clip(RoundedCornerShape(15.dp)),
                            colors = CardDefaults.cardColors(containerColor = White),
                            onClick = { context.startActivity(Intent(context, OrderOptionsCap::class.java)) }
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 25.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.capuchino),
                                    contentDescription = "",
                                    modifier = Modifier.size(102.dp, 75.dp)
                                )
                                Spacer(modifier = Modifier.padding(bottom = 21.dp))
                                Text(
                                    text = "Капучино",
                                    fontFamily = dmsansFamily,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 7.dp, top = 1.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "100₽",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = poppinsFamily
                                )
                            }
                        }
                        Spacer(modifier = Modifier.padding(bottom = 17.dp))

                        Card(
                            modifier = Modifier
                                .size(154.dp, 164.dp)
                                .clip(RoundedCornerShape(15.dp)),
                            colors = CardDefaults.cardColors(containerColor = White),
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.whiterussiam),
                                    contentDescription = "",
                                    modifier = Modifier.size(95.dp, 75.dp)
                                )
                                Spacer(modifier = Modifier.padding(bottom = 16.dp))
                                Text(
                                    text = "Латте",
                                    fontFamily = dmsansFamily,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 7.dp, top = 11.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "100₽",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = poppinsFamily
                                )
                            }
                        }
                        Spacer(modifier = Modifier.padding(bottom = 17.dp))

                        Card(
                            modifier = Modifier
                                .size(154.dp, 164.dp)
                                .clip(RoundedCornerShape(15.dp)),
                            colors = CardDefaults.cardColors(containerColor = White),
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 9.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.dirt),
                                    contentDescription = "",
                                    modifier = Modifier.size(159.dp, 105.dp)
                                )
                                Spacer(modifier = Modifier.padding(bottom = 0.dp))
                                Text(
                                    text = "Эспрессо",
                                    fontFamily = dmsansFamily,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 7.dp, top = 12.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "100₽",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = poppinsFamily
                                )
                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Card(
                        modifier = Modifier
                            .size(324.dp, 64.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        colors = CardDefaults.cardColors(containerColor = White)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.main),
                                    contentDescription = "",
                                    tint = Black
                                )
                            }
                            IconButton(onClick = {
                                context.startActivity(
                                    Intent(
                                        context,
                                        Reward::class.java
                                    )
                                )
                            }) {
                                Icon(
                                    painterResource(R.drawable.gift),
                                    contentDescription = "",
                                    tint = GreyLighter
                                )
                            }
                            IconButton(onClick = {}) {
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
    }
}