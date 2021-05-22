
solution {
    puzzle = "P108"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -2 to -5
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -6 to -3
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = -9
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -1 to -3
        rotation = -9
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -8 to 5
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -8 to 2
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -9 to 2
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -9 to 3
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -8 to 1
        rotation = -6
        size = 2
    }
    arm(ARM3) {
        number = 10
        position = -7 to 6
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -3 to 4
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 0 to -3
        rotation = -15
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -5 to 0
        rotation = -6
        size = 3
    }
    glyph(BONDER) {
        position = -7 to 4
        rotation = -7
    }
    glyph(BONDER) {
        position = -6 to 5
        rotation = -7
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -7
    }
    glyph(MULTI_BONDER) {
        position = -3 to 0
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -8 to 3
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -3 to -5
        rotation = -9
    }
    glyph(PROJECTION) {
        position = -2 to -4
        rotation = -17
    }
    glyph(ANIMISMUS) {
        position = -6 to 2
        rotation = -3
    }
    glyph(DISPOSAL) {
        position = -6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to 5
        rotation = -24
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -2 to -6
        rotation = -14
    }
    io(INPUT) {
        index = 2
        position = -3 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(26)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(26)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
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
            sequence(4) {
                grab()
                retract()
                drop()
                extend()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(25)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(29)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(29)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(24)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(29)
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
            }
        }
        , 
        {
            sequence(11) {
                wait(28)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(13) {
                wait(28)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
