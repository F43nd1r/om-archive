
solution {
    puzzle = "P085"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -16 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -16 to 3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -17 to 5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -19 to 3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -11 to 0
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -15 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -16 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -14 to -1
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = -11 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -19 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -17 to 2
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
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
        )
    }
}
