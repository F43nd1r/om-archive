
solution {
    puzzle = "w2450512434"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -5 to 3
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -4 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -4 to 3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -8 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -8 to 5
        rotation = -4
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                grab()
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
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(78)
                grab()
                rotateClockwise()
            }
        }
        )
    }
}
