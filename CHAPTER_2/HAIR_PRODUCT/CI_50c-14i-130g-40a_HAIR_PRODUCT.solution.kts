
solution {
    puzzle = "P016"
    name = "NEW SOLUTION 11"
    arm(ARM6) {
        number = 1
        position = -9 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -12 to -5
        rotation = -6
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = -11 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -11 to -5
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -12 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -9 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -14 to -1
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
