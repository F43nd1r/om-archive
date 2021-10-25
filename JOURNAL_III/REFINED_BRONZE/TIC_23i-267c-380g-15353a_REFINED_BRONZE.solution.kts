
solution {
    puzzle = "P067"
    name = "TI?? (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = 1 to 1
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 9 to -9
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 15 to -12
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = 2 to -1
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 4 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 5 to -2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 4 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 5
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 6 to -9
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 9 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 7 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -10
        rotation = 2
    }
    glyph(PROJECTION) {
        position = 4 to -3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 2 to -3
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = 10 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 9 to -12
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 9 to -6
        rotation = -1
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
                wait(5)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
