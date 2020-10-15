
solution {
    puzzle = "P013"
    name = "B CA"
    arm(PISTON) {
        number = 1
        position = 1 to 3
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to 4
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 2 to 2
        rotation = -3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                extend()
                forward()
                reset()
            }
        }
        )
    }
}
