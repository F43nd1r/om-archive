
solution {
    puzzle = "P016"
    name = "NEW SOLUTION 10"
    arm(ARM6) {
        number = 1
        position = -8 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -7 to -5
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = -10 to 0
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -14 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -14 to 2
        rotation = -1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -10 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -13 to -3
        rotation = -5
    }
    track {
        position = -13 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
