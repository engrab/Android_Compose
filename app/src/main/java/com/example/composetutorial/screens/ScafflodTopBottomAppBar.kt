package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SimpleTopAppBar() {

    val scrollBehaviour = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(text = "Top App Bar")
                },
                navigationIcon = {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                },
                actions = {

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Edit, contentDescription = "Edit")
                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.AccountBox, contentDescription = "Account")
                    }
                },
                scrollBehavior = scrollBehaviour
            )
        },
        bottomBar = {
            BottomAppBar(actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Home, contentDescription = "Home")
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Check, contentDescription = "check out")
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.AddCircle, contentDescription = "Circle")
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Create, contentDescription = "Create")
                }
            },
                floatingActionButton = {
                    FloatingActionButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Add, contentDescription = "Add Floating")
                    }
                })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Add, contentDescription = "addition of number")
            }
        },
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ScaffoldCenterExample() {

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Check, contentDescription = "check out")
                    }

                },
                navigationIcon = {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "Menu"
                    )
                },
                title = {
                    Text(text = "Center Align Top App Bar")
                },
                scrollBehavior = scrollBehavior
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Home, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Edit, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.List, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Person, contentDescription = null)
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Add, contentDescription = null)
                    }
                })
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ScaffoldMediumExample() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    Scaffold(
        topBar = {
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                actions = {

                          IconButton(onClick = { /*TODO*/ }) {
                              Icon(Icons.Default.Edit, contentDescription = null)

                          }
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Menu , contentDescription = "Menu")
                    }
                },
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Medium Top App Bar")
                },
                scrollBehavior = scrollBehavior)
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Home, contentDescription = null )
                    }
                     IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Person, contentDescription = null )
                    }
                     IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Done, contentDescription = null )
                    }
                     IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Favorite, contentDescription = null )
                    }

                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Add, contentDescription = null )
            }
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ScaffoldLargeExample() {

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        topBar = {
            LargeTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Person, contentDescription = null)
                    }

                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Menu, contentDescription = null)
                    }
                },
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Large Top App Bar")
                 },
                scrollBehavior = scrollBehavior
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Home, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.List, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Check, contentDescription = null)
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Add, contentDescription = null)
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