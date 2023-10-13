package com.example.stickmancardbattle.data_layer.model.knight

import com.example.stickmancardbattle.data_layer.model.Card
import com.example.stickmancardbattle.data_layer.model.CardRace
import com.example.stickmancardbattle.data_layer.model.CardType

class ShieldKnight: Card(
    id = 2,
    name = "Shielded Knight",
    power = 2,
    def = 3,
    cardText = "",
    race = CardRace.KNIGHT,
    type = CardType.ENTITY,
    level = 0,
    imageId = 1
)