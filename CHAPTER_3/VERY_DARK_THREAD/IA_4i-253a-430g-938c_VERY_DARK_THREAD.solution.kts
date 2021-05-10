
solution {
    puzzle = "P029"
    name = "INSTRUCTIONS 7"
    arm(ARM6) {
        number = 1
        position = -6 to -5
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -10 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -12 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -9 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -12 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -2
        rotation = 0
    }
    track {
        position = -6 to -5
        positions = listOf(0 to 0, 0 to 1, -1 to 1, -2 to 2, -3 to 2, -2 to 1, -2 to 0, -3 to 1, -4 to 1, -4 to 0, -5 to 0, -6 to 1, -5 to 1, -5 to 2, -6 to 3, -7 to 4, -7 to 3, -7 to 2, -8 to 3, -9 to 4, -9 to 5, -8 to 4, -8 to 5, -9 to 6, -8 to 6, -9 to 7, -8 to 7, -7 to 7, -7 to 8, -6 to 8, -6 to 7, -5 to 7, -5 to 8, -4 to 8, -4 to 7, -3 to 7, -3 to 8, -2 to 8, -3 to 9, -4 to 9, -5 to 9, -6 to 9, -7 to 9, -8 to 9, -8 to 8, -9 to 8, -10 to 8, -10 to 7, -10 to 6, -10 to 5, -10 to 4, -9 to 3, -8 to 2, -7 to 1, -6 to 0, -5 to -1, -4 to -1, -3 to -1, -2 to -1, -1 to -1, -1 to 0, 0 to -1)
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
