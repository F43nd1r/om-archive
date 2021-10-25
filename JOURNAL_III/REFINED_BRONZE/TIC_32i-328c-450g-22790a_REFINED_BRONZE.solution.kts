
solution {
    puzzle = "P067"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -10 to -1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -11 to -3
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -12 to -4
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -10 to -7
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -6 to -8
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -6 to -9
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -10 to 4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = -13 to 10
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = -21 to -2
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = -15 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -6 to -7
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to -9
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -8
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -8
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -8
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -25 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -3 to -9
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -11 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -21 to -5
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -21 to 1
        rotation = -2
    }
    glyph(PROJECTION) {
        position = -11 to -1
        rotation = -2
    }
    io(INFINITE) {
        index = 0
        position = 0 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -19 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 4
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = -13 to 4
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(33)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(37)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(39)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(41)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(31)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(33)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(28)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(35)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(35)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
