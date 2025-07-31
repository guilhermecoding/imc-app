package com.example.calculadoraimc.feature.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadoraimc.R
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme

@Composable
fun MetricCard(modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Altura"
                )

                IconTag(
                    icon = painterResource(R.drawable.weight_24px),
                    contentDescription = "Icone do cara para peso."
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MetricCardPreview() {
    CalculadoraIMCTheme {
        MetricCard()
    }
}