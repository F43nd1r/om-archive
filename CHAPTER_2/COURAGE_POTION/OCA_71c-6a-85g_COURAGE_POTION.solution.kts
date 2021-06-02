
solution {
    puzzle = "P021"
    name = "OAC"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -4
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
    glyph(CALCIFICATION) {
        position = -2 to 2
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
        position = -2 to 1
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(0 to -1, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
            }
        }
        )
    }
}
