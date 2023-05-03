package com.example.tipsforhealthylife

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tipsforhealthylife.data.TipInfo
import com.example.tipsforhealthylife.data.tips
import com.example.tipsforhealthylife.ui.theme.NavyBlue
import com.example.tipsforhealthylife.ui.theme.TipsForHealthyLifeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipsForHealthyLifeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TipsForHealthyLifeApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TipsForHealthyLifeApp(){
    Scaffold (
        topBar = {
            TipsForHealthyLifeTopAppBar()
        }
    ){
        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)){
            items(tips){
                TipsCard(tip = it)
            }
        }
    }

}

@Composable
fun TipsForHealthyLifeTopAppBar(modifier:Modifier = Modifier){
    Box(modifier = modifier
        .fillMaxWidth()
        .height(56.dp)
        .background(color = MaterialTheme.colors.background),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onSurface
        )
    }
}

@Composable
fun TipsCard(tip:TipInfo,modifier:Modifier = Modifier){
    var expand by remember {
        mutableStateOf(false)
    }
    val color by animateColorAsState(
        targetValue = if(expand) MaterialTheme.colors.secondaryVariant else MaterialTheme.colors.surface
    )
    Card(
        modifier = modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { expand = !expand },
        elevation = 8.dp,
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
                .background(color = color)
        ){
            Text(
                text = stringResource(id = tip.titleId),
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(
                    top = 8.dp,
                    start = 16.dp,
                    end = 16.dp
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = tip.imageId) ,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 16.dp,end = 16.dp, bottom = 16.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
            )

            if(expand){
                val descriptionId = stringResource(id = tip.descriptionId)
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                        buildAnnotatedString {
                                     withStyle(style = ParagraphStyle(lineHeight = 20.sp)){
                                         append(descriptionId)
                                     }
                        }
                    ,
                    style = MaterialTheme.typography.h3,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TipsForHealthyLifePreview(){
    TipsForHealthyLifeTheme(darkTheme = true) {
        TipsForHealthyLifeApp()
    }
}
@Preview(showSystemUi = true)
@Composable
fun TipsForHealthyLifeLightPreview(){
    TipsForHealthyLifeTheme(darkTheme = false) {
        TipsForHealthyLifeApp()
    }
}