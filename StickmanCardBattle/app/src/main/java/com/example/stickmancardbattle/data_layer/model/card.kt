package com.example.stickmancardbattle.data_layer.model

open class Card(
    val id: Int,
    val name: String,
    val power: Int,
    val def: Int,
    val type: CardType,
    val race: CardRace,
    val cardText: String,
    val onPlaceAbility:()-> Unit,
)

enum class CardType {
    ENTITY,
    ACTION,
    LOCATION
}
enum class CardRace {
    KNIGHT,
    ORC,
    DRAGON
}