
solution {
    puzzle = "P065"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -1 to 11
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 11
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to 10
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -5 to 11
        rotation = -7
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -4 to 7
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -7 to 5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -7 to 3
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -6 to 1
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -7 to 1
        rotation = -6
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = -3 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 3 to 1
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 7 to -3
        rotation = -9
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 10
        rotation = -5
    }
    glyph(BONDER) {
        position = -6 to 5
        rotation = -4
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -4
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -6
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = -6
    }
    glyph(BONDER) {
        position = 6 to -6
        rotation = -6
    }
    glyph(MULTI_BONDER) {
        position = -2 to 8
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 12
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -8 to 6
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -6 to 4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 8 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 10
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
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
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(39)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
