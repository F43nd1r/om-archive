
solution {
    puzzle = "P038"
    name = "NEW SOLUTION 5"
    arm(ARM6) {
        number = 1
        position = -10 to -6
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -12 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -14 to -2
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -15 to -1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -15 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -13 to -1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 7
        position = -7 to -6
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -12 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -12 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -14 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -11 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -15 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
