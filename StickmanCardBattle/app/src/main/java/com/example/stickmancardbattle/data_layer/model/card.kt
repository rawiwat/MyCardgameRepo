package com.example.stickmancardbattle.data_layer.model

open class Card(
    val id: Int,
    val name: String,
    val power: Int,
    val def: Int,
    val type: CardType,
    val race: CardRace,
    val cardText: String,
    val imageId: Int,
    val level: Int
)

enum class CardType {
    ENTITY,
    ACTION,
    LOCATION,
    LEADER
}
enum class CardRace {
    KNIGHT,
    ORC,
    MYSTIC
}