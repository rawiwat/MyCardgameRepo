package com.example.stickmancardbattle.ui_layer.composeui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModel
import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.ui_layer.viewmodel.CardGameViewModel

@Composable
fun Board(
    cardGameViewModel: CardGameViewModel,
) {
    val leader = cardGameViewModel.leader
    val followerFrontLeft by cardGameViewModel.followerFrontLeft.collectAsState()
    val followerFrontRight by cardGameViewModel.followerFrontRight.collectAsState()
    val followerBackLeft by cardGameViewModel.followerBackLeft.collectAsState()
    val followerBackCenter by cardGameViewModel.followerBackCenter.collectAsState()
    val followerBackRight by cardGameViewModel.followerBackRight.collectAsState()
    EntityDisplay(card = leader)
    EntityDisplay(card = followerFrontLeft)
    EntityDisplay(card = followerFrontRight)
    EntityDisplay(card = followerBackLeft)
    EntityDisplay(card = followerBackCenter)
    EntityDisplay(card = followerBackRight)
}

@Composable
fun EntityDisplay(
    card: Card?
) {
    if (card != null) {

        Image(painter = painterResource(id = card.imageId), contentDescription = null)
    }
}