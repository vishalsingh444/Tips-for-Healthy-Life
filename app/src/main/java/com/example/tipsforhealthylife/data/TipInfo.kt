package com.example.tipsforhealthylife.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.tipsforhealthylife.R

data class TipInfo(
    @StringRes val titleId:Int,
    @DrawableRes val imageId: Int,
    @StringRes val descriptionId: Int
)
 val tips = listOf(
     TipInfo(titleId = R.string.day1, imageId = R.drawable.day1, descriptionId = R.string.description1),
     TipInfo(titleId = R.string.day2, imageId = R.drawable.day2, descriptionId = R.string.description2),
     TipInfo(titleId = R.string.day3, imageId = R.drawable.day3, descriptionId = R.string.description3),
     TipInfo(titleId = R.string.day4, imageId = R.drawable.day4, descriptionId = R.string.description4),
     TipInfo(titleId = R.string.day5, imageId = R.drawable.day5, descriptionId = R.string.description5),
     TipInfo(titleId = R.string.day6, imageId = R.drawable.day6, descriptionId = R.string.description6),
     TipInfo(titleId = R.string.day7, imageId = R.drawable.day7, descriptionId = R.string.description7),
     TipInfo(titleId = R.string.day8, imageId = R.drawable.day8, descriptionId = R.string.description8),
     TipInfo(titleId = R.string.day9, imageId = R.drawable.day9, descriptionId = R.string.description9),
     TipInfo(titleId = R.string.day10, imageId = R.drawable.day10, descriptionId = R.string.description10),
     TipInfo(titleId = R.string.day11, imageId = R.drawable.day11, descriptionId = R.string.description11),
     TipInfo(titleId = R.string.day12, imageId = R.drawable.day12, descriptionId = R.string.description12),
     TipInfo(titleId = R.string.day13, imageId = R.drawable.day13, descriptionId = R.string.description13),
     TipInfo(titleId = R.string.day14, imageId = R.drawable.day14, descriptionId = R.string.description14),
     TipInfo(titleId = R.string.day15, imageId = R.drawable.day15, descriptionId = R.string.description15),
     TipInfo(titleId = R.string.day16, imageId = R.drawable.day16, descriptionId = R.string.description16),
     TipInfo(titleId = R.string.day17, imageId = R.drawable.day17, descriptionId = R.string.description17),
     TipInfo(titleId = R.string.day18, imageId = R.drawable.day18, descriptionId = R.string.description18),
     TipInfo(titleId = R.string.day19, imageId = R.drawable.day19, descriptionId = R.string.description19),
     TipInfo(titleId = R.string.day20, imageId = R.drawable.day20, descriptionId = R.string.description20),
     TipInfo(titleId = R.string.day21, imageId = R.drawable.day21, descriptionId = R.string.description21),
     TipInfo(titleId = R.string.day22, imageId = R.drawable.day22, descriptionId = R.string.description22),
     TipInfo(titleId = R.string.day23, imageId = R.drawable.day23, descriptionId = R.string.description23),
     TipInfo(titleId = R.string.day24, imageId = R.drawable.day24, descriptionId = R.string.description24),
     TipInfo(titleId = R.string.day25, imageId = R.drawable.day25, descriptionId = R.string.description25),
     TipInfo(titleId = R.string.day26, imageId = R.drawable.day26, descriptionId = R.string.description26),
     TipInfo(titleId = R.string.day27, imageId = R.drawable.day27, descriptionId = R.string.description27),
     TipInfo(titleId = R.string.day28, imageId = R.drawable.day28, descriptionId = R.string.description28),
     TipInfo(titleId = R.string.day29, imageId = R.drawable.day29, descriptionId = R.string.description29),
     TipInfo(titleId = R.string.day30, imageId = R.drawable.day30, descriptionId = R.string.description30),
 )