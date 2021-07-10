
solution {
    puzzle = "P021"
    name = "NEW SOLUTION 5"
    arm(ARM6) {
        number = 1
        position = -4 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to 3
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -1 to 3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 1 to 2
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -4 to 4
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
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
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
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
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
