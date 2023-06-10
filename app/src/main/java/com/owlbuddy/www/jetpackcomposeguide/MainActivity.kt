package com.owlbuddy.www.jetpackcomposeguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.owlbuddy.www.jetpackcomposeguide.ui.theme.JetpackComposeGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeGuideTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier
) {
    LazyColumn(
        modifier = modifier,
        horizontalAlignment =  Alignment.CenterHorizontally
    ){
        item {
            Button(
                onClick = {}
            ) {
                Text(text = "Button Examples")
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen(modifier = Modifier.fillMaxSize())
}

@Composable
fun ButtonExamples(
    modifier: Modifier
){

}