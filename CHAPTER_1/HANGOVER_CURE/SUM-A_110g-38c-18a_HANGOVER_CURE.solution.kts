
solution {
    puzzle = "P013"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -3 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -1
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
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
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
