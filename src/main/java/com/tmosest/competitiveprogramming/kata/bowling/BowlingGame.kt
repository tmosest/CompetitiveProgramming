package com.tmosest.competitiveprogramming.kata.bowling

class BowlingGame {
    // Change this to change the total number of frames.
    val frames = 10
    // Private value that can be updated as the score.
    private var cachedScore = 0
    val score : Int
        get() {
            cachedScore = 0
            var wasStrike = 0
            for (score in scores) {
                cachedScore += score
                if (score > 0 && wasStrike > 0) {
                    wasStrike--
                    cachedScore += score
                }
                if (score == 10) {
                    wasStrike += 2
                }
            }
            return cachedScore
        }
    // Way to keep up with the current frame.
    val frame : Int
        get() = (cachedScore + 10) / 10
    // Scores
    private var scoreIndex = 0
    private val scores = Array(frames * 2 + 1) { 0 }

    /**
     * bowl down a number of pins.
     * @param pins {Int} the number of pins we just knocked down.
     */
    fun bowl(pins: Int) {
        cachedScore += pins
        scores[scoreIndex++] = pins
        if (pins == 10 && scoreIndex / 2 < 9) {
            scoreIndex++
        }
    }
}