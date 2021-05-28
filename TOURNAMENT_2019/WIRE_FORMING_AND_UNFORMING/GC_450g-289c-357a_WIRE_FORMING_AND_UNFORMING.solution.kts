
solution {
    puzzle = "w1698784331"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM6) {
        number = 1
        position = -11 to -6
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -9 to -5
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -15 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -7 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -16 to -2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -19 to 0
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -21 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -12 to -9
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -19 to -6
        rotation = 8
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -12 to -8
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -14 to -9
        rotation = 6
        size = 3
    }
    glyph(BONDER) {
        position = -13 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -23 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -17 to -9
        rotation = 1
    }
    glyph(BONDER) {
        position = -16 to -10
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -16 to -6
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -17 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -11 to -5
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = -10 to -6
        rotation = -8
    }
    glyph(PROJECTION) {
        position = -15 to -3
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -15 to -2
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = -4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -12 to -6
        rotation = -13
    }
    io(OUTPUT) {
        index = 1
        position = -14 to -13
        rotation = 4
    }
    io(INFINITE) {
        index = 2
        position = -30 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(31)
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
            sequence(6) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(10) {
                wait(18)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(22)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(20)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(24)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
