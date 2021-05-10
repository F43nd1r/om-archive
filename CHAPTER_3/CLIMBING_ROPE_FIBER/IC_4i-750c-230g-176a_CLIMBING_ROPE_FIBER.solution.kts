
solution {
    puzzle = "P027"
    name = "INSTRUCTIONS 11"
    arm(ARM6) {
        number = 1
        position = -13 to 2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -7 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -9 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -9 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -7 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -1
        rotation = 0
    }
    track {
        position = -13 to 2
        positions = listOf(0 to 0, 1 to -1, 1 to -2, 0 to -2, 0 to -3, 1 to -3, 1 to -4, 2 to -5, 3 to -6, 4 to -7, 5 to -8, 6 to -8, 5 to -7, 6 to -7, 7 to -8, 8 to -8, 8 to -9, 7 to -9, 6 to -9, 5 to -9, 4 to -8, 3 to -7, 2 to -6, 1 to -5, 0 to -4, -1 to -3, -1 to -2, -1 to -1, 0 to -1, -1 to 0)
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
