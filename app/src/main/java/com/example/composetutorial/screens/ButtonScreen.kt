package com.example.composetutorial.screens

import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FilledButtonExample() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Filled Button")
    }
}

@Preview
@Composable
fun FilledTonalButtonExample() {
    FilledTonalButton(onClick = { /*TODO*/ }) {
        Text(text = "Filled Tonal Button")
    }
}

@Preview
@Composable
fun OutLineButtonExample() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Outline Button")
    }
}

@Preview
@Composable
fun ElevatedButtonExample() {
    androidx.compose.material3.ElevatedButton(onClick = { /*TODO*/ }) {
        Text(text = "Elevated Button")
    }
}

@Preview
@Composable
fun TextButtonExample() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Text Button")
    }
}