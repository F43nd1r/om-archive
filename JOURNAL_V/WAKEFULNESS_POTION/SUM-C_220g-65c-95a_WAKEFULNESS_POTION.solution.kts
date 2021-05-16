
solution {
    puzzle = "P088"
    name = "B X S F"
    arm(ARM1) {
        number = 1
        position = -12 to 5
        rotation = 5
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -7 to 1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to 6
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -5 to -2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 5
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = -7 to 4
        rotation = 6
    }
    glyph(BONDER) {
        position = -8 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -7 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -9 to 1
        rotation = 1
    }
    track {
        position = -7 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
