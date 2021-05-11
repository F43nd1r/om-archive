
solution {
    puzzle = "P040"
    name = "INSTRUCTIONS 2"
    arm(ARM6) {
        number = 1
        position = 17 to 1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 17 to 5
        rotation = 2
    }
    glyph(BONDER) {
        position = 18 to 4
        rotation = 1
    }
    glyph(BONDER) {
        position = 18 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 17 to 3
        rotation = 5
    }
    glyph(BONDER) {
        position = 16 to 5
        rotation = 3
    }
    glyph(BONDER) {
        position = 16 to 3
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 8 to 4
        rotation = -6
    }
    glyph(TRIPLEX_BONDER) {
        position = 9 to 5
        rotation = -7
    }
    glyph(TRIPLEX_BONDER) {
        position = 12 to 6
        rotation = -14
    }
    glyph(CALCIFICATION) {
        position = 16 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 12 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 15 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 11 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 9 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 13 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 17 to 4
        rotation = 0
    }
    track {
        position = 12 to 3
        positions = listOf(5 to -2, 6 to -3, 7 to -3, 7 to -2, 8 to -2, 9 to -2, 9 to -1, 8 to 0, 8 to 1, 8 to 2, 7 to 3, 6 to 3, 5 to 4, 4 to 5, 3 to 5, 3 to 4, 2 to 4, 1 to 4, 1 to 3, 2 to 2, 2 to 1, 2 to 0, 1 to 1, 1 to 0, 0 to 0, -1 to 1, -1 to 0, 0 to -1, 0 to -2, 0 to -3, -1 to -2, -1 to -1, -2 to -1, -3 to -1, -2 to -2, -2 to -3, -3 to -3, -3 to -2, -4 to -1, -5 to -1, -6 to 0, -6 to 1, -7 to 1, -7 to 2, -7 to 3, -6 to 2, -6 to 3, -7 to 4, -7 to 5, -6 to 5, -6 to 4, -5 to 3, -5 to 4, -5 to 5, -6 to 6, -5 to 6, -4 to 5, -3 to 5, -4 to 6, -4 to 7, -3 to 6, -2 to 5, -1 to 5, 0 to 5, 1 to 5, 0 to 6, -1 to 6, -1 to 7, 0 to 7, 1 to 7, 1 to 8, 2 to 8, 2 to 7, 3 to 6, 3 to 7, 3 to 8, 4 to 7, 5 to 7, 5 to 6, 6 to 5, 6 to 4, 7 to 4, 7 to 5, 8 to 4, 9 to 4, 9 to 3, 10 to 2, 10 to 1, 11 to 0, 10 to 0, 10 to -1, 11 to -2, 11 to -3, 11 to -4, 10 to -4, 9 to -4, 10 to -5, 10 to -6, 11 to -6, 11 to -7, 11 to -8, 10 to -8, 10 to -7, 9 to -6, 9 to -7, 8 to -6, 7 to -6, 7 to -5, 7 to -4, 6 to -4, 5 to -3, 5 to -4, 6 to -5, 6 to -6, 5 to -5, 5 to -6, 6 to -7, 5 to -7, 6 to -8, 6 to -9, 5 to -8, 4 to -8, 4 to -9, 4 to -10, 3 to -9, 3 to -8, 3 to -7, 4 to -7, 4 to -6, 4 to -5, 4 to -4, 3 to -3, 3 to -2, 4 to -2)
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
