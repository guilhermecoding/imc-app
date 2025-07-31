package com.example.calculadoraimc.feature.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadoraimc.R
import com.example.calculadoraimc.ui.theme.BlueColor
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme
import com.example.calculadoraimc.ui.theme.ColorTester

/**
 * Gráfico de acordo com o índice IMC.
 */
@Composable
fun IMCGraphic(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        IMCGraphicDrawer(24.4)

        Icon(
            modifier = Modifier
                .size(56.dp),
            painter = painterResource(R.drawable.sentiment_satisfied_24px),
            contentDescription = "Icone do gráfico",
            tint = ColorTester
        )
    }
}


@Composable
fun IMCGraphicDrawer(imcPercent: Double) {
    Canvas(
        modifier = Modifier
            .size(220.dp)
            .padding(50.dp)
    ) {
        val size = size.minDimension
        val strokeWidth = 30f

        drawArc(
            color = Color.White.copy(alpha = 0.3f),
            startAngle = 140f,
            sweepAngle = 260f,
            useCenter = false,
            size = Size(size, size),
            style = Stroke(
                width = strokeWidth,
                cap = StrokeCap.Round
            )
        )

        drawArc(
            color = ColorTester,
            startAngle = 140f,
            sweepAngle = 120f,
            useCenter = false,
            size = Size(size, size),
            style = Stroke(
                width = strokeWidth,
                cap = StrokeCap.Round
            )
        )

    }
}

@Preview
@Composable
private fun IMCGraphicPreview() {
    CalculadoraIMCTheme {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .background(BlueColor)
        ) {
            IMCGraphic()
        }
    }
}