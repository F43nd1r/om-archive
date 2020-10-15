
solution {
    puzzle = "P017"
    name = "B X S"
    arm(ARM6) {
        number = 1
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
