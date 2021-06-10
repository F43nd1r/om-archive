
solution {
    puzzle = "P061"
    name = "3I"
    arm(ARM6) {
        number = 1
        position = 3 to 2
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to -1
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -9 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -12 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -15 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -18 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -21 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -24 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -20 to -7
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -17 to -7
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -14 to -7
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -11 to -7
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -8 to -7
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -5 to -7
        rotation = -7
    }
    glyph(CALCIFICATION) {
        position = -5 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -11 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -14 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -17 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -20 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -23 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -23 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -2 to -1
        rotation = 5
    }
    glyph(DISPOSAL) {
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -19 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = 3 to 2
        positions = listOf(2 to -8, 3 to -8, 3 to -7, 4 to -7, 4 to -6, 4 to -5, 4 to -4, 4 to -3, 3 to -2, 2 to -1, 1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 1, -4 to 2, -5 to 2, -6 to 2, -7 to 2, -8 to 2, -9 to 2, -10 to 2, -11 to 2, -12 to 2, -13 to 2, -14 to 2, -15 to 2, -16 to 2, -17 to 2, -18 to 2, -19 to 2, -20 to 2, -21 to 2, -22 to 2, -23 to 2, -24 to 2, -24 to 1, -25 to 1, -26 to 1, -27 to 1, -28 to 1, -29 to 1, -29 to 0, -30 to 0, -30 to -1, -31 to -1, -31 to -2, -32 to -2, -31 to -3, -30 to -4, -29 to -5, -28 to -6, -27 to -7, -26 to -8, -25 to -8, -24 to -8, -23 to -8, -22 to -8, -21 to -8, -20 to -8, -19 to -8, -18 to -8, -17 to -8, -16 to -8, -15 to -8, -14 to -8, -13 to -8, -12 to -8, -11 to -8, -10 to -8, -9 to -8, -8 to -8, -7 to -8, -6 to -8, -5 to -8, -4 to -8, -3 to -8, -2 to -8, -1 to -8, 0 to -8, 1 to -8)
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
