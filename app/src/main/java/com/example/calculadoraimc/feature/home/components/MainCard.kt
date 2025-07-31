import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoraimc.feature.home.components.IMCGraphic
import com.example.calculadoraimc.feature.home.components.IconTag
import com.example.calculadoraimc.ui.theme.BlackFont
import com.example.calculadoraimc.ui.theme.BlueColor
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme

@Composable
fun MainCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = BlueColor
        ),
        shape = RoundedCornerShape(
            size = 36.dp
        )
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 32.dp)
                .fillMaxWidth()
        ) {
            // PRIMEIRA COLUNA
            Column(
                modifier = Modifier
                    .padding(end = 8.dp)
            ) {
                // Tag superior
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconTag(
                        icon = Icons.Rounded.FavoriteBorder,
                        contentDescription = "Icone superior"
                    )
                    Text(
                        text = "Seu IMC",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 20.sp
                        ),
                        color = BlackFont,
                        softWrap = false
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "91%",
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 56.sp
                    ),
                    color = BlackFont
                )

                Text(
                    text = "Peso normal",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 24.sp
                    )
                )
            }

            // SEGUNDA COLUNA
            Column(
                modifier = Modifier
                    .padding(start = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                IMCGraphic()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun MainCardPreview() {
    CalculadoraIMCTheme {
        MainCard()
    }
}