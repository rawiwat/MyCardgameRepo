package com.example.stickmancardbattle.data_layer.data_structure

import com.example.stickmancardbattle.data_layer.model.Card

class CardInDeck(val card:Card) {
    var next:CardInDeck? = null
    var prev:CardInDeck? = null
}

class Deck {
    var topDeck: CardInDeck? = null
    var bottomDeck: CardInDeck? = null

    private fun isEmpty(): Boolean {
        return topDeck == null
    }

    fun append(card: Card) {
        val newCard = CardInDeck(card)

        if (isEmpty()) {
            topDeck = newCard
            bottomDeck = newCard
        } else {
            newCard.prev = bottomDeck
            bottomDeck?.next = newCard
            bottomDeck = newCard
        }
    }

    fun prepend(card: Card) {
        val newCard = CardInDeck(card)

        if (isEmpty()) {
            topDeck = newCard
            bottomDeck = newCard
        } else {
            newCard.next = topDeck
            topDeck?.prev = newCard
            topDeck = newCard
        }
    }

    fun remove(cardInDeck: CardInDeck?) {
        val prevCard = cardInDeck?.prev
        val nextCard = cardInDeck?.next

        if (prevCard != null) {
            prevCard.next = nextCard
        } else {
            topDeck = nextCard
        }

        if (nextCard != null) {
            nextCard.prev = prevCard
        } else {
            bottomDeck = prevCard
        }
    }

    fun printDeck() {
        var current = topDeck
        while (current != null) {
            print("${current.card.name}, ")
            current = current.next
        }
        println()
    }

    fun shuffleDeck(deck: Deck) {
        val cards = mutableListOf<Card>()
        var current = deck.topDeck

        while (current != null) {
            cards.add(current.card)
            current = current.next
        }

        cards.shuffle()

        deck.topDeck = null
        deck.bottomDeck = null

        for (card in cards) {
            deck.append(card)
        }
    }

    fun search(card: Card): Card? {
        var current = topDeck

        while (current != null) {
            if (current.card.id == card.id) {
                return current.card
            }
            current = current.next
        }
        return null
    }
}