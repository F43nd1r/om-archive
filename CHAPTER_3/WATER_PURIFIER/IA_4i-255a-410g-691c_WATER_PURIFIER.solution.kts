
solution {
    puzzle = "P025"
    name = "INSTRUCTIONS 8"
    arm(ARM6) {
        number = 1
        position = -5 to -2
        rotation = -2
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 1
        rotation = 0
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 0, 0 to -1, -1 to 0, -1 to 1, -2 to 1, -2 to 2, -3 to 3, -2 to 3, -2 to 4, -3 to 5, -3 to 6, -2 to 5, -2 to 6, -1 to 5, -1 to 6, 0 to 5, 0 to 6, 1 to 5, 2 to 4, 3 to 4, 2 to 5, 2 to 6, 3 to 6, 4 to 6, 4 to 5, 5 to 5, 5 to 6, 6 to 6, 6 to 5, 7 to 5, 8 to 4, 8 to 5, 9 to 4, 10 to 3, 11 to 3, 11 to 2, 11 to 1, 10 to 1, 11 to 0, 12 to -1, 11 to -1, 10 to 0, 10 to -1, 10 to -2, 9 to -2, 8 to -1, 8 to -2, 7 to -1, 6 to 0, 5 to 0, 5 to -1, 5 to -2, 4 to -1, 3 to -1, 4 to -2, 3 to -2, 2 to -1, 1 to 0)
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
