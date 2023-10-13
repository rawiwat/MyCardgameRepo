package com.example.stickmancardbattle.data_layer.model

enum class FieldPosition {

}

class CardOnField(
    thisCard: Card,
    position: FieldPosition,

) {
    val yourLeader:Card? = null
    val yourFrontLeft:Card? = null
    val yourFrontRight:Card? = null
    val yourBackLeft:Card? = null
    val yourBackCenter:Card? = null
    val yourBackRight:Card? = null

    val opponentLeader:Card? = null
    val opponentFrontLeft:Card? = null
    val opponentFrontRight:Card? = null
    val opponentBackLeft:Card? = null
    val opponentBackCenter:Card? = null
    val opponentBackRight:Card? = null
}