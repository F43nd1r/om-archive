
solution {
    puzzle = "P021"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = -2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
