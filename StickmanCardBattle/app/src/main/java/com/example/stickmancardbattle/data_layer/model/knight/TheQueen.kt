package com.example.stickmancardbattle.data_layer.model.knight

import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.data_layer.model.CardRace
import com.example.stickmancardbattle.data_layer.model.CardType

class TheQueen: Card(
    id = 4,
    name = "The Queen",
    power = 7,
    def = 6,
    cardText = "",
    race = CardRace.KNIGHT,
    type = CardType.ENTITY,
    level = 2,
    imageId = 1
)