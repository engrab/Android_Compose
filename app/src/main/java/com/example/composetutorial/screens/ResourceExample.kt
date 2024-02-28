package com.example.composetutorial.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.R

@RequiresApi(Build.VERSION_CODES.Q)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ResourceExample() {
    val qwitcherGrypenFamily = FontFamily(
        Font(R.font.exo_thin_italic, FontWeight.Normal)
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        StringRes()
        NewStringRes()
        Divider(
            color = colorResource(id = R.color.teal_700)
        )
        Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null )
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null )

//        Text(text = "Exo 2 Thin Italic", fontFamily = qwitcherGrypenFamily)
    }

}

@Composable
fun NewStringRes() {

    Text(text = stringResource(id = R.string.congr, "New Year", 2024))
}

@Composable
fun StringRes() {

    Text(text = stringResource(id = R.string.demo_text))
}
