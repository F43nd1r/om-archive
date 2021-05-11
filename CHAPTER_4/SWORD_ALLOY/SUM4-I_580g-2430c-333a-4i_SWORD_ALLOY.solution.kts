
solution {
    puzzle = "P033"
    name = "INSTRUCTIONS 19"
    arm(ARM6) {
        number = 1
        position = -9 to -1
        rotation = 0
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -7 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -5 to -5
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to -6
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -9 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to -6
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -4
        rotation = 0
    }
    track {
        position = 1 to -6
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -2, 0 to -3, -1 to -2, -1 to -3, -2 to -3, -3 to -3, -4 to -3, -5 to -2, -6 to -1, -7 to -1, -7 to 0, -6 to 0, -7 to 1, -8 to 1, -9 to 1, -9 to 0, -8 to -1, -8 to -2, -9 to -2, -10 to -1, -9 to -1, -10 to 0, -11 to 0, -12 to 0, -12 to 1, -13 to 1, -14 to 2, -14 to 3, -13 to 3, -13 to 2, -12 to 2, -12 to 3, -12 to 4, -11 to 4, -12 to 5, -12 to 6, -11 to 5, -10 to 5, -11 to 6, -12 to 7, -12 to 8, -11 to 7, -11 to 8, -12 to 9, -11 to 9, -10 to 8, -9 to 8, -10 to 9, -9 to 9, -10 to 10, -11 to 10, -12 to 10, -13 to 10, -13 to 9, -13 to 8, -13 to 7, -14 to 7, -13 to 6, -13 to 5, -13 to 4, -14 to 4, -15 to 4, -15 to 3, -15 to 2, -14 to 1, -13 to 0, -12 to -1, -11 to -1, -10 to -2, -9 to -3, -8 to -3, -7 to -3, -6 to -3, -5 to -3, -4 to -4, -3 to -4, -2 to -4, -1 to -4, 0 to -4, 1 to -4, 1 to -3, 1 to -2, 0 to -1)
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
