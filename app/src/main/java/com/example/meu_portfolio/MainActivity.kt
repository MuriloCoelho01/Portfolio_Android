package com.example.meu_portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meu_portfolio.ui.theme.Meu_portfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Meu_portfolioTheme {
                Inicio(

                )
            }
        }
    }
}


@Composable
fun Inicio() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xff0F172A))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)

        ) {
       Box(){

           Box(
               modifier = Modifier
                   .size(width = 170.dp, height = 170.dp)
                   .border(5.dp, color = Color(0xff0A22BE))
           )
           Image(
               painter = painterResource(R.drawable.foto_murilo),
               contentDescription = "foto Murilo",
               modifier = Modifier
                   .size(width = 170.dp, height = 170.dp)
                   .offset(x = -20.dp, y = -20.dp)
           )

       }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Meu_portfolioTheme {

    }
}