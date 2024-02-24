package com.example.composetutorial.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
fun ButtonsPreview() {

    /*onClick: The function called when the user presses the button.
    enabled: When false, this parameter causes the button to appear unavailable and inactive.
    colors: An instance of ButtonColors that determines the colors used in the button.
    contentPadding: The padding within the button.
*/
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
        DisableButtonExample()
        ColorButtonExample()
        ShapeButtonExample()
        ElevationButtonExample()
        BorderStrokeButtonExample()





    }
}

@Composable
fun BorderStrokeButtonExample() {
    Button(border = BorderStroke(2.dp, color = Color.Green),
        onClick = { /*TODO*/ }) {
        Text(text = "Border Stroke Button")
    }
}

@Composable
fun ElevationButtonExample() {

    Button(elevation = ButtonDefaults.buttonElevation(defaultElevation = 20.dp),
        onClick = { /*TODO*/ }) {
        Text(text = "Button Elevation")
    }
}

@Composable
fun ShapeButtonExample() {

    Button(shape = ButtonDefaults.elevatedShape, onClick = { /*TODO*/ }) {
        Text(text = "Shaped Button")
    }
}

@Composable
fun ColorButtonExample() {

    Button(colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error), onClick = { /*TODO*/ }) {
        Text(text = "Color Button")
    }
}

@Composable
fun DisableButtonExample() {
    Button(enabled = false, onClick = {/*TODO*/ }) {
        Text(text = "Disable Button")
    }
}

@Composable
fun FilledButtonExample() {
    Button(
        onClick = { /*TODO*/ }) {
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