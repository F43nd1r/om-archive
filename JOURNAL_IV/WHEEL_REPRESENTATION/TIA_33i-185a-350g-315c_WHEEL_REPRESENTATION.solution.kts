
solution {
    puzzle = "P070"
    name = "NO-TRACK 2"
    arm(ARM1) {
        number = 1
        position = -3 to 6
        rotation = -15
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -6 to 3
        rotation = -5
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -1 to -1
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 1
        rotation = -8
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 3 to -3
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -1 to 1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 10
        position = 3 to 3
        rotation = -3
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 7 to -1
        rotation = -5
    }
    glyph(CALCIFICATION) {
        position = 6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 3 to 1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 0 to 3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -3 to 0
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 3
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -6 to 6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(5)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(4)
                extendTape()
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
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
