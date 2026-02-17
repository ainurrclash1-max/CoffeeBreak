package com.example.coffee.presentation.auth


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee.R
import com.example.coffee.ui.theme.GreenLight
import com.example.coffee.ui.theme.White
import com.example.coffee.ui.theme.robotoFamily
import kotlinx.datetime.Month

class Welcome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SignIn()
        }
    }
}

@Preview
@Composable
fun SignIn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White)
            .padding(horizontal = 48.dp)
    ) {
        Spacer(modifier = Modifier.padding(bottom = 120.dp))
        Text(
            "Войти",
            color = GreenLight,
            fontSize = 22.sp,
            fontFamily = robotoFamily
        )
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        Text(
            "Добро пожаловать",
            fontSize = 14.sp,
            fontFamily = robotoFamily
        )
        Spacer(modifier = Modifier.padding(bottom = 57.dp))
        Row {

            OutlinedTextField(state = rememberTextFieldState())
        }
    }
}