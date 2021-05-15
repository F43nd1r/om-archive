
solution {
    puzzle = "P067"
    name = "NO-TRACK"
    arm(ARM2) {
        number = 1
        position = 13 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 18 to -7
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 17 to -7
        rotation = -3
        size = 3
    }
    arm(ARM2) {
        number = 4
        position = 11 to -14
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 17 to -14
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 18 to -16
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 16 to -11
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 8
        position = 12 to -13
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 6 to 1
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 10 to -7
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 8 to -5
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 6 to 0
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 13
        position = 4 to 0
        rotation = 1
        size = 1
    }
    arm(ARM2) {
        number = 14
        position = 9 to -6
        rotation = -4
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = 4 to 1
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -6
    }
    glyph(MULTI_BONDER) {
        position = 15 to -18
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 16 to 2
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = 0 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 15 to -12
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 11 to 5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 8 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 10 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = -8
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 14 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 16 to -9
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = 12 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 17 to -2
        rotation = 5
    }
    io(INFINITE) {
        index = 0
        position = -13 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 11 to -18
        rotation = -5
    }
    io(OUTPUT) {
        index = 1
        position = 12 to -10
        rotation = -6
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(14)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(15)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(16)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
