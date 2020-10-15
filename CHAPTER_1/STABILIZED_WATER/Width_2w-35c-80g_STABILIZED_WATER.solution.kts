
solution {
    puzzle = "P007"
    name = "W2"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                reset()
            }
        }
        )
    }
}
