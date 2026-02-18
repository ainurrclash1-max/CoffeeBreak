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
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.innerShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.Black
import com.example.coffee.ui.theme.FearOfTheDark
import com.example.coffee.ui.theme.GreenLight
import com.example.coffee.ui.theme.GreyLighter
import com.example.coffee.ui.theme.NoName
import com.example.coffee.ui.theme.PaleGreyLighter
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.YouSerious
import com.example.coffee.ui.theme.YouThinkItAll
import com.example.coffee.ui.theme.dmsansFamily
import com.example.coffee.ui.theme.montserratFamily
import com.example.coffee.ui.theme.robotoFamily

class Designer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DesignerScreen()
        }
    }
}

@Preview
@Composable
fun DesignerScreen(){
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
                onClick = { context.startActivity(Intent(context, OrderOptionsCap::class.java)) },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.arrowback), contentDescription = ""
                )
            }
            Text(
                text = "Конструктор кофемана",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
            IconButton(
                onClick = {  }, modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    painterResource(R.drawable.cart), contentDescription = ""
                )
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 39.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Выберите бариста",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            IconButton(onClick = { context.startActivity(Intent(context, Barista::class.java)) }) {
                Icon(painterResource(R.drawable.catraarrow2),
                    contentDescription = "")
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 13.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Вид кофе ",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Column(Modifier.fillMaxWidth()) {
                Image(
                    painterResource(R.drawable.bigblueslider),
                    contentDescription = "",
                    modifier = Modifier.size(260.dp, 43.dp),
                )
                Row(Modifier.fillMaxWidth()
                    .padding(start = 11.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "Арабика",
                        fontWeight = FontWeight.Medium,
                        fontFamily = robotoFamily,
                        fontSize = 12.sp,
                        color = GreyLighter
                    )
                    Text(text = "Робуста",
                        fontWeight = FontWeight.Medium,
                        fontFamily = robotoFamily,
                        fontSize = 12.sp,
                        color = GreyLighter
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
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 4.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Сорт кофе",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            IconButton(onClick = {}) {
                Icon(painterResource(R.drawable.catraarrow2),
                    contentDescription = "")
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 3.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 7.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Обжарка",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Row {
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.bonfire),
                        contentDescription = "",
                        tint = GreyLighter
                    )
                }
                IconButton(
                    onClick = {},
                ) {
                    Row {
                        Icon(
                            painterResource(R.drawable.fire2),
                            contentDescription = "",
                            tint = GreyLighter
                        )
                    }
                }
                IconButton(
                    onClick = {},
                ) {
                    Row {
                        Icon(
                            painterResource(R.drawable.fire3),
                            contentDescription = "",
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 7.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Помол",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Row {
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.coffeebean),
                        contentDescription = ""
                    )
                }
                Spacer(Modifier.padding(end = 15.dp))
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.coffeebean),
                        contentDescription = "",
                        tint = GreyLighter,
                        modifier = Modifier.size(27.dp, 34.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 8.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Молоко",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            TextButton(onClick = {}) {
                Text(text = "Выбрать",
                    color = Black,
                    fontWeight = FontWeight.Normal,
                    fontFamily = robotoFamily,
                    fontSize = 14.sp)
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Сироп",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            TextButton(onClick = {}) {
                Text(text = "Выбрать",
                    color = Black,
                    fontWeight = FontWeight.Normal,
                    fontFamily = robotoFamily,
                    fontSize = 14.sp)
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Добавки",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            IconButton(onClick = {}) {
                Icon(painterResource(R.drawable.catraarrow2),
                    contentDescription = "")
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Лед",
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            Row {
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.noice),
                        contentDescription = "",
                        tint = GreyLighter
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.ice1),
                        contentDescription = "",
                        tint = YouThinkItAll
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.ice2),
                        contentDescription = "",
                        tint = GreyLighter
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.ice),
                        contentDescription = "",
                        tint = GreyLighter
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .size(1.dp), colors = CardDefaults.cardColors(
                containerColor = FearOfTheDark
            )) {}
        Spacer(modifier = Modifier.padding(bottom = 14.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 41.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Энциклопедия кофемана",
                color = GreenLight,
                fontWeight = FontWeight.Medium,
                fontFamily = dmsansFamily,
                fontSize = 14.sp
            )
            IconButton(onClick = {}) {
                Icon(
                    painterResource(R.drawable.upcastrarrow),
                    contentDescription = "",
                    tint = GreenLight
                )
            }
        }
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