package com.tmosest.competitiveprogramming.kata.bowling

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@Tag("kata")
@DisplayName("Kata:Bowling Game")
class BowlingGameTest {

    private lateinit var bowlingGame: BowlingGame

    @BeforeEach
    fun `create a new game`() {
        bowlingGame = BowlingGame()
    }

    @Test
    fun `score for a new game should be 0`() {
        assertEquals(0, bowlingGame.score)
    }

    @Test
    fun `the default number of frames should be 10`() {
        assertEquals(10, bowlingGame.frames)
    }

    @Test
    fun `should be able to bowl a number of pins`() {
        bowlingGame.bowl(0)
        assertEquals(0, bowlingGame.score)
    }

    @Test
    fun `should see the score update once pins have been knocked over`() {
        bowlingGame.bowl(1)
        assertEquals(1, bowlingGame.score)
    }

    @Test
    fun `a strike followed by a 7 and 1 should total 26 points`() {
        bowlingGame.bowl(10)
        bowlingGame.bowl(7)
        bowlingGame.bowl(1)
        assertEquals(26, bowlingGame.score)
    }

    /*
    @Test
    fun `all strikes should be 300 points`() {
        for (i in 1..12) {
            bowlingGame.bowl(10)
        }
        assertEquals(300, bowlingGame.score)
    }
    */

    @Test
    fun `the game should start at the first frame`() {
        assertEquals(1, bowlingGame.frame)
    }

    @Test
    fun `knocking down 10 pins at once should increment frame`() {
        bowlingGame.bowl(10)
        assertEquals(2, bowlingGame.frame)
    }

    @Test
    fun `knocking down 20 pins should put us in the third frame`() {
        bowlingGame.bowl(20)
        assertEquals(3, bowlingGame.frame)
    }
}