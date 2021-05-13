
solution {
    puzzle = "P037"
    name = "NEW SOLUTION 6"
    arm(ARM6) {
        number = 1
        position = -10 to -3
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -14 to -3
        rotation = 2
        size = 3
    }
    arm(ARM2) {
        number = 3
        position = -8 to -6
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -13 to -1
        rotation = 2
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = -7 to -4
        rotation = 9
        size = 2
    }
    glyph(BONDER) {
        position = -11 to -3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -8 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -13 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
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
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
