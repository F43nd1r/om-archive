
solution {
    puzzle = "P088"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 5 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 6 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = 4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -4
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 1 to 5
        rotation = -1
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(9)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
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
        )
    }
}
