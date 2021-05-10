
solution {
    puzzle = "P021"
    name = "INSTRUCTIONS 6"
    arm(ARM6) {
        number = 1
        position = -4 to -6
        rotation = 0
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -7 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -2
        rotation = 0
    }
    track {
        position = -4 to -6
        positions = listOf(0 to 0, -1 to 0, -1 to -1, -2 to 0, -3 to 0, -3 to 1, -4 to 1, -4 to 0, -5 to 1, -5 to 2, -4 to 2, -3 to 2, -2 to 1, -1 to 1, -2 to 2, -2 to 3, -1 to 2, -1 to 3, 0 to 2, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
