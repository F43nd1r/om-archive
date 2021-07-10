
solution {
    puzzle = "P021"
    name = "NEW SOLUTION 1"
    arm(ARM3) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 1 to -3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -4 to 4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to 3
        rotation = 0
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -1 to 3
        rotation = 0
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                reset()
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
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
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
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
