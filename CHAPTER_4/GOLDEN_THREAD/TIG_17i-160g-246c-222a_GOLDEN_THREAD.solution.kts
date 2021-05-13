
solution {
    puzzle = "P037"
    name = "NEW SOLUTION 7"
    arm(ARM6) {
        number = 1
        position = -21 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -20 to 4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -19 to 4
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -22 to 5
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -22 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = -24 to 5
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -17 to 1
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -21 to 5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -15 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -22 to 4
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
            sequence(2) {
                wait(3)
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
                rotateClockwise()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
