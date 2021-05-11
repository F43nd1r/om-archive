
solution {
    puzzle = "P069"
    name = "NEW SOLUTION 9"
    arm(ARM6) {
        number = 1
        position = -13 to -5
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -5
        rotation = 2
    }
    glyph(BONDER) {
        position = -10 to -7
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -5 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to -6
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -11 to -3
        rotation = 2
    }
    glyph(DISPERSION) {
        position = -9 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -9
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -7 to -2
        rotation = -3
    }
    io(OUTPUT) {
        index = 2
        position = -13 to -2
        rotation = -3
    }
    io(OUTPUT) {
        index = 3
        position = -5 to -6
        rotation = -2
    }
    track {
        position = -13 to -3
        positions = listOf(0 to -3, 1 to -4, 2 to -5, 3 to -5, 4 to -5, 5 to -6, 6 to -6, 6 to -5, 7 to -5, 7 to -4, 7 to -3, 7 to -2, 6 to -1, 6 to 0, 5 to 0, 4 to 1, 3 to 1, 4 to 0, 4 to -1, 4 to -2, 3 to -2, 2 to -1, 1 to 0, 0 to 0, 0 to -1, 0 to -2)
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
