
solution {
    puzzle = "P100"
    name = "NEW SOLUTION 11"
    arm(ARM6) {
        number = 1
        position = -12 to -7
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -11 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -11 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -12 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -17 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -18 to -4
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -19 to -5
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -18 to -7
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -18 to -10
        rotation = -7
    }
    glyph(TRIPLEX_BONDER) {
        position = -19 to -8
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -19 to -11
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -9 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -14 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -16 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -18 to -1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -18 to -13
        rotation = 0
    }
    track {
        position = -11 to -7
        positions = listOf(-2 to 0, -3 to 0, -4 to 0, -5 to 0, -5 to -1, -5 to -2, -5 to -3, -5 to -4, -5 to -5, -5 to -6, -5 to -7, -5 to -8, -6 to -8, -7 to -8, -8 to -7, -9 to -6, -9 to -5, -10 to -4, -11 to -3, -11 to -2, -10 to -3, -10 to -2, -11 to -1, -11 to 0, -10 to -1, -10 to 0, -11 to 1, -11 to 2, -10 to 1, -10 to 2, -11 to 3, -11 to 4, -10 to 3, -10 to 4, -11 to 5, -11 to 6, -10 to 5, -10 to 6, -11 to 7, -11 to 8, -10 to 7, -10 to 8, -11 to 9, -11 to 10, -10 to 9, -10 to 10, -11 to 11, -11 to 12, -11 to 13, -10 to 12, -10 to 11, -9 to 10, -9 to 11, -8 to 10, -8 to 9, -7 to 8, -7 to 9, -6 to 9, -6 to 8, -5 to 8, -4 to 8, -3 to 8, -2 to 8, -1 to 8, 0 to 8, 1 to 8, 2 to 8, 3 to 8, 4 to 8, 5 to 8, 6 to 8, 6 to 7, 7 to 6, 8 to 6, 8 to 5, 8 to 4, 8 to 3, 9 to 2, 8 to 2, 9 to 1, 10 to 1, 10 to 0, 10 to -1, 9 to -1, 8 to -1, 7 to -1, 6 to -1, 5 to -1, 4 to 0, 3 to 0, 2 to 0, 3 to -1, 2 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
            }
        }
        )
    }
}
