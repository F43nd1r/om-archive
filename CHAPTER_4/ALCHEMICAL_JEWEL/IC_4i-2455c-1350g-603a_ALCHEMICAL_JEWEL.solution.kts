
solution {
    puzzle = "P035"
    name = "INSTRUCTIONS 6"
    arm(ARM6) {
        number = 1
        position = 0 to 2
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -11 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -12 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = -12 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 0 to 7
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 1 to 3
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 2 to 4
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 5 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 4 to 3
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -8 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to 2
        rotation = 0
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 3, 0 to 3, 1 to 3, 1 to 4, 2 to 4, 3 to 3, 4 to 2, 5 to 2, 6 to 1, 6 to 0, 6 to -1, 7 to -2, 7 to -3, 6 to -3, 5 to -3, 5 to -4, 4 to -4, 3 to -3, 2 to -2, 1 to -2, 0 to -2, -1 to -2, -1 to -3, -1 to -4, -2 to -4, -2 to -5, -3 to -5, -4 to -5, -4 to -6, -5 to -6, -5 to -7, -6 to -7, -7 to -7, -8 to -7, -9 to -7, -10 to -7, -10 to -8, -11 to -7, -12 to -6, -13 to -6, -14 to -5, -14 to -4, -14 to -3, -15 to -2, -15 to -1, -14 to -1, -13 to -1, -13 to 0, -12 to 0, -11 to -1, -11 to -2, -10 to -3, -9 to -3, -8 to -4, -7 to -5, -6 to -6, -6 to -5, -5 to -5, -6 to -4, -7 to -4, -7 to -3, -6 to -3, -7 to -2, -8 to -1, -9 to 0, -10 to 1, -11 to 1, -11 to 0, -12 to 1, -12 to 2, -13 to 2, -14 to 2, -14 to 1, -15 to 1, -14 to 0, -15 to 0, -16 to 0, -17 to 1, -17 to 0, -17 to -1, -16 to -2, -16 to -3, -15 to -3, -15 to -4, -15 to -5, -16 to -5, -15 to -6, -14 to -7, -13 to -7, -12 to -8, -12 to -7, -11 to -8, -10 to -9, -10 to -10, -9 to -10, -9 to -9, -9 to -8, -8 to -9, -7 to -10, -7 to -11, -6 to -11, -6 to -10, -5 to -10, -6 to -9, -5 to -9, -4 to -10, -3 to -10, -4 to -9, -4 to -8, -3 to -9, -3 to -8, -4 to -7, -3 to -7, -2 to -8, -1 to -8, -2 to -7, -2 to -6, -1 to -7, 0 to -7, -1 to -6, 0 to -6, 1 to -7, 1 to -6, 0 to -5, 0 to -4, 1 to -5, 1 to -4, 0 to -3, 1 to -3, 2 to -4, 2 to -5, 2 to -6, 3 to -7, 3 to -6, 4 to -7, 4 to -6, 5 to -6, 6 to -6, 6 to -5, 7 to -5, 8 to -6, 9 to -7, 10 to -7, 9 to -6, 10 to -6, 9 to -5, 9 to -4, 9 to -3, 8 to -2, 8 to -1, 9 to -1, 10 to -1, 10 to 0, 9 to 0, 9 to 1, 8 to 2, 7 to 3, 6 to 3, 5 to 3, 4 to 4, 4 to 5, 4 to 6, 3 to 7, 3 to 6, 2 to 7, 1 to 7, 0 to 7, -1 to 7, -1 to 6, -1 to 5, -2 to 6, -2 to 7, -3 to 7, -3 to 6, -4 to 6, -5 to 7, -5 to 6, -4 to 5, -3 to 4, -2 to 4, -2 to 3, -3 to 3, -3 to 2, -4 to 3, -5 to 3, -4 to 2, -5 to 2, -6 to 3, -7 to 3, -6 to 2, -7 to 2, -8 to 2, -8 to 1, -7 to 1, -7 to 0, -6 to 0, -6 to 1, -5 to 1, -4 to 0, -3 to 0, -3 to 1, -2 to 1, -1 to 1)
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
