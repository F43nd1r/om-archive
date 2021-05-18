
solution {
    puzzle = "P063"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -12 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -14 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -12 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -8 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -7 to 2
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 0 to -3
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 3 to -9
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to 3
        rotation = -3
    }
    glyph(BONDER) {
        position = -11 to 6
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -11 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -6 to 5
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -13 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -13 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(44)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(34)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(47)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
