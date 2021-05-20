
solution {
    puzzle = "P070"
    name = "NO-TRACK"
    arm(ARM2) {
        number = 1
        position = 1 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 5 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 2 to 4
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 5 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 5 to 3
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to 1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 6 to 3
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 2 to 1
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 9
        position = 9 to -2
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 4 to 4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 8 to 1
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = 6 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to 4
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 7 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 5
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 3 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 3 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 7
        rotation = -8
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                extend()
                drop()
                retract()
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
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(9)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
