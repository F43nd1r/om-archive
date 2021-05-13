
solution {
    puzzle = "P037"
    name = "NEW SOLUTION 7"
    arm(ARM6) {
        number = 1
        position = -21 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -23 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -18 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -18 to 3
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -22 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -20 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -20 to -3
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -18 to 1
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = -16 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -23 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -21 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
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
        )
    }
}
