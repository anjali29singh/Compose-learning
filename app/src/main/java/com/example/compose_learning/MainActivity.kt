package com.example.compose_learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.compose_learning.ui.theme.ComposelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposelearningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),


                ) {
                    Greeting("Android",Modifier.background(MaterialTheme.colorScheme.primary))

                 
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,modifier: Modifier) {

    Text(
                text = "Hello $name!",
                modifier=modifier
            )



}
@Composable
fun CustomText(){

    Text(

        buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                textAlign = TextAlign.Center
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontWeight = FontWeight.Bold
                    )

                ) {
                    append("h")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )

                ) {
                    append("e")
                }
                append("l")
                append("l")
                append("o")
            }
        }
        ,Modifier.width(120.dp)
    )
}



@Composable
fun CustomText2(){
    Text(text = "i love programming".repeat(10), maxLines = 3,overflow = TextOverflow.Clip)

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposelearningTheme {
        Column(Modifier.fillMaxSize()) {
//        Greeting(stringResource(id = R.string.app_name),
//        Modifier.padding(10.dp)
//               )
//
//            Greeting(
//                "anjali singh",
//                Modifier
//                    .padding(10.dp))

        CustomText()
            CustomText2()
        }



    }
}