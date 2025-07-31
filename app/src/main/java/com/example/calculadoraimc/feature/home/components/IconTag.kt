package com.example.calculadoraimc.feature.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme
import com.example.calculadoraimc.ui.theme.WhiteTag

@Composable
fun IconTag(
    icon: ImageVector,
    contentDescription: String,
    circleColor: Color = WhiteTag,
    iconColor: Color = Color.Black,
    circleSize: Dp = 44.dp,
    iconSize: Dp = 24.dp
) {
    // Circulo
    Box(
        modifier = Modifier
            .size(circleSize)
            .clip(CircleShape)
            .background(circleColor),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(iconSize),
            tint = iconColor
        )
    }
}

@Preview
@Composable
private fun IconTagPreview() {
    CalculadoraIMCTheme {
        IconTag(
            icon = Icons.Rounded.FavoriteBorder,
            contentDescription = "Favorite icon"
        )
    }
}