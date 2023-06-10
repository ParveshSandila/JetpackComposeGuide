package com.owlbuddy.www.jetpackcomposeguide.button

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleButton(
    modifier: Modifier = Modifier
){
    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Button(
            onClick = {
                Toast.makeText(context,"Button Clicked",Toast.LENGTH_SHORT).show()
            },
        ) {
           Text("Click me")
        }
    }
}

@Preview
@Composable
fun SimpleButtonPreview(){
    SimpleButton()
}