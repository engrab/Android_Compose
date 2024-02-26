package com.example.composetutorial.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun SliderExample() {

/*
    The Slider composable allows users to make selections from a range of values. You might use a slider to let the user do the following:

    Adjust settings that use a range of values, such as volume, and brightness.
    Filter data in a graph, as when setting a price range.
    User input, like setting a rating in a review.
    The slider contains a track, thumb, value label, and tick marks:

    Track: The track is the horizontal bar that represents the range of values the slider can take.
    Thumb: The thumb is a draggable control element on the slider that allows the user to select a specific value within the range defined by the track.
    Tick marks: Tick marks are optional visual markers or indicators that appear along the track of the slider.
    Range slider
            You can also use the dedicated RangeSlider composable. This allows the user to select two values. This can be useful in cases such as when the user wishes to select a minimum and maximum price.

*/
    Column {

        SliderExp()
        RangSliderExp()
    }
}

@Composable
fun RangSliderExp() {


    var sliderPointRange by remember {
        mutableStateOf(0f..100f)
    }

    RangeSlider(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        value =sliderPointRange,
        onValueChange ={
            sliderPointRange = it
        },
        valueRange = 0f..100f,
        steps = 5,
        colors = SliderDefaults.colors(
            thumbColor = MaterialTheme.colorScheme.primary,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            activeTickColor = MaterialTheme.colorScheme.onError
        )
        )

}

@Composable
fun SliderExp() {

    var sliderPositions by remember {
        mutableStateOf(0f)
    }

    Slider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        value = sliderPositions,
        onValueChange = {
            sliderPositions = it
        },
        valueRange = 0f..100f,
        steps = 5,
        colors = SliderDefaults.colors(
            thumbColor = MaterialTheme.colorScheme.primary,
            activeTickColor = MaterialTheme.colorScheme.secondary,
            activeTrackColor = MaterialTheme.colorScheme.inverseOnSurface
        ),
        onValueChangeFinished = {
            // TODO
        },

        )
}
