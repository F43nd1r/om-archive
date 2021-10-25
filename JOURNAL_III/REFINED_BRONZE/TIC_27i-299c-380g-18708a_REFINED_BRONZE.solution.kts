
solution {
    puzzle = "P067"
    name = "TI??"
    arm(ARM6) {
        number = 1
        position = -5 to 1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = 0 to -4
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -1 to -2
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -1 to 6
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -4 to 12
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 1 to -2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 0 to -3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -9 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 5 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -6 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = -2
    }
    io(INFINITE) {
        index = 0
        position = 6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 6
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 2 to 6
        rotation = 3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(25)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(25)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(27)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(23)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(25)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(23)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(23)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
