
solution {
    puzzle = "w1698785238"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -15 to -8
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -12 to -11
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -17 to -7
        rotation = -3
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -18 to -8
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -16 to -6
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -21 to -6
        rotation = 12
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -21 to -5
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -20 to -10
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = -25 to -2
        rotation = -8
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -28 to -5
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -28 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -30 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -29 to 2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -16 to -10
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -20 to -8
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -29 to -2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -25 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -15 to -7
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -14 to -9
        rotation = -7
    }
    io(OUTPUT) {
        index = 0
        position = -21 to -2
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -19 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -19 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -16 to -8
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(31)
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(33)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(32)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(34)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(34)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(36)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(34)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(41)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
