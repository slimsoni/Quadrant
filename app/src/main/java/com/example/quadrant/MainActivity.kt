package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                Surface {
                    QuadrantText(
                        title = stringResource(R.string.text_composable),
                        description = stringResource(R.string.text_description),
                        title2 = stringResource(R.string.image_composable),
                        description2 = stringResource(R.string.description_img),
                        title3 = stringResource(R.string.row_composable),
                        description3 = stringResource(R.string.description_row),
                        title4 = stringResource(R.string.column_composable),
                        description4 = stringResource(R.string.description_col),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantText(
        title: String,
        description: String,
        title2: String,
        description2: String,
        title3: String,
        description3: String,
        title4: String,
        description4: String,
        modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .weight(1f)
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .background(Color(0xFFEADDFF))
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        )
                )
                Text(
                    text = description,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .background(Color(0xFFD0BCFF))
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Text(
                    text = title2,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        )
                )
                Text(
                    text = description2,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .weight(1f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .background(Color(0xFFB69DF8))
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Text(
                    text = title3,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        )
                )
                Text(
                    text = description3,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Text(
                    text = title4,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        )
                )
                Text(
                    text = description4,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        QuadrantText(
            title = stringResource(R.string.text_composable),
            description = stringResource(R.string.text_description),
            title2 = stringResource(R.string.image_composable),
            description2 = stringResource(R.string.description_img),
            title3 = stringResource(R.string.row_composable),
            description3 = stringResource(R.string.description_row),
            title4 = stringResource(R.string.column_composable),
            description4 = stringResource(R.string.description_col)
        )
    }
}