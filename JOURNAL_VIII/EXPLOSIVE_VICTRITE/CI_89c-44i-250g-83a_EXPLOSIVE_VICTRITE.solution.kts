
solution {
    puzzle = "P100"
    name = "CI"
    arm(ARM3) {
        number = 1
        position = 1 to 0
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 6 to -1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 6 to 0
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 3 to -3
        rotation = 4
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 6 to -3
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 6 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
                grab()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
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
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
