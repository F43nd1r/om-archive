
solution {
    puzzle = "P067"
    name = "TI (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = -3 to 1
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -2 to -3
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 3 to -4
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 5 to -1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 4 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -5 to 5
        rotation = 3
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = -2
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 9 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 7 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to 1
        rotation = 5
    }
    io(INFINITE) {
        index = 0
        position = 10 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -7
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -7 to 2
        rotation = -4
    }
    io(OUTPUT) {
        index = 1
        position = 6 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(1) {
                wait(8)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(11)
                grab()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
