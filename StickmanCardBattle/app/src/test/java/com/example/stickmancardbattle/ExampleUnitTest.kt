package com.example.stickmancardbattle

import com.example.stickmancardbattle.data_layer.data_structure.Deck
import com.example.stickmancardbattle.data_layer.model.knight.FootSoldier
import com.example.stickmancardbattle.data_layer.model.knight.ShieldKnight
import com.example.stickmancardbattle.data_layer.model.knight.TheQueen
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_deck() {
        val testDeck = Deck()
        testDeck.append(ShieldKnight())
        testDeck.append(ShieldKnight())
        testDeck.append(ShieldKnight())
        testDeck.append(ShieldKnight())
        testDeck.append(ShieldKnight())
        testDeck.append(FootSoldier())
        testDeck.append(FootSoldier())
        testDeck.append(FootSoldier())
        testDeck.append(FootSoldier())
        testDeck.append(FootSoldier())
        testDeck.append(FootSoldier())
        testDeck.append(TheQueen())

        testDeck.printDeck()
        testDeck.shuffleDeck(testDeck)
        testDeck.printDeck()
    }
}