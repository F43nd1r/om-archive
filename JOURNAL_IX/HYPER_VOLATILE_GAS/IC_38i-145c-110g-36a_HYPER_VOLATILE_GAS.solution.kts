
solution {
    puzzle = "P106"
    name = "B X S F"
    arm(ARM1) {
        number = 1
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 3
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 1 to 0
        positions = listOf(0 to -1, 0 to 0, -1 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
