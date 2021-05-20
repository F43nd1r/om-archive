
solution {
    puzzle = "P068"
    name = "NO-TRACK"
    arm(ARM1) {
        number = 1
        position = -9 to 7
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -8 to 7
        rotation = -7
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -2 to 0
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -2 to -5
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -6 to -5
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to 7
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -2 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -3 to 1
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 9
        position = 3 to -3
        rotation = -10
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 4 to -4
        rotation = -11
        size = 3
    }
    arm(ARM3) {
        number = 11
        position = 0 to 4
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 4
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -2 to 4
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -8 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 2
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(11) {
                wait(8)
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
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
            sequence(8) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
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
        )
    }
}
