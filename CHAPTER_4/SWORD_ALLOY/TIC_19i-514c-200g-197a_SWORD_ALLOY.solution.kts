
solution {
    puzzle = "P033"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 1 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 1 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -16 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
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
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
