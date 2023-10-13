package com.example.stickmancardbattle.ui_layer.composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stickmancardbattle.R
import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.data_layer.model.CardType
import com.example.stickmancardbattle.data_layer.model.knight.TheKing
import com.example.stickmancardbattle.ui_layer.viewmodel.CardOnFieldViewModel
import com.example.stickmancardbattle.ui_layer.viewmodel.HandViewModel

@Composable
fun Board(
    cardZoneViewModel: HandViewModel,
) {
    val leader = cardZoneViewModel.leader
    val followerFrontLeft by cardZoneViewModel.followerFrontLeft.collectAsState()
    val followerFrontRight by cardZoneViewModel.followerFrontRight.collectAsState()
    val followerBackLeft by cardZoneViewModel.followerBackLeft.collectAsState()
    val followerBackCenter by cardZoneViewModel.followerBackCenter.collectAsState()
    val followerBackRight by cardZoneViewModel.followerBackRight.collectAsState()
    EntityOnField(card = leader)
    EntityOnField(card = followerFrontLeft)
    EntityOnField(card = followerFrontRight)
    EntityOnField(card = followerBackLeft)
    EntityOnField(card = followerBackCenter)
    EntityOnField(card = followerBackRight)
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun EntityOnField(
    card: Card?
) {
    val cardWidth = 87.dp
    val cardHeight = 115.dp
    val statsFont = FontFamily(Font(R.font.impact))
    val viewModel = CardOnFieldViewModel(card)
    if (card != null) {
        val cardFrame =
            when(card.type) {
                CardType.LEADER -> R.drawable.leader_card_frame
                else -> R.drawable.entity_card_frame
            }

        Box(
            modifier = Modifier
                .width(cardWidth)
                .height(cardHeight)
        ) {
            Image(
                painter = painterResource(id = card.imageId),
                contentDescription = null,
                modifier = Modifier
                    .width(cardWidth)
                    .height(cardHeight)
            )

            Image(
                painter = painterResource(id = cardFrame),
                contentDescription = null,
                modifier = Modifier
                    .width(cardWidth)
                    .height(cardHeight)
            )
            Box(
                modifier = Modifier
                    .width(cardWidth)
                    .padding(top = 70.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = card.name,
                    fontSize = 9.sp,
                    style = MaterialTheme.typography.headlineLarge
                )
            }
            Box(
                modifier = Modifier
                    .padding(start = 47.dp)
                    .size(width = 40.dp, height = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = card.race.name,
                    fontSize = 9.sp,
                    style = MaterialTheme.typography.headlineLarge
                )
            }

            Box(
                modifier = Modifier
                    .width(cardWidth)
                    .padding(top = 80.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(modifier = Modifier) {
                        Text(
                            text = "Power:${card.power}",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                            ),
                            fontFamily = statsFont
                        )

                        Text(
                            text = "Power:${card.power}",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                drawStyle = Stroke(
                                    width = 2f
                                ),
                                color = Color.Red
                            ),
                            fontFamily = statsFont
                        )
                    }

                    Box(modifier = Modifier) {
                        Text(
                            text = "Defense:${card.def}",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                            ),
                            fontFamily = statsFont
                        )
                        Text(
                            text = "Defense:${card.def}",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                drawStyle = Stroke(
                                    width = 2f
                                ),
                                color = Color.Blue
                            ),
                            fontFamily = statsFont
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewKing() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        EntityOnField(card = TheKing())
    }
}