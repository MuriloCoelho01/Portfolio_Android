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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
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
            .verticalScroll(rememberScrollState(0))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 130.dp)


        ) {
            Box() {

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
                    .padding(top = 30.dp)
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

            Text(
                "Sobre",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 20.dp, top = 30.dp)
            )
            Text(modifier = Modifier
                .padding(start = 30.dp, end = 20.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    ) {
                        append(
                            "Sou um desenvolvedor apaixonado por criar soluções" +
                                    " tecnológicas que unem funcionalidade, inovação e " +
                                    "acessibilidade. Acredito que tecnologia deve ser inclusiva, " +
                                    "prática e impactar positivamente a vida das pessoas. Meu objetivo é " +
                                    "construir experiências que combinam design intuitivo com engenharia sólida, " +
                                    "sempre buscando excelência técnica e usabilidade.  \n \n"
                        )
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,

                            )
                    ) {
                        append("Atualmente, estou focado no desenvolvimento mobile")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    ) {
                        append(
                            ", criando aplicativos que oferecem interfaces amigáveis e " +
                                    "alto desempenho. Entre os projetos que desenvolvi, está um app " +
                                    "interativo que ajuda usuários a explorar gêneros de filmes de " +
                                    "forma divertida, além de plataformas educacionais que simulam entrevistas" +
                                    " e oferecem feedback personalizado para desenvolvedores em busca de " +
                                    "aprimoramento profissional. \n\n"
                        )
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,

                            )
                    ) {
                        append("Tenho experiência em gestão de projetos, onde atuei como Product Owner (P.O.), ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White,
                        )
                    ) {
                        append(
                            "coordenando equipes multidisciplinares para garantir que os " +
                                    "projetos fossem entregues com qualidade e alinhados às necessidades dos" +
                                    " usuários e aos objetivos estratégicos. Conduzi iniciativas como o desenvolvimento de " +
                                    "uma plataforma educacional inclusiva, que integra materiais interativos, simulações " +
                                    "práticas e eventos voltados para acessibilidade e diversidade. "
                        )
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,

                            )
                    ) {
                        append(
                            "Minhas responsabilidades incluíram priorização do backlog, " +
                                    "alinhamento com stakeholders e liderança de processos de design e " +
                                    "desenvolvimento. \n\n"
                        )
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 14.sp,
                            color = Color.White,
                        )
                    ) {
                        append(
                            "No meu tempo livre, gosto de jogar" +
                                    " basquete, explorar novas tecnologias e transformar ideias em " +
                                    "projetos que gerem impacto. Sou movido pela curiosidade e pelo desejo constante d" +
                                    "oe aprender e inovar. "
                        )
                    }
                }
            )

            Text(
                "Experiência",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 20.dp, top = 30.dp)
            )

            Box(
                modifier = Modifier
                    .border(2.5.dp, color = Color(0xff0A22BE) )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(R.drawable.logo_de),
                        contentDescription = "",
                        modifier = Modifier
                            .size(185.dp)

                    )
                    Row {
                        Text(
                            "Jul 2022 - Out - 2023  ",
                            fontSize = 14.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            "   Jovem aprendiz | Porto Seguro",
                            fontSize = 14.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Text(
                        "Suporte e assistência ao sênior, colaboração no desenvolvimento " +
                                "e implementação de projetos, para melhorar prazos e qualidade dos " +
                                "serviços da área. Utilizei Python para automatizar e manipular bases" +
                                " de dados, além de criar dashboards gerenciais de projetos e de toda a" +
                                " área no Power BI."
                    )
                }
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