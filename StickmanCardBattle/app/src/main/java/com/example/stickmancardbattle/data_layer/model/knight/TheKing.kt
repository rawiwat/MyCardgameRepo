package com.example.stickmancardbattle.data_layer.model.knight

import com.example.stickmancardbattle.R
import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.data_layer.model.CardRace
import com.example.stickmancardbattle.data_layer.model.CardType

class TheKing : Card(
    id = 1,
    name = "The King",
    power = 7,
    def = 7,
    type = CardType.LEADER,
    race = CardRace.KNIGHT,
    cardText = "",
    imageId = R.drawable.card_art_king,
    level = 0,
)