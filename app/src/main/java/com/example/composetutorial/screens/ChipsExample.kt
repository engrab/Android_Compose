package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
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
fun ChipsExample() {


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        AssistChipExample()
        InputChipExample()
        FilterChipExample()
        SuggestionChipExample()
        ElevatedAssistChipExample()
        ElevatedFilterChipExample()
        ElevatedSuggestionChipExample()

    }

}

@Composable
fun ElevatedSuggestionChipExample() {

    SuggestionChip(
        onClick = { /*TODO*/ },
        label = {
            Text(text = "Elevated Suggestion Chip")
        },
        icon = {
            Icon(Icons.Default.Check, contentDescription = null )
        },
        elevation = SuggestionChipDefaults.elevatedSuggestionChipElevation()
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElevatedFilterChipExample() {
    var select by remember {
        mutableStateOf(false)
    }
    ElevatedFilterChip(
        selected = select,
        onClick = { select = !select },
        label = {
            Text(text = "Elevated Filter Chip")
        },
        leadingIcon = {
            if (select)
            Icon(Icons.Default.Check, contentDescription = "" )
            else null
        },
        elevation = FilterChipDefaults.elevatedFilterChipElevation()
    )

}

@Composable
fun ElevatedAssistChipExample() {
    AssistChip(
        onClick = { /*TODO*/ },
        label = {
            Text(text = "Elevated Assist Chip")
        },
//        leadingIcon = {
//            Icon(Icons.Default.Check, contentDescription = null )
//        },
        elevation = AssistChipDefaults.elevatedAssistChipElevation()


    )

}

@Composable
fun SuggestionChipExample() {

    SuggestionChip(
        onClick = { /*TODO*/ },
        label = {
            Text(text = "Suggestion Chip")
        },
        icon = {
            Icon(Icons.Default.Check, contentDescription = null )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterChipExample() {

    var select by remember {
        mutableStateOf(false)
    }
    FilterChip(
        selected = select,
        onClick = {
            select = !select

        },
        label = {
            Text(text = "Filter Chip")
        },
        leadingIcon = {
            if (select){
                Icon(Icons.Default.Check, contentDescription = null )
            }else null
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputChipExample() {

    InputChip(
        selected = true,
        onClick = { /*TODO*/ },
        label = { Text(text = "Input Chip") }
    )

}

@Composable
fun AssistChipExample() {

    AssistChip(
        onClick = { /*TODO*/ },
        label = {
            Text(text = "Assist Chip")
        },
        leadingIcon = {
            Icon(Icons.Default.Check, contentDescription = null )
        }

    )
}
