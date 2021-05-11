
solution {
    puzzle = "P016"
    name = "B CIG 1-2T I14"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 2 to -1
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to -3
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
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
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
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
        )
    }
}
