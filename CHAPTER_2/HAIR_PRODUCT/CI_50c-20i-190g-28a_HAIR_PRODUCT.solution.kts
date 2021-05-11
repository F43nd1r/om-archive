
solution {
    puzzle = "P016"
    name = "NEW SOLUTION 10"
    arm(ARM1) {
        number = 1
        position = -12 to -3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -13 to -2
        rotation = 5
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = -10 to -1
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = -11 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -9 to -1
        rotation = -3
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
        position = -11 to -2
        rotation = -4
    }
    track {
        position = -11 to 0
        positions = listOf(1 to 0, 0 to 1, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                back()
            }
        }
        )
    }
}
