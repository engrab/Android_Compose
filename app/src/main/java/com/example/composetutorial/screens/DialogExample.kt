package com.example.composetutorial.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.composetutorial.R

@Preview(showSystemUi = true)
@Composable
fun DialogExample() {

    /*Alert dialog
            The AlertDialog composable provides a convenient API for creating a Material Design themed dialog. AlertDialog has specific parameters for handling particular elements of the dialog. Among them are the following:

    title: The text that appears along the top of the dialog.
    text: The text that appears centered within the dialog.
    icon: The graphic that appears at the top of the dialog.
    onDismissRequest: The function called when the user dismisses the dialog, such as by tapping outside of it.
    dismissButton: A composable that serves as the dismiss button.
    confirmButton: A composable that serves as the confirm button.

    Dialog composable
            Dialog is a basic composable that doesn't provide any styling or predefined slots for content. It is a relatively straightforward container that you should populate with a container such as Card. The following are some of the key parameters of a dialog:

    onDismissRequest: The lambda called when the user closes the dialog.
    properties: An instance of DialogProperties that provides some additional scope for customization.
*/
    val dialgValue = remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AlertDialogExample(onDismissRequest = {
            dialgValue.value = false
        },
            confirmButton = {
                dialgValue.value = false
            },
            dismissButton = {
                dialgValue.value = false
            }
        )

        SimpleDialogExample(onDismiss = {
            dialgValue.value = false
        },
            onConfirm = {
                dialgValue.value = false
            })
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleDialogExample(onDismiss : () -> Unit, onConfirm : () -> Unit) {

    Dialog(
        onDismissRequest = {
            onDismiss()
        }
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            onClick = {

            }
        ) {


            Row(
                modifier = Modifier.fillMaxWidth().align(alignment = Alignment.CenterHorizontally)
                    .padding(10.dp)
            ) {
                IconButton(
                    onClick = {

                    }
                ) {

                    Icon(Icons.Default.Info, contentDescription = "Info" )
                }

                Text(
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "Simple Dialog")
            }


            Image(
                painterResource(id = R.drawable.nature), contentDescription = "Nature image" )



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.End),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                TextButton(

                    onClick = { onDismiss() }) {
                    Text(text = "Dismiss")
                }

                TextButton(
                    onClick = { onConfirm() }) {
                    Text(text = "Confirm")
                }
            }



        }

    }

}

@Composable
fun AlertDialogExample(
    onDismissRequest: () -> Unit, confirmButton: () -> Unit,
    dismissButton: () -> Unit
) {

    AlertDialog(

        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(10.dp),
        text = {
            Text(text = "This is info alert dialog for screen demo")
        },
        title = {
            Text(text = "Info")
        },
        icon = {
            Icon(Icons.Default.Info, contentDescription = "Info")
        },
        dismissButton = {
            Button(onClick = { dismissButton() }) {
                Text(text = "Dismiss")
            }
        },
        onDismissRequest = { onDismissRequest() },
        confirmButton = {
            Button(onClick = { confirmButton() }) {
                Text(text = "Confirm")
            }
        })
}
