package com.example.calculadoraimc.feature.home.view

import MainCard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadoraimc.feature.home.components.MetricCard
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme

@Composable
fun Home() {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            MainCard()

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                MetricCard(Modifier.weight(1f))
                MetricCard(Modifier.weight(1f))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview() {
    CalculadoraIMCTheme {
        Home()
    }
}