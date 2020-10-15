
solution {
    puzzle = "P019"
    name = "W2.5"
    arm(ARM1) {
        number = 1
        position = 1 to 2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to 4
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to 3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to -2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -4 to -3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -2 to -1
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                extend()
                pivotClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                reset()
            }
        }
        )
    }
}
