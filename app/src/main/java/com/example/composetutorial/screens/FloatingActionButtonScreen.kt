package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun FloatingActionButtonExample() {


    /*In Material Design, there are four types of FAB:

    FAB: A floating action button of ordinary size.
    Small FAB: A smaller floating action button.
    Large FAB: A larger floating action button.
    Extended FAB: A floating action button that contains more than just an icon.
*/
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        NormalButtonExample()
        SmallButtonExample()
        LargeButtonExample()
        ExtendedButtonExample()
        ShapeActionButtonExample()
        ColorActionButtonExample()
    }

}

@Composable
fun ColorActionButtonExample() {

    FloatingActionButton(

        containerColor = Color.Magenta,
        contentColor = Color.White,
        onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Add, contentDescription = "Color Button" )
    }
}

@Composable
fun ShapeActionButtonExample() {

    FloatingActionButton(

        shape = CircleShape,
        onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Add , contentDescription = "Add Button" )
    }
}

@Composable
fun ExtendedButtonExample() {

    ExtendedFloatingActionButton(

        onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Add, contentDescription = "Extended Floating Action Button" )
        Text(text = "Extended")
    }
}

@Composable
fun LargeButtonExample() {

    LargeFloatingActionButton(

        onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Add, contentDescription = "Large Action Button" )
    }
}

@Composable
fun SmallButtonExample() {
    SmallFloatingActionButton(
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
        onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Add, contentDescription = "Small Action Button" )
    }
}

@Composable
fun NormalButtonExample() {
    FloatingActionButton(
        onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Add, contentDescription = "Normal Action Button" )
    }
}
