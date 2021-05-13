
solution {
    puzzle = "P038"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -5 to 4
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to 2
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -4 to 1
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -3 to 2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 0 to -3
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to -3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
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
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
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
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
