package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun SwitchExample() {

    /*
    See the Switch reference for a full API definition. The following are some of the key parameters you might need to use:

    checked: The initial state of the switch.
    onCheckedChange: A callback that is called when the state of the switch changes.
    enabled: Whether the switch is enabled or disabled.
    colors: The colors used for the switch.

    Advanced implementation
            The primary parameters you might want to use when implementing a more advanced switch are the following:

    thumbContent: Use this to customize the appearance of the thumb when it is checked.
    colors: Use this to customize the color of the track and thumb.

    */

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SwitchWithOutIcon()
        SwitchWithIcon()
    }

}

@Composable
fun SwitchWithIcon() {


    var check by remember {
        mutableStateOf(false)
    }

    Switch(checked = check,
        onCheckedChange = {
            check = it
        },
        thumbContent = {
            if (check) {

                Icon(Icons.Default.Check, contentDescription = "checkd")
            } else {
                null
            }
        },
        colors = SwitchDefaults.colors(
            checkedThumbColor = MaterialTheme.colorScheme.primary,
            checkedTrackColor = MaterialTheme.colorScheme.secondaryContainer
        )
    )
}

@Composable
fun SwitchWithOutIcon() {

    var check by remember {
        mutableStateOf(false)
    }
    Switch(
        checked = check,
        onCheckedChange = {
            check = it
        }
    )
}
