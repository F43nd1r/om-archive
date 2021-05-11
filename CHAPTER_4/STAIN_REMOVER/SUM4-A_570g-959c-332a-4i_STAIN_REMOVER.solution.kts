
solution {
    puzzle = "P034"
    name = "INSTRUCTIONS 7"
    arm(ARM6) {
        number = 1
        position = -6 to -4
        rotation = 2
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -13 to -2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -6 to -8
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to -6
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to -9
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -11 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -14 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -1
        rotation = 0
    }
    track {
        position = -14 to 2
        positions = listOf(8 to -6, 8 to -5, 7 to -4, 6 to -3, 5 to -2, 4 to -1, 3 to 0, 2 to 0, 2 to -1, 1 to 0, 0 to 0, 0 to -1, -1 to -1, -2 to 0, -3 to 0, -2 to -1, -3 to -1, -3 to -2, -3 to -3, -2 to -3, -2 to -4, -1 to -5, -1 to -6, 0 to -6, 0 to -5, 1 to -6, 1 to -5, 2 to -6, 2 to -7, 3 to -8, 3 to -7, 4 to -8, 5 to -9, 5 to -10, 6 to -11, 7 to -11, 8 to -12, 9 to -13, 8 to -13, 7 to -13, 6 to -12, 6 to -13, 7 to -14, 8 to -15, 9 to -15, 10 to -15, 11 to -15, 12 to -15, 13 to -15, 13 to -14, 12 to -13, 12 to -12, 11 to -12, 10 to -11, 11 to -11, 12 to -11, 13 to -12, 13 to -11, 14 to -11, 13 to -10, 13 to -9, 12 to -9, 11 to -9, 11 to -8, 12 to -8, 13 to -8, 14 to -8, 14 to -7, 13 to -7, 12 to -6, 13 to -6, 13 to -5, 12 to -5, 11 to -5, 10 to -5, 9 to -5, 10 to -6, 9 to -6, 10 to -7, 9 to -7)
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
