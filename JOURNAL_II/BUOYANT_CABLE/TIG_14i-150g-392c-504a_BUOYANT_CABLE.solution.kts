
solution {
    puzzle = "P062"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = 7 to -4
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = 5 to -4
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 4 to -4
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 8 to -4
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 3 to 0
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = -24 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(28)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(30)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
