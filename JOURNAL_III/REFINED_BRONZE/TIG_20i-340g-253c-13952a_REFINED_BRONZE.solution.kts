
solution {
    puzzle = "P067"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -9 to 5
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -7 to 3
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to -6
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -1 to -3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -1 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -2 to 3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 4
    }
    glyph(BONDER) {
        position = -10 to 9
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 3 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -8 to 8
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -12 to 8
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -6
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -6 to 2
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -1 to -6
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = 4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -3
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -13 to 6
        rotation = 4
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                extend()
                drop()
                retract()
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
            sequence(3) {
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(5)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        )
    }
}
