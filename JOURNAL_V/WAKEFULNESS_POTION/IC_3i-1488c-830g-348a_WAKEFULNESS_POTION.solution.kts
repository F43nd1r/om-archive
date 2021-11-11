
solution {
    puzzle = "P088"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -4 to 9
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -11 to 13
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to 10
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 8
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 5
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 4
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 4
        rotation = -2
    }
    glyph(BONDER) {
        position = 7 to 5
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 7
        rotation = -2
    }
    glyph(BONDER) {
        position = -6 to 10
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 6 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to 7
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to 10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -8 to 13
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -7 to 9
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -5 to 6
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -4 to 6
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = 4 to 6
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 8 to 4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 4
        rotation = 6
    }
    glyph(DISPOSAL) {
        position = 11 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 11
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 11 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -2 to 10
        rotation = 3
    }
    track {
        position = -4 to 11
        positions = listOf(0 to -3, -1 to -3, -2 to -2, -2 to -3, -2 to -4, -3 to -4, -4 to -3, -4 to -2, -5 to -1, -5 to 0, -5 to 1, -4 to 1, -3 to 1, -2 to 1, -1 to 0, 0 to -1, 0 to -2, 1 to -2, 2 to -2, 3 to -2, 4 to -2, 5 to -2, 6 to -2, 6 to -1, 7 to -1, 8 to -1, 9 to -1, 10 to -1, 11 to -1, 12 to -2, 13 to -2, 14 to -2, 15 to -2, 15 to -1, 14 to 0, 13 to 1, 14 to 1, 15 to 0, 16 to -1, 16 to -2, 16 to -3, 17 to -4, 17 to -5, 17 to -6, 17 to -7, 17 to -8, 18 to -9, 18 to -10, 17 to -10, 17 to -9, 16 to -8, 16 to -7, 15 to -6, 14 to -5, 13 to -4, 12 to -3, 11 to -2, 10 to -2, 9 to -2, 8 to -2, 7 to -2, 7 to -3, 7 to -4, 7 to -5, 8 to -6, 7 to -6, 6 to -6, 6 to -7, 6 to -8, 7 to -9, 8 to -10, 9 to -11, 10 to -12, 11 to -12, 11 to -13, 10 to -13, 9 to -13, 8 to -13, 8 to -12, 7 to -11, 6 to -10, 5 to -10, 4 to -9, 4 to -8, 3 to -7, 2 to -6, 1 to -5, 0 to -4)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
            }
        }
        )
    }
}
