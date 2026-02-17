package com.example.coffee

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.presentation.auth.Welcome
import com.example.coffee.ui.theme.GreenLight
import com.example.coffee.ui.theme.GreyA
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.dmsansFamily
import com.example.coffee.ui.theme.poppinsFamily
import com.example.coffee.ui.theme.redressedFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Splash()
        }
    }

}


@Composable
fun Splash(){
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(bottom = 98.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = GreenLight)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = GreenLight),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.padding(bottom = 63.dp))
                Image(
                    painter = painterResource(R.drawable.cofee),
                    contentDescription = "",
                    modifier = Modifier.size(98.dp)
                )
                Spacer(modifier = Modifier.padding(bottom = 54.dp))
                Text(
                    text = "Coffee break",
                    fontSize = 64.sp,
                    fontFamily = redressedFamily,
                    fontWeight = FontWeight.Normal,
                    color = White
                )
                Spacer(modifier = Modifier.padding(bottom = 46.dp))
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 25.dp))
        Text(
            text = "Почувствуй себя\nбариста!",
            fontWeight = FontWeight.Medium,
            fontFamily = poppinsFamily,
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        Text(
            text = "Любой кофе под ваш заказ",
            fontFamily = dmsansFamily,
            fontSize = 17.sp,
            fontWeight = FontWeight.Normal,
            color = GreyA
        )
        Button(onClick = { context.startActivity(Intent(context, Welcome::class.java)) }) { }
    }
}