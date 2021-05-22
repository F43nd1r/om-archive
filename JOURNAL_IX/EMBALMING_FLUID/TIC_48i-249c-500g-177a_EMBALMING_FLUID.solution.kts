
solution {
    puzzle = "P108"
    name = "NO-TRACK (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = -7 to 2
        rotation = -8
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -9 to 7
        rotation = -15
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to -1
        rotation = -10
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -4 to 1
        rotation = -10
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -3 to 8
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -6 to 8
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -7 to 9
        rotation = -7
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -6 to 9
        rotation = -7
        size = 2
    }
    arm(ARM3) {
        number = 9
        position = -7 to 8
        rotation = -7
        size = 2
    }
    arm(ARM3) {
        number = 10
        position = -1 to 7
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 1 to 3
        rotation = -10
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -3 to 0
        rotation = -16
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -5 to 5
        rotation = -13
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 7
        rotation = -8
    }
    glyph(BONDER) {
        position = -1 to 6
        rotation = -8
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = -8
    }
    glyph(MULTI_BONDER) {
        position = -3 to 3
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -5 to 8
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -8 to 3
        rotation = -10
    }
    glyph(PROJECTION) {
        position = -6 to 2
        rotation = -18
    }
    glyph(ANIMISMUS) {
        position = -4 to 6
        rotation = -4
    }
    glyph(DISPOSAL) {
        position = -9 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 10
        rotation = -25
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = -8 to 2
        rotation = -15
    }
    io(INPUT) {
        index = 2
        position = -6 to 3
        rotation = 0
    }
    tape {
        parallel(
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
                reset()
            }
        }
        , 
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
            sequence(13) {
                wait(28)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(23)
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
        )
    }
}
