
solution {
    puzzle = "P038"
    name = "B TI23"
    arm(ARM6) {
        number = 1
        position = -8 to 3
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 1
        rotation = 7
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -6 to 3
        rotation = 7
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -1 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 4
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -6 to 1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -5 to 1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 4
        rotation = 3
    }
    glyph(BONDER) {
        position = -7 to 4
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -2 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -9 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 8
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
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
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
