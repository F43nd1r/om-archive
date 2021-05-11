
solution {
    puzzle = "P039"
    name = "INSTRUCTIONS 3"
    arm(ARM6) {
        number = 1
        position = -12 to 4
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -7 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -9 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -5 to -3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -10 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to -3
        rotation = 0
    }
    track {
        position = -7 to -6
        positions = listOf(5 to -2, 4 to -2, 3 to -2, 2 to -1, 2 to -2, 1 to -1, 1 to -2, 0 to -1, 0 to 0, -1 to 1, -2 to 1, -2 to 0, -3 to 0, -3 to 1, -4 to 2, -5 to 2, -6 to 3, -5 to 3, -6 to 4, -5 to 4, -6 to 5, -5 to 5, -6 to 6, -5 to 6, -6 to 7, -6 to 8, -5 to 8, -4 to 8, -4 to 7, -3 to 6, -3 to 7, -3 to 8, -3 to 9, -3 to 10, -2 to 10, -2 to 9, -1 to 9, 0 to 8, 0 to 7, 1 to 7, 1 to 8, 2 to 8, 1 to 9, 0 to 9, -1 to 10, -2 to 11, -3 to 11, -4 to 11, -4 to 10, -4 to 9, -5 to 10, -5 to 9, -6 to 9, -7 to 9, -7 to 8, -7 to 7, -7 to 6, -7 to 5, -7 to 4, -7 to 3, -6 to 2, -5 to 1, -4 to 0, -3 to -1, -2 to -1, -1 to -1, 0 to -2, 1 to -3, 2 to -3, 3 to -3, 4 to -3, 5 to -3)
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
