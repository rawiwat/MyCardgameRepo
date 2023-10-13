package com.example.stickmancardbattle.ui_layer.viewmodel

import android.support.v4.os.IResultReceiver._Parcel
import androidx.lifecycle.ViewModel
import com.example.stickmancardbattle.data_layer.model.Card
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

enum class Turn {
    YOUR_TURN,
    OPPONENT_TURN
}

enum class GameStep {
    STAND_BY_PHASE,
    MAIN_PHASE,
    BATTLE_PHASE,
    END_PHASE
}

open class CardOnFieldViewModel(
    thisCard: Card?
):ViewModel() {
    private val _onClick = MutableStateFlow { }
    val onClick:StateFlow<()->Unit> = _onClick
    fun setOnClick(feature:()->Unit) {
        _onClick.value = feature
    }
}
