package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview(showSystemUi = true)
@Composable
fun ButtonsPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        FilledButtonExample()
        ElevatedButtonExample()
        FilledTonalButtonExample()
        OutLineButtonExample()
        TextButtonExample()

    }
}

@Composable
fun FilledButtonExample() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Filled Button")
    }
}

@Composable
fun FilledTonalButtonExample() {
    FilledTonalButton(onClick = { /*TODO*/ }) {
        Text(text = "Filled Tonal Button")
    }
}

@Composable
fun OutLineButtonExample() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Outline Button")
    }
}

@Composable
fun ElevatedButtonExample() {
    androidx.compose.material3.ElevatedButton(onClick = { /*TODO*/ }) {
        Text(text = "Elevated Button")
    }
}

@Composable
fun TextButtonExample() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Text Button")
    }
}