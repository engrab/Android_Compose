package com.example.composetutorial.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyColumnExample() {

    LazyColumn(content = {
        items(DataObj.dataList) {
            RowItem(dataModel = it)
        }
    })

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyGridColumnExample() {
    LazyVerticalGrid(
        contentPadding = PaddingValues(horizontal = 5.dp,
            vertical = 5.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        columns = GridCells.Fixed(2)
        , content = {
            items(DataObj.dataList){
                RowItem(dataModel = it)
            }
        })
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LazyColumnStagExample() {

    LazyVerticalStaggeredGrid(

        verticalItemSpacing = 5.dp,
        contentPadding = PaddingValues(5.dp),
        columns = StaggeredGridCells.Adaptive(minSize = 150.dp),
        content = {
            items(DataObj.dataList){
                RowItem(dataModel = it)
            }
        }
    ) }

@Composable
fun RowItem(dataModel: DataObj.DataModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {

//        AsyncImage(
//            model = rememberAsyncImagePainter(model = dataModel.image),
//            modifier = Modifier.size(30.dp),
//
//            contentDescription = null
//            // ...
//        )

        Image(
            painterResource(id = dataModel.image), contentDescription = null,
            contentScale = ContentScale.FillHeight)
//        Text(text = dataModel.name)
    }
}


object DataObj {

    data class DataModel(
        @DrawableRes val image: Int,
        val name: String

    )

    val dataList = listOf<DataModel>(
        DataModel(
            R.drawable.image1, "image 1"
        ),
        DataModel(
            R.drawable.image2, "image 2"
        ),
        DataModel(
            R.drawable.image3, "image 3"
        ),
        DataModel(
            R.drawable.image4, "image 4"
        ),
        DataModel(
            R.drawable.image5, "image 5"
        ),
        DataModel(
            R.drawable.image6, "image 6"
        ),
        DataModel(
            R.drawable.image7, "image 7"
        ),
        DataModel(
            R.drawable.image8, "image 8"
        ),
        DataModel(
            R.drawable.image9, "image 9"
        ),
        DataModel(
            R.drawable.image10, "image 10"
        ),
        DataModel(
            R.drawable.image11, "image 11"
        ),
        DataModel(
            R.drawable.image12, "image 12"
        ),
        DataModel(
            R.drawable.image13, "image 13"
        ),
        DataModel(
            R.drawable.image14, "image 14"
        ),
        DataModel(
            R.drawable.image15, "image 15"
        ),
        DataModel(
            R.drawable.image16, "image 16"
        ),
        DataModel(
            R.drawable.image17, "image 17"
        ),
        DataModel(
            R.drawable.image18, "image 18"
        ),
        DataModel(
            R.drawable.image19, "image 19"
        ),
        DataModel(
            R.drawable.image20, "image 20"
        ),
        DataModel(
            R.drawable.image21, "image 21"
        ),
        DataModel(
            R.drawable.image22, "image 22"
        ),
        DataModel(
            R.drawable.image23, "image 23"
        ),
        DataModel(
            R.drawable.image24, "image 24"
        ),
        DataModel(
            R.drawable.image25, "image 25"
        ),
        DataModel(
            R.drawable.image26, "image 26"
        ),
        DataModel(
            R.drawable.image27, "image 27"
        ),
        DataModel(
            R.drawable.image28, "image 28"
        ),
        DataModel(
            R.drawable.image29, "image 29"
        ),
        DataModel(
            R.drawable.image30, "image 30"
        )

        )

}