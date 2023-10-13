package com.example.stickmancardbattle.data_layer.model

class TheKing:Card(
    id = 1,
    name = "The King",
    power = 7,
    def = 7,
    type = CardType.ENTITY,
    race = CardRace.KNIGHT,
    cardText = "ACTIVE:once per turn summon a Knight Entity from your deck\nPASSIVE:during your turn ALL your Knight Follower gain power+1",
    imageId = 1,
    onPlaceAbility = {  },
    activatedAbility = {  },
    passiveAbility = {  },
) {

}