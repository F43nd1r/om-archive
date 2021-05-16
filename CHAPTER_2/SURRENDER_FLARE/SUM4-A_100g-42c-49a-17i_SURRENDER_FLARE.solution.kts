
solution {
    puzzle = "P022"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
