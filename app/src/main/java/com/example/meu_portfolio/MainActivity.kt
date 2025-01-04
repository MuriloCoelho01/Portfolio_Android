package com.example.meu_portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                .padding(top = 120.dp)

        ) {
       Box(){

           Box(
               modifier = Modifier
                   .size(width = 170.dp, height = 170.dp)
                   .border(8.dp, color = Color(0xff0A22BE), shape = RoundedCornerShape(20.dp))
           )
           Image(
               painter = painterResource(R.drawable.foto_murilo),
               contentDescription = "foto Murilo",
               modifier = Modifier
                   .size(width = 170.dp, height = 170.dp)
                   .offset(x = -20.dp, y = -20.dp)
                   .clip(shape = RoundedCornerShape(20.dp))
           )

       }
            Spacer(
                modifier = Modifier
                    .padding(top = 30.dp)
            )
            Text(
                "Murilo Coelho",
                fontSize = 42.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 20.dp)

            )
            Text(
                "Desenvolvedor Mobile",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 20.dp)
            )
            Text(
                "Crio soluções Mobile acessíveis e gerencio" +
                        "projetos para entregar resultados eficientes e modernos.",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 20.dp)
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                assets(
                    painter = painterResource(R.drawable.github_logo),
                    description = "github assets",
                    link = "https://github.com/MuriloCoelho01"
                )
                assets(
                    painter = painterResource(R.drawable.linkedin_logo),
                    description = "linkedin assets",
                    link = "https://www.linkedin.com/in/murilo-coelho-a13588282/"
                )
            }


        }
    }

}

@Composable
fun assets(painter: Painter, description: String, link: String) {
    val context = LocalContext.current

    Image(
        painter = painter,
        contentDescription = "",
        modifier = Modifier
            .padding(horizontal = 25.dp)
            .size(50.dp)
            .clickable {
                val url = link
                if (url.startsWith("http://") || url.startsWith("https://")) {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    context.startActivity(intent)
                }
            }

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Meu_portfolioTheme {

    }
}