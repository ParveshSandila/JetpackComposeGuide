package com.owlbuddy.www.jetpackcomposeguide.animation

import android.widget.Toast
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random


@Composable
fun CrossFadeAnimationExample(
    modifier: Modifier = Modifier
){

    val listOfColors = listOf(
        "Red",
        "Green",
        "Orange",
        "Yellow",
        "Black",
        "White"
    )

    var selectedColor by remember {
        mutableStateOf(listOfColors.first())
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Crossfade(
            targetState =  selectedColor,
            animationSpec = tween(
                durationMillis = 800,
            )
        ) {
            Text(
                text = it,
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = {
                selectedColor = listOfColors.get(Random.nextInt(listOfColors.size))
            },
        ) {
            Text("Click me")
        }
    }
}

@Preview
@Composable
fun CrossFadeAnimationExamplePreview(){
    CrossFadeAnimationExample()
}