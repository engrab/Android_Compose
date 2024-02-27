package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Preview(showSystemUi = true)
@Composable
fun NavigationDrawerExample() {

    var selected by remember {
        mutableStateOf(false)
    }
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Text(text = "Drawer Title", modifier = Modifier
                    .fillMaxWidth()
                    .padding(50.dp),
                    textAlign = TextAlign.Center)
                Divider(
                    thickness = 2.dp,
                    color = MaterialTheme.colorScheme.primary
                )
                NavigationDrawerItem(
                    label = { Text(text = "Drawer Item") },
                    selected = selected,
                    onClick = { }
                )
            }
        },
        gesturesEnabled = true,
        drawerState = DrawerState(initialValue = drawerState.currentValue)
    ) {

        Scaffold(
            floatingActionButton = {
                ExtendedFloatingActionButton(
                    text = {
                        Text(text = "Open Drawer")
                    },
                    icon = { Icon(Icons.Default.Add, contentDescription = null) },
                    onClick = {
                        scope.launch {

                            drawerState.apply {
                                if (isClosed) open() else close()
                            }
                        }
                    }
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {

            }
        }
    }

}