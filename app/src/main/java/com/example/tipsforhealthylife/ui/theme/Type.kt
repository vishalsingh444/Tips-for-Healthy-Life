package com.example.tipsforhealthylife.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tipsforhealthylife.R

val Ubuntu = FontFamily(
    Font(R.font.ubuntu_bold,FontWeight.Bold),
    Font(R.font.ubuntu_regular, FontWeight.Normal),
)
val UbuntuItalic = FontFamily(
    Font(R.font.ubuntu_bold_italic, FontWeight.Bold)
)
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        fontFamily = UbuntuItalic,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    body1 =  TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)