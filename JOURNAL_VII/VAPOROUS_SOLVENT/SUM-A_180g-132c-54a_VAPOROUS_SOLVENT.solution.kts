
solution {
    puzzle = "P098"
    name = "B X S"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 3 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to -3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -1
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = -3 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                reset()
            }
        }
        )
    }
}
