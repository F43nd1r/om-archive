
solution {
    puzzle = "P007"
    name = "NEW SOLUTION 20"
    arm(ARM1) {
        number = 1
        position = -14 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -15 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -15 to -3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -14 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -14 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -16 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -13 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
