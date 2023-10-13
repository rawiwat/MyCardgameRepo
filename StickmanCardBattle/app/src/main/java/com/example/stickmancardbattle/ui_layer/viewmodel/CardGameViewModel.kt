package com.example.stickmancardbattle.ui_layer.viewmodel

import androidx.lifecycle.ViewModel
import com.example.stickmancardbattle.data_layer.data_structure.Deck
import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.domain_layer.FieldZoneForEntity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CardGameViewModel(
    cardList: List<Card>,
    chosenLeader: Card
) :ViewModel() {
    private val deck = Deck()
    private val hand = mutableListOf<Card>()
    private val underWorld = mutableListOf<Card>()
    val leader = chosenLeader
    private val _followerFrontLeft = MutableStateFlow<Card?>(null)
    val followerFrontLeft:StateFlow<Card?> = _followerFrontLeft
    private val _followerFrontRight = MutableStateFlow<Card?>(null)
    val followerFrontRight:StateFlow<Card?> = _followerFrontRight
    private val _followerBackLeft = MutableStateFlow<Card?>(null)
    val followerBackLeft:StateFlow<Card?> = _followerBackLeft
    private val _followerBackCenter = MutableStateFlow<Card?>(null)
    val followerBackCenter:StateFlow<Card?> = _followerBackCenter
    private val _followerBackRight = MutableStateFlow<Card?>(null)
    val followerBackRight:StateFlow<Card?> = _followerBackRight


    fun draw(amount:Int) {
        repeat(amount) {
            val topCard = deck.topDeck
            if (topCard != null) {
                deck.remove(topCard)
                hand.add(topCard.card)
            }
        }
    }

    fun turnStart() {
        if (hand.size >= 5) {
            draw(1)
        } else {
            val amount = 5 - hand.size
            draw(amount)
        }
    }

    fun summonFromHand(card: Card,fieldZoneForEntity: FieldZoneForEntity) {
        hand.remove(card)
        when(fieldZoneForEntity) {
            FieldZoneForEntity.FRONT_LEFT ->
                if (_followerFrontLeft.value != null) {
                    underWorld.add(_followerFrontLeft.value!!)
                    _followerFrontLeft.value = card
                } else {
                    _followerFrontLeft.value = card
                }
            FieldZoneForEntity.FRONT_RIGHT ->
                if (_followerFrontRight.value != null) {
                    underWorld.add(_followerFrontRight.value!!)
                    _followerFrontRight.value = card
                } else {
                    _followerFrontRight.value = card
                }
            FieldZoneForEntity.BACK_LEFT ->
                if (_followerBackLeft.value != null) {
                    underWorld.add(_followerBackLeft.value!!)
                    _followerBackLeft.value = card
                } else {
                    _followerBackLeft.value = card
                }
            FieldZoneForEntity.BACK_CENTER ->
                if (_followerBackCenter.value != null) {
                    underWorld.add(_followerBackCenter.value!!)
                    _followerBackCenter.value = card
                } else {
                    _followerBackCenter.value = card
                }
            FieldZoneForEntity.BACK_RIGHT ->
                if (_followerBackRight.value != null) {
                    underWorld.add(_followerBackRight.value!!)
                    _followerBackRight.value = card
                } else {
                    _followerBackRight.value = card
                }
        }
    }

    init {
        for (card in cardList) {
            deck.append(card)
            deck.shuffleDeck(deck)
            draw(5)
        }
    }
}