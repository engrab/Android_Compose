package com.example.composetutorial.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun CardScreenExample() {

    OutlinedCard(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        border = BorderStroke(2.dp, color = Color.Magenta)
    ) {

        CardExample()
        ElevatedCardExample()
        OutLinedCardExample()
    }

}

@Composable
fun OutLinedCardExample() {

    OutlinedCard(
        modifier = Modifier.fillMaxWidth().height(200.dp).padding(10.dp),

    ) {
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Red
            ),
            textAlign = TextAlign.Center)
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Red
            ),
            textAlign = TextAlign.Center)
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Red
            ),
            textAlign = TextAlign.Center)
    }
}

@Composable
fun ElevatedCardExample() {

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Blue)
    ) {
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.White
            ),
            textAlign = TextAlign.Center)
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.White
            ),
            textAlign = TextAlign.Center)
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.White
            ),
            textAlign = TextAlign.Center)
    }

}

@Composable
fun CardExample() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),

    ) {
        Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Red
            ),
            textAlign = TextAlign.Center)
         Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Red
            ),
            textAlign = TextAlign.Center)
         Text(text = "This is content of Card",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Red
            ),
            textAlign = TextAlign.Center)

    }
}
