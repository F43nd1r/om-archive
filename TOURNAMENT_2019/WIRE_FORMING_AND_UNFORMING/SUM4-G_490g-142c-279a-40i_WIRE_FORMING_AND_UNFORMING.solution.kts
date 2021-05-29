
solution {
    puzzle = "w1698784331"
    name = "B TI40CA 1-2T"
    arm(ARM6) {
        number = 1
        position = -7 to 2
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -4 to 0
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -5 to 6
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -8 to 7
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -9 to 10
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -7 to 10
        rotation = 6
        size = 1
    }
    arm(ARM3) {
        number = 8
        position = -11 to 3
        rotation = -9
        size = 3
    }
    arm(ARM3) {
        number = 9
        position = -15 to 10
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 10
        position = -10 to 3
        rotation = 3
        size = 2
    }
    arm(ARM3) {
        number = 11
        position = -13 to 5
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = -16 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = -16 to 7
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 10
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -12 to 7
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -9 to 8
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to 2
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = -7 to 1
        rotation = -6
    }
    glyph(PROJECTION) {
        position = -8 to 6
        rotation = -4
    }
    io(INFINITE) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 6
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -8 to 3
        rotation = -14
    }
    io(OUTPUT) {
        index = 1
        position = -17 to 5
        rotation = 3
    }
    io(INFINITE) {
        index = 2
        position = -4 to 10
        rotation = 0
    }
    tape {
        parallel(
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
            sequence(10) {
                wait(18)
                grab()
                rotateCounterClockwise()
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
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
