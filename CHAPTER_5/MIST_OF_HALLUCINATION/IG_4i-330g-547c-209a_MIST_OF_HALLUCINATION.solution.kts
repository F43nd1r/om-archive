
solution {
    puzzle = "P038"
    name = "INSTRUCTIONS 6"
    arm(ARM6) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -5 to -2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -2 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = 1 to 1
        positions = listOf(-1 to 0, 0 to 0, -1 to 1, -2 to 1, -3 to 1, -3 to 2, -4 to 3, -4 to 2, -5 to 2, -6 to 3, -7 to 3, -6 to 2, -6 to 1, -6 to 0, -7 to 1, -7 to 0, -8 to 0, -9 to 1, -10 to 1, -9 to 0, -9 to -1, -10 to -1, -10 to -2, -9 to -2, -9 to -3, -8 to -3, -7 to -4, -7 to -5, -6 to -6, -6 to -5, -6 to -4, -5 to -5, -4 to -5, -3 to -6, -3 to -5, -2 to -5, -1 to -5, 0 to -5, 0 to -4, 1 to -4, 2 to -4, 1 to -3, 0 to -2, 1 to -2, 1 to -1, 0 to -1)
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
