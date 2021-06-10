
solution {
    puzzle = "P106"
    name = "3I"
    arm(ARM1) {
        number = 1
        position = -14 to 9
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -6 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -6
        rotation = -3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = -9 to 3
        rotation = -4
    }
    glyph(TRIPLEX_BONDER) {
        position = -11 to 2
        rotation = -5
    }
    glyph(TRIPLEX_BONDER) {
        position = -11 to 0
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -5 to -5
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -9 to 6
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -9 to 4
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -11 to 7
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -10 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -12 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -5 to -6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -6
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -10 to 8
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -6
        rotation = 0
    }
    track {
        position = -14 to 9
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 0 to -3, 0 to -4, 0 to -5, 0 to -6, -1 to -5, -2 to -5, -2 to -6, -2 to -7, -2 to -8, -2 to -9, -1 to -10, 0 to -11, 1 to -12, 2 to -12, 2 to -11, 1 to -10, 1 to -11, 0 to -10, 0 to -9, 1 to -9, 2 to -10, 3 to -11, 4 to -12, 5 to -13, 6 to -14, 7 to -15, 7 to -14, 7 to -13, 7 to -12, 6 to -11, 5 to -11, 5 to -10, 5 to -9, 5 to -8, 5 to -7, 6 to -7, 7 to -7, 8 to -7, 9 to -7, 10 to -7, 11 to -7, 12 to -8, 13 to -9, 13 to -10, 13 to -11, 13 to -12, 12 to -12, 11 to -11, 10 to -10, 10 to -9, 9 to -9, 9 to -10, 10 to -11, 11 to -12, 11 to -13, 12 to -14, 12 to -13, 13 to -13, 14 to -14, 15 to -14, 16 to -14, 16 to -13, 16 to -12, 16 to -11, 16 to -10, 16 to -9, 15 to -8, 14 to -8, 13 to -8, 12 to -7, 11 to -6, 10 to -5, 9 to -4, 8 to -3, 7 to -2, 6 to -1, 5 to 0, 4 to 1, 3 to 1, 2 to 1, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
