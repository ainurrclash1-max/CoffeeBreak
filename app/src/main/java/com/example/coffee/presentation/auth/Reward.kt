package com.example.coffee.presentation.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.GreyLight
import com.example.coffee.ui.theme.GreyLighter
import com.example.coffee.ui.theme.MaybeBlack
import com.example.coffee.ui.theme.NoName
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.dmsansFamily
import com.example.coffee.ui.theme.poppinsFamily
import com.example.coffee.ui.theme.robotoFamily

class Reward : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RewardScreen()
        }
    }
}

@Preview
@Composable
fun RewardScreen(){
    Column(modifier = Modifier.fillMaxSize()
        .padding(top = 50.dp, )
        .background(color = White),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Вознаграждение",
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = MaybeBlack
        )
        Spacer(modifier = Modifier.padding(bottom = 31.dp))
        Image(painterResource(R.drawable.hmmm),
            contentDescription = "")
        Spacer(modifier = Modifier.padding(bottom = 31.dp))
        Card(modifier = Modifier.size(325.dp, 108.dp),
            colors = CardDefaults.cardColors(containerColor = NoName)) {
            Row(modifier = Modifier.fillMaxSize()
                .padding(start = 30.dp, end = 20.dp, top = 25.dp, bottom = 23.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween){
                Column {
                    Text(text = "Мои баллы:",
                        fontSize = 14.sp,
                        fontFamily = dmsansFamily,
                        fontWeight = FontWeight.Medium,
                        color = GreyLighter
                    )
                    Text(text = "240",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 25.sp,
                        color = GreyLight
                    )
                }
                Spacer(modifier = Modifier.padding(end = 84.dp))
                }
            }
        }
    }
}