
solution {
    puzzle = "P011"
    name = "W2"
    arm(PISTON) {
        number = 1
        position = -2 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -3 to -2
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                retract()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
            }
        }
        )
    }
}
