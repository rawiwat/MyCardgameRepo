package com.example.stickmancardbattle.data_layer.model.knight

import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.data_layer.model.CardRace
import com.example.stickmancardbattle.data_layer.model.CardType

class FootSoldier:Card(
    id = 3,
    name = "Foot Soldier",
    power = 3,
    def = 2,
    cardText = "",
    race = CardRace.KNIGHT,
    type = CardType.ENTITY,
    level = 0,
    imageId = 1
)