package com.example.mylittecat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylittecat.ui.theme.MyLitteCatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLitteCatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Cabecalho("laura modesto", cargo = "Neko de um café")
                }
            }
        }
    }
}

@Composable
fun Cabecalho(nomeCompleto: String, cargo: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = nomeCompleto,
            fontSize = 36.sp,
            modifier= Modifier.padding(top = 16.dp),

        )
        Text(text = cargo,
            fontSize = 24.sp,
            modifier= Modifier.padding(top= 8.dp)
        )


    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyLitteCatTheme {
        Cabecalho("Nora hyuki", cargo = "Neko de um café")
    }
}