package com.owlbuddy.www.jetpackcomposeguide.button

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonExample(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        IconButton(
            onClick = {
                Toast.makeText(context,"Button Clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
           Icon(
               modifier = Modifier.size(60.dp),
               imageVector = Icons.Default.Home,
               contentDescription = "Home icon"
           )
        }

    }
}



@Preview
@Composable
fun IconButtonExamplePreview(){
    IconButtonExample()
}