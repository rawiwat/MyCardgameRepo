package com.example.stickmancardbattle.ui_layer.viewmodel

import androidx.lifecycle.ViewModel
import com.example.stickmancardbattle.data_layer.data_structure.Deck
import com.example.stickmancardbattle.data_layer.model.Card
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GameViewModel(
    chosenLeader:Card
): ViewModel() {
    private val deck = Deck()
    private val hand = mutableListOf<Card>()
    private val underWorld = mutableListOf<Card>()
    val leader = chosenLeader
    private val _followerFrontLeft = MutableStateFlow<Card?>(null)
    val followerFrontLeft: StateFlow<Card?> = _followerFrontLeft
    private val _followerFrontRight = MutableStateFlow<Card?>(null)
    val followerFrontRight: StateFlow<Card?> = _followerFrontRight
    private val _followerBackLeft = MutableStateFlow<Card?>(null)
    val followerBackLeft: StateFlow<Card?> = _followerBackLeft
    private val _followerBackCenter = MutableStateFlow<Card?>(null)
    val followerBackCenter: StateFlow<Card?> = _followerBackCenter
    private val _followerBackRight = MutableStateFlow<Card?>(null)
    val followerBackRight: StateFlow<Card?> = _followerBackRight
}